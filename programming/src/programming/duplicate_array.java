package programming;

import java.util.HashMap;
import java.util.Map;

public class duplicate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] arr= {1,2,6,8,3,3,8};
 HashMap<Integer,Integer> p=new HashMap();
 for(int i=0;i<arr.length;i++) {
	 
	 if(p.containsKey(arr[i])) {
		 Integer value=p.get(arr[i]);
		 p.put(arr[i],value+1);
		 
		 
	 }
	 else {
		 p.put(arr[i], 0);
		 
	 }
	 
 }
 for (Map.Entry<Integer,Integer> entry : p.entrySet()) {
	 if((entry.getValue()==0)) {
		 System.out.println(entry.getKey());
	 }
 }
 
 
 	
 
 
 
 
 
	}

}
