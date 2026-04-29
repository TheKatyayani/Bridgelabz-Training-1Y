class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String location,
                          double distance, double expected, double actual) {
        super(id, location, distance, expected, actual);
    }

    @Override
    public boolean isCritical() {
        return false;
    }

    @Override
    public String getType() {
        return "RestCheckpoint";
    }

    @Override
    public double calculatePenalty() {
        double delay = actualDuration - expectedDuration;
        if (delay > 30) {
            return delay * 0.5;
        }
        return 0;
    }
}