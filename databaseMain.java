import java.util.Scanner;
class student
	{
		
			String name;
			int roll;
			String stream;
			int year;
			int age;
			String gender; 
			String state;
	
			student()
			{
				name = "";
				roll = 0;
				stream = "";
				int year=0;
				int age=0;
				gender= "";
				state="";
			}

			student(String n1,int r1, String s1,int y1,int a1,String g1,String s2 )
			{
				name=n1;
				roll=r1;
				stream=s1;
				year=y1;
				age=a1;
				gender=g1;
				state=s2;
			}

			void input()
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("\tEnter name of student: ");
				String name=sc.nextLine();
				System.out.print("\tEnter roll of student: ");
				int roll=sc.nextInt();
				System.out.print("\tEnter stream of student: "); 
				String stream=sc.next();
				System.out.print("\tEnter year of student: ");
				int year=sc.nextInt();
				System.out.print("\tEnter gender of student: "); 
				String gender=sc.next();
				System.out.print("\tEnter age of student: "); 
				int age=sc.nextInt();
				System.out.print("\tEnter state of student: "); 
				String state=sc.next();
			}

			void display()
			{
				 System.out.println("\n\t\t***DETAILS OF THE STUDENT ARE AS FOLLOW***");
				 System.out.println("\n\t\tName : "+name);
				 System.out.println("\t\tRoll No : "+roll);
				 System.out.println("\t\tStream : "+stream);
				 System.out.println("\t\tAge : "+age);
				 System.out.println("\t\tYear : "+year);
				 System.out.println("\t\tGender : "+gender);
				 System.out.println("\t\tState : "+state);
			}

			void update()
			{
				Scanner sc=new Scanner(System.in);
				
				System.out.println("\n\t\t***WHAT DO YOU WANT UPDATE, CHOOSE AN OPTION*** ");
				System.out.println("\t1. Name of student: ");
				System.out.println("\t2. Roll No. of student: ");
				System.out.println("\t3. Stream of student: ");
				System.out.println("\t4. Age of student: ");
				System.out.println("\t5. Year of student: ");
				System.out.println("\t6. Gender of student: ");
				System.out.println("\t7. State of student: ");
				System.out.println("\t8. Exit");
				System.out.println("Please enter your option: ");
				int option=sc.nextInt();

				switch(option)
					{
						case 1:
							{
								System.out.println("\t\tEnter new name of student: ");
								String name=sc.next();
								break;
							}
						case 2:
							{
								System.out.println("\t\tEnter new roll no of student: ");
								int roll=sc.nextInt();
								break;
							}
						case 3:
							{
								System.out.println("\t\tEnter new stream of student: ");
								String stream=sc.next();
								break;
							}
						case 4:
							{
								System.out.println("\t\tEnter new age of student: ");
								int age=sc.nextInt();
								break;
							}
						case 5:
							{
								System.out.println("\t\tEnter new year of student: ");
								int year=sc.nextInt();
								break;
							}
						case 6:
							{
								System.out.println("\t\tEnter new gender of student: ");
								String gender=sc.next();
								break;
							}
						case 7:
							{
								System.out.println("\t\tEnter new state of student: ");
								String state=sc.next();
								break;
							}
						case 8:
							{
								System.out.println("\tSuccessfully Exited: ");
								break;
							}
						default:
							System.out.println("\tWrong input, Please choose correct option");

				}
		}
}


class databaseMain
	{
		public static void main(String args[])
			{
			 Scanner sc=new Scanner(System.in);
				student[] obj=new student[10];
				obj[0]=new student("Atif",1,"IT",20,2,"Male","Bihar");
				obj[1]=new student("Ram",2,"CS",21,3,"Male","UP");
				obj[2]=new student("Golu",3,"EIE",18,1,"Male","West Bengal");
				obj[3]=new student("Sonu",4,"CE",22,4,"Male","Delhi");
				obj[4]=new student("Munni",5,"ME",19,2,"Female","Bihar");
	
				for(int i = 5; i < 10; i++)
				obj[i] = null;

		int i = 0,choice;
	do
		{
			System.out.println("\n\t\t***CHOOSE AN OPTION***");
			System.out.println("\n\t1. Input new student detail: ");
			System.out.println("\t2. Delete any old student detail: ");
			System.out.println("\t3. Display any student detail: ");
			System.out.println("\t4. Update any student details: ");
			System.out.println("\t5. Exit");
			System.out.print("\n\tWhat do you want, please enter: ");
			choice=sc.nextInt();
			switch(choice)
				{
					case 1:
						{
							obj[i] = new student();
							obj[i].input();
							i++;
							System.out.println("\n---STUDENT DETAILS INPUTED SUCCESSFULLY---");
							break;
						}
					case 2:
						{
							System.out.print("\tEnter roll no of student for deletion: ");
							int r=sc.nextInt();
							boolean flag1 = false;
							for(int j = 0; obj[j] != null; j++)
								{
									if(obj[j].roll == r)
										{
											flag1 = true;
											obj[j] = null;
											System.out.println("\n\t---ROLL NO. DELETED SUCESSFULLY!---");
											break;
										}
								}
							if(!flag1)
								System.out.println("\n\tSorry, Roll No. Not Found! Try Again");
								break;
						}
				case 3:
					{
						System.out.println("\tEnter roll no of student for display details: ");
						int r1=sc.nextInt();
						boolean flag2 = false;
						for(int j = 0; obj[j] != null; j++)
							{
								if(obj[j].roll == r1)
									{
										flag2 = true;
										obj[j].display();
										System.out.println("\n\t---DETAILS DISPLAYED SUCESSFULLY!---");
										break;
									}
							}
								if(!flag2)
									System.out.println("\n\tRoll No. Not Found!");
									break;
					}
				case 4:
					{
						
						System.out.print("\tEnter roll no of student for update details: ");
						int r2=sc.nextInt();
						for(int j = 0; obj[j] != null; j++)
							{
								if(obj[j].roll == r2)
									{
										obj[j].update();
										System.out.println("---DETAILS UPDATED SUCCESSFULLY---");
										break;
									}
							}
						break;
					}
				case 5:
					{
					System.out.println("\tSuccessfully Exited: ");
					break;
					}
			
				default:
					{
					System.out.println("Please enter correct input...");
					}
				}
			
	}while(choice!=5);
	
			}
	}

			
