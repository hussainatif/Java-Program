class Parent
{
	int x=10;
}
class Child extends Parent
{
	int y=20;
	public static void main(String[] args) 
	{
		Parent p=new Child();
		System.out.println(p.x);
		System.out.println(p.y);
	}
}
