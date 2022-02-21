interface InterfaceD{
	public void method1(int len,int bre);
}

interface InterfaceE extends InterfaceD{
	public void method2(double rad);
}

class ClassA{
	public void ClassAMethod(){
		System.out.println("This Method is in class A.");
	}
}

class ClassB extends ClassA implements InterfaceE{
	public void ClassBMethod(){
		System.out.println("This Method is in class B.");
	}
	int l,b,area1;
	public void method1(int len,int bre){
		l=len;
		b=bre;
		area1=l*b;
		System.out.println("Area of rectangle from InterfaceD:"+area1);
	}
	double r,area2;
	
	public void method2(double rad){
		r=rad;
		area2=3.14*r*r;
		System.out.println("Area of circle from InterfaceE:"+area2);
	}
}

class ClassC2 extends ClassB{
	public void ClassCMethod(){
		System.out.println("This Method is in class C.");
	}
	public static void main(String[] args) {
		ClassC2 obj=new ClassC2();
		obj.ClassAMethod();
		obj.ClassBMethod();
		obj.ClassCMethod();
		obj.method1(10,20);
		obj.method2(10);
	}
}
