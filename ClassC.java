interface InterfaceA{
	public void method(int len,int bre);
}

class ClassB implements InterfaceA{
	int l,b,area;
	
	public void method(int len,int bre){
		l=len;
		b=bre;
		area=l*b;
		System.out.println("Area of rectangle is:"+area);
	}

}
class ClassC extends ClassB{
		public static void main(String[] args) {
		ClassC obj=new ClassC();
		obj.method(10,20);
	}
}
