class BaseClass1  
	{    
		public void methodToOverride()  //Base class method    
		{         
			System.out.println ("I'm the method of BaseClass");   
		} 
	} 
		
class DerivedClass1 extends BaseClass1 
	{      
		int a=10;     
		public void methodToOverride()  //Derived Class method     
		{          
			System.out.println ("I'm the method of DerivedClass");     
		} 
		public static void main (String args []) 
			{   
				DerivedClass1 obj1 = new DerivedClass1();  
				obj1.methodToOverride();  
				System.out.println(obj1.a); 
			} 
	} 