package arrays;

public class ElementGame {
	public void printElement(int[] arr) {
		 for(int a:arr) {
			 System.out.println(a);
		 }
	}
	public void printevenElement(int[] arr) {
		 for(int a:arr) {
			 if(a%2==0)System.out.println(a);
		 }
	}
	public void printevenIndexElement(String s) {
		 for(int i=0;i<s.length();i++ ) {
			 if(i%2==0)System.out.println(s.charAt(i));
		 }
	}
	public void printevenIndexElement(int[] arr) {
		 for(int i=0;i<arr.length;i++ ) {
			 if(i%2==0)System.out.println(arr[i]);
		 }
	}
    public static void main(String[] args) {
		ElementGame eg=new ElementGame();
		int[] c= {4,5,3,5,3,65,6,4};
		//eg.printElement(c);
		//eg.printevenElement(c);
		eg.printevenIndexElement(c);
		eg.printevenIndexElement("fhddhfuid");
	}
}
