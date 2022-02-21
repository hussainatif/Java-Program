class Parent  {  int x=10; } class Child2 extends Parent {  int x=40;  void show()  {   System.out.println(x);  } 
 
 public static void main(String[] args)   {   Child2 c2=new Child2();   c2.show();  } } 