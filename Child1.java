class Parent 
{  
	 public static void main(String args[]) 
 {    
	 System.out.println("Parent-main() invoked");   
 }   
}
 
 class Child1 
 {    
	 public static void main(String args[])  
	 {    
		 String s[]={}; 
		 System.out.println("Child-main() invoked"); 
		 Parent.main(s);  
	 }   
} 