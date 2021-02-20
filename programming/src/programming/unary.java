package programming;

public class unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=10;  
	//	int b=10;  
		/*System.out.println(a++ + ++a);
		System.out.println(a++ + ++b);//10+11=21  
	
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);*/
		//System.out.println(-a>>2);//divide shift right
		//System.out.println(a<<2);//divide shift left
		int a=5;  
		short b=10;  
		//a+=b;//a=a+b internally so fine  
		a=a+b;//Compile time error because 10+10=20 now int  
		System.out.println(a);

	}

}
