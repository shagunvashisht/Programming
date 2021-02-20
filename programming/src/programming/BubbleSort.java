package programming;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,8,6,2,4};
for(int k=0;k<arr.length-1;k++) {
	for(int j=0;j<arr.length-1;j++) {
		if(arr[j]>arr[j+1]) {
			arr[j]=arr[j]+arr[j+1];
			arr[j+1]=arr[j]-arr[j+1];
			arr[j]=arr[j]-arr[j+1];
		}
	}
	
}
for(int l=0;l<arr.length;l++) {
System.out.print(arr[l]);
	}}

}
