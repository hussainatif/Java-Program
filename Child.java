class Address
{
	String city,state,country;
	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
class Emp
{
	int id;
	String name;
	Address address;

	Emp(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String atif[])
	{
		Address address1=new Address("SouthDelhi", "Delhi", "India");
		Emp e=new Emp(111,"Javed",address1);
		e.display();
	}
}