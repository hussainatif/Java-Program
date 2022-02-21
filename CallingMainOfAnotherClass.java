class B 
{  
 public static void main(String args[]) 
 {    
	 System.out.println("B-main() method invoked");   
 }   
 }
 
 class CallingMainOfAnotherClass 
 {    
	 public static void main(String args[])  
	 {    
		 String s[]={}; 
		 System.out.println("CallingMainOfAnotherClass-main() method invoked"); 
		 B.main(s);  
	}   } 