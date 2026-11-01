package mock_test;

import java.util.Arrays;

public class Array1 {
   public static boolean isPrime(int x ) {

		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
    public static void main(String[] args) {
    	int[] arr= {23,65,73,21,14,13,91,37};
    	int count=0;
    	for(int a:arr) {
			 if(isPrime(a)) count++;
		 }
    	
    	if(count>1) {
    		int[] copy=new int[count];
    		for(int a:arr) {
   			 if(isPrime(a)) copy[--count]=a;
   		    }
    		for(int i=0;i<arr.length;i++) {
    			if(isPrime(arr[i]))arr[i]=copy[count++];
    		}
    	}
    	System.out.println(Arrays.toString(arr));
	}
}
