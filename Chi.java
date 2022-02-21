class Display
{
	void disp(char c)
	{
		System.out.println(c);
	}
	void disp(char c,int num)
	{
		System.out.println(c+" "+num); 
	}
}
class sample
{
	public static void main(String args[])
	{
		Display obj=new Display();
		obj.disp('a');
		obj.disp('a',10);
	}
}