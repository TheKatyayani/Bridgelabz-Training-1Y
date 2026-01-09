public class Demo1{
static int x;
int y;
public static void m2 () {
   int y=30;
   System.out.println(y);
   }
   
public static void m1() {
  int y = 10;
  System.out.println(y);
  m2();
}

public static void main(String[] args){
  int y= 19;
  System.out.println("kirti");
  System.out.println(x);
  System.out.println(y);
  m1();
  Demo1 obj = new Demo1();
  System.out.println(obj.y);
  }
}