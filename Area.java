import java.lang.*;
import java.util.Scanner;
class Area
{
	public static void main(String args[])
	{
		int a,b,c;
		double r1,r2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first side of a triangle: ");
		a=in.nextInt();
		System.out.println("Enter second side of a triangle: ");
		b=in.nextInt();
		System.out.println("Enter third side of a triangle: ");
		c=in.nextInt();
		r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("Roots of the equation is "+ r1+" and " +r2);
	}
} 