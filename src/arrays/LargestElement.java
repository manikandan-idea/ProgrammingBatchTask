package arrays;

import java.util.Arrays;

public class LargestElement {
	public  int largeElement(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	public  int smallElement(int[] a) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	public  int nthLargeElement(int ele,int[] a) {
		
		for(int j=0;j<a.length-1;j++) {
			  int tem=a[j];
			  int dummy=j;
		    for(int i=j;i<a.length;i++) {
			    if(a[j]<a[i]) {
				     tem=a[i];
				     dummy=i;
			    }			
			}
		      a[dummy]=a[j];
		      a[j]=tem;
		    if(j==ele-1) {
			    return a[j];
		    }
		}
		return a[a.length-1];
	}

		public  int evenLargeElement(int[] a) {
			int max=a[0];
			for(int i=1;i<a.length;i++) {
				if(max<a[i]&&a[i]%2==0) {
					max=a[i];
				}
			}
			return max;
		}
	public  long nthLargeElement(int ele,long[] a) {
		Arrays.sort(a);
		return a[a.length-ele];
	}

	public static void main(String[] args) {
		int[] arr= {11,12,13,14,15,16,17,18,19};
		long[] larr= {11,12,13,14,77777777777777l,15,16,17,18,19};
		LargestElement l=new LargestElement();
		//System.out.println(l.evenLargeElement(arr));
		System.out.println(l.nthLargeElement(1, larr));
	
	}

}
