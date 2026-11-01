package arrays;

import java.util.Arrays;

public class RotateArray {
	public int[] rotateClockWise(int[] a) {
		int tem=a[0];
		for(int i=0;i<a.length;i++) {
	        if(i==a.length-1)
	        	a[i]=tem;
	        else
	        	 a[i]=a[i+1];
		}
		return a;
	}
	
	public int[] rotateAntiClockWise(int[] a) {
		int tem=a[a.length-1];
		for(int i=a.length-1;i>=0;i--) {
	        if(i==0)
	        	a[i]=tem;
	        else
	        	 a[i]=a[i-1];
		}
		return a;
	}
	
	public void print(int[] a) {
		System.out.println(Arrays.toString(a));
	}
    public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		RotateArray ra=new RotateArray();
	    ra.print(ra.rotateClockWise(arr));
	    ra.print(ra.rotateAntiClockWise(arr));
	} 
}
