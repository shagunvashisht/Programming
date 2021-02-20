package programming;

public class primenumber {
	
 public static boolean isprime(int num) {
	 
	 if(num<2) {
		return false;
	 }
	
	 for(int i=2;i<num;i++) {
		 if(num%i==0) {	
			 return false;
		 }}
		 return true;}
 
		 public static void getnumber(int num) {
			 for(int i=2;i<num;i++) {
	 if(isprime(i)) 
		 System.out.print(i+"");
	 
 }}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println(isprime(8));

getnumber(20);
	}

}
