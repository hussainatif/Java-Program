import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
		int[][] arr=new int[4][];
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
			arr[i]=new int[i+1];
				for(int j=0;j<=i;j++)
					{
						System.out.print("Enter data for row "+(i+1)+ " & column " + (j+1)+": " );
						arr[i][j]=in.nextInt();
						System.out.println();
					}
		}
		System.out.println("  ---Pattern are as follow:---");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(j<=i)
				{
					System.out.print(" "+arr[i][j]+ " ");
				}
			}
			System.out.println();
		}
	}
}