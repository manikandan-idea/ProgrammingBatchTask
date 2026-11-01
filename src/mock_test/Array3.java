package mock_test;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
		int[] arr= {-9,-8,3,23,-7,12,-34,-45,34};
		Arrays.sort(arr);
		int[] a=new int[arr.length];
		int front=0;
		int back=arr.length-1;
		for(int i=0;i<a.length;i++) {
			if(i%2==0)
				a[i]=arr[front++];
			else
				a[i]=arr[back--];
		}
		System.out.println(Arrays.toString(a));
	}
}
