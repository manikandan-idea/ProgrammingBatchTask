package string;

import java.util.Arrays;

public class Sort {
	public int[] numberSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int tem=a[i];
					a[i]=a[j];
					a[j]=tem;
					}
					
			}
		}
		return a;
	}
    public static void main(String[] args) {
		int[] arr= {1,4,267,4,34,25,46,78,65,44,346,332,667,9};
		Sort s=new Sort();
		System.out.println(Arrays.toString(s.numberSort(arr)));
	}
}
