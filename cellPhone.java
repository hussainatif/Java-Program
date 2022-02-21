class phone
{
	void Ring()
		{
			System.out.println("Ringing");
		}
		void Vibrate()
		{
			System.out.println("Vibrating");
		}
		void send()
		{
			System.out.println("Sending Message");
		}
}
class cellPhone 
{
	public static void main(String[] args) 
	{
		phone obj=new phone();
		obj.Ring();
		obj.Vibrate();
		obj.send();
	}
}
