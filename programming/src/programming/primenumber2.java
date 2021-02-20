package programming;
//import java.util.Scanner;

public class primenumber2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner s= new Scanner(System.in);
//System.out.println("Enter the number");
//int num=s.nextInt();
	
 int num=4; 
 int t=0;
 for(int i=2;i<=num-1;i++)
 {
 if(num%2==0) {
	 t=t+1;
	  }
 }
 
 if(t>0) {
	 System.out.println("no. is not prime");
 }
 else {
	System.out.println("no is prime");
}
	}
	

}
