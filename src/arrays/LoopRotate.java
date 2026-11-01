package arrays;

import java.util.Arrays;

public class LoopRotate {
	public int[] rotate(int[] a,int count){
		for(int j=0;j<count;j++){
		int tem=a[0];
		for(int i=0;i<a.length;i++) {
	        if(i==a.length-1)
	        	a[i]=tem;
	        else
	        	 a[i]=a[i+1];
		}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8};
		LoopRotate l=new LoopRotate();
		System.out.println(Arrays.toString(l.rotate(array, 6)));
	}

}
