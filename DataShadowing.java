class DataShadowing 
	{  
		int size=7;  
		void changeInt(int size)
		{   
			size=size+10; 
			System.out.println("Size in chageInt is"+ size);  
		} 
			public static void main(String[] args) 
		{ 
				DataShadowing d=new DataShadowing(); 
				System.out.println("Size in Main is"+ d.size); 
				d.changeInt();   
				System.out.println("Size in After chageInt is"+ d.size); 
				} 
 
} 
