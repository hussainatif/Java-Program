class Cons
{
	int x;
	int y;
	Cons(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}
	Cons(Cons z)
	{
		x=z.x;
		y=z.y;
	}
	public static void main(String args[])
	{
		Cons c1=new Cons(20,30);
		c1.show();
		Cons c2=new Cons(c1);
		c2.show();
	}
}