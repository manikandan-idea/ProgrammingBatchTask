package numberProgram;

import java.util.Arrays;

public class Remove_Extract {
	public int removeLast(int x) {
		return x/10;
	}
	public int getLast(int x) {
		return x%10;
	}
	public int countDigit(int x) {
		int count=0;
		while(x>0) {
		    count++;
			x=x/10;					
		}
		 return count;
	}
	public int[] split(int x) {
		int[] ar=new int[countDigit(x)];
		for(int i=0;i<ar.length;i++) {
			ar[i]=getLast(x);
			x=removeLast(x);
					
		}
		return ar;
	}
	public int digitSum(int x) {
		int sum=0;
		for(int o:split(x)) {
			sum+=o;
		}
		return sum;
	}
	public int evenDigitSum(Integer x) {
		int sum=0;
		for(int o:split(x)) {
			if(o%2==0)
			sum+=o;
		}
		return sum;
	}
	public int sumOuter(int x) {
		int[] a=split(x);
		return a[0]+a[a.length-1];
	}

	public static void main(String[] args) {
		Remove_Extract r=new Remove_Extract();
		System.out.println(r.removeLast(23542));
		System.out.println(r.getLast(23542));
		System.out.println(Arrays.toString(r.split(648726382)));
		System.out.println(r.countDigit(111111));
		System.out.println(r.digitSum(6473638));
		System.out.println(r.evenDigitSum(6473638));
		System.out.println(r.sumOuter(5474948));
	}

}
