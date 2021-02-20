package programming;

public class memberInnerClass {
 void show() {
	 System.out.println("hello");
 }
  public class c{
	  void show() {
		 System.out.println("telloz");
	 }
 }
  
 public class d extends memberInnerClass{
	  void sim() {
		  System.out.println("helloooooooi");
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//member class show method to call
		/*memberInnerClass obj= new memberInnerClass();
		memberInnerClass.c obj1 =obj.new c();//using the object of outerclass to create inner class objects
		obj1.show();*/
		//memberInnerClass D=new d();
		//D.sim();
		 
		
	}

}
