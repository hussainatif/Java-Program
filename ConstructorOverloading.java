class ConstructorOverloading
{
	int sid;
	String name;
	int cl;
	ConstructorOverloading(int i,String n){
		sid=i;
		name=n;
	}
	ConstructorOverloading(int i,String n,int c){
		sid=i;
		name=n;
		cl=c;
	}
	void display()
	{
		System.out.println("Sid:"+" "+sid+" "+"Name:"+" "+name+" "+"Class:"+" "+cl);
	}
	public static void main(String args[])
	{
		ConstructorOverloading obj1=new ConstructorOverloading(1,"Atif");
		ConstructorOverloading obj2=new ConstructorOverloading(2,"Faizy",11);
		obj1.display();
		obj2.display();
	}
	
}