package programming;

public class A {
void show() {
	System.out.println("hi");
}
}
class B extends A{
	void sim() {
		System.out.println("bye");
	}
	public static void main (String[] args) {
		// A d =new B();//upcasting
		// d.show(); //hi
		 
//A a=new A();
//a.show();//hi
		
		
	//	A a=new A();
	//	a.sim();//error
		
		
		//B a= new A();
		//a.show();//error
		
		B b=new B();
		b.sim();//bye
		b.show();// hi
}
}