package arrays;

import java.util.Arrays;

public class NumberProgram {
	public void findFibanacci(int[] a) {
		for(int i=0;i<a.length;i++) {
			int n=1;
			for(int j=0;j<=a[i];) {
				if(j==a[i]) {
					System.out.println(a[i]);
					break;
				}
			int sum=j+n;
			j=n;
			n=sum;
			}
		}
	}
    
	public int[] copy(int[] a) {
	 int[] arr=new int[a.length];
	 for(int i=0;i<a.length;i++) {
		 arr[i]=a[i];
	 }
	 return arr;
	}
	public int[] oddElementCopy(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			 if(a[i]%2==1)count++;
		 }
		 int[] arr=new int[count];
		 int j=0;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]%2==1)arr[j++]=a[i];
		 }
		 return arr;
		}
	public int[] evenElementCopy(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			 if(a[i]%2==0)count++;
		 }
		 int[] arr=new int[count];
		 int j=0;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]%2==0)arr[j++]=a[i];
		 }
		 return arr;
		}
	public int[] shift_Positive_Left(int[] a){
		int k=a.length-1;
		int f=0;
		int[] arr=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]>=0)
				arr[f++]=a[i];
			else
				arr[k--]=a[i];
		}
		return arr;
	}
	public static void main(String[] args) {
		NumberProgram np=new NumberProgram();
		int[] arr= {1,2,3,4,5,6,7,8,9,12,21};
		int[] a= {1,2,5,8,-3,-99,-87,-84,3,23};
		//np.findFibanacci(arr);
		//System.out.println(Arrays.toString(np.copy(arr)));
		//System.out.println(Arrays.toString(np.oddElementCopy(arr)));
		//System.out.println(Arrays.toString(np.evenElementCopy(arr)));
		System.out.println(Arrays.toString(np.shift_Positive_Left(a)));
	}

}
