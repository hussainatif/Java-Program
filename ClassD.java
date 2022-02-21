interface InterfaceA{
	public void InterfacemethodA();
}

interface InterfaceB{
	public void InterfacemethodB();
}

interface InterfaceC extends InterfaceA,InterfaceB{
	public void InterfacemethodC();
}

class ClassD implements InterfaceC{
	public void InterfacemethodA(){
		System.out.println("This Method Is Declared In Interface A");
	}
	public void InterfacemethodB(){
		System.out.println("This Method Is Declared In Interface B");
	}
	public void InterfacemethodC(){
		System.out.println("This Method Is Declared In Interface C");
	}
	public void ClassMethod(){
		System.out.println("This Method Is Defined in Class D");
	}
	public static void main(String[] args) {
		ClassD obj=new ClassD();
		obj.InterfacemethodA();
		obj.InterfacemethodB();
		obj.InterfacemethodC();
		obj.ClassMethod();
	}
}
