import java.util.*;
class CGPA 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter C marks: ");
		double C=sc.nextDouble();
		System.out.println("Enter C++ marks: ");
		double Cplusplus=sc.nextDouble();
		System.out.println("Enter Java marks: ");
		double Java=sc.nextDouble();

		double gradeC=C/10;
		double gradeCplusplus=Cplusplus/10;
		double gradeJava=Java/10;

		double cgpa=((gradeC) + (gradeCplusplus) + (gradeJava))/3.0;
		System.out.print("CGPA of the student's is: "+String.format("%.2f", cgpa));
		
	}
}
