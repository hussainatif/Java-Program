import java.util.Scanner;
class Cube 
         { 
             int a,vol; 
             Cube() 
              { 
                 System.out.print("Enter the side of cube:"); 
				 Scanner in=new Scanner(System.in);
				 a=in.nextInt();
				
              } 
                 void volume() 
                  { 
                     vol=a*a*a; 
                     System.out.println("Volume of Cube of side" +" "+a +" "+"is" +" :" +vol); 
                  } 
         
                     public static void main(String[] args) 
                       { 
                           Cube c = new Cube(); 
                           c.volume(); 
                       } 
                } 