import java.util.Scanner;
class AA
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int ans=n1+n2;
		System.out.println("The addition of "+n1+" and "+n2+" is: "+ans);
	}
}