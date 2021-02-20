package programming;

import java.util.HashSet;
import java.util.Iterator;

public class Dup_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
		int arr[]= {1,2,3,4,3,4,2,3};
		HashSet s= new HashSet();
	
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					s.add(arr[i]);
					
					
			//		System.out.println("element is" +arr[i]);
					
				}
				
			}
		
		}
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//System.out.println(count);
	
		
		
	}
	

}
