package programming;
 interface Test1 {
	 int x = 21; 
	    void getAge(); 
	} 
public class AnonymousDemo {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
		 // is created. 
        Test1 oj1 = new Test1() { 
            @Override
            public void getAge() { 
                 // printing  age 
                System.out.print("Age is "+x); 
            } 
        }; 
        oj1.getAge(); 
    
	}

}
