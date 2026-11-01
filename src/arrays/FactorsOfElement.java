package arrays;

public class FactorsOfElement {
	public void factor(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+": ");
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
public int largeSum(int[] a) {
	int sum=0;
	for(int i=0;i<a.length-1;i++) {
	    for(int j=1;j<a.length;j++) {
	    	if(i==j)break;
	    	int s=a[i]+a[j];
	    	if(sum<s)sum=s;	    	
	    }
	}
	return sum;
}
public void find_sum_equal(int[] a,int sum) {
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length;j++) {
			if(i==j)break;
	    	int s=a[i]+a[j];
	    	if(sum==s)System.out.print("("+a[i]+","+a[j]+")");;
		}
	}
}

	public static void main(String[] args) {
	  int[] arr= {45,2,67,43,12,8};
      FactorsOfElement f=new FactorsOfElement();
     f.factor(arr);
      // System.out.println(f.largeSum(arr));
     // f.find_sum_equal(arr, 112);
	}

}
