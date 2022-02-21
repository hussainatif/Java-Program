class A1
{
	A1()
	{
		System.out.println("A1");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("B1");
	}
	{
		System.out.println("This is init");
	}
}
class C1 extends B1
{
	C1()
	{
		System.out.println("C1");
	}
	C1(int x)
	{
		System.out.println(x);
	}
	public static void main(String atif[])
	{
		new C1();
		new C1(10);
	}
}