package programming;

public class StaticInC {
 void show() {
	 System.out.println("heelo");
 }
 static class t{
	 void show() {
		 System.out.println("zello");
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInC.t obj = new StaticInC.t();
				obj.show();
	}

}


