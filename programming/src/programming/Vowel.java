package programming;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse a string
 String str="Shagun";
 String[] s=str.split("");
 int count=0;
 for(int i=s.length-1;i>=0;i--) {
         //  System.out.print(s[i]);
         /*  if(s[i].equals("a") || s[i].equals("u")){
        	   count++;
           }*/
	 if(!s[i].equals("a") && !s[i].equals("u")){
  	   count++;
     }
          
	  }
 System.out.println(count);//duplicatealphabetinString
 
/*System.out.println("Find sqr");
 System.out.println(Math.sqrt(625));*/
	}

}
