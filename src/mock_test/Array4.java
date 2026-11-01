package mock_test;

public class Array4 {
    public static void main(String[] args) {
    	int[] a= {4,12,8,7,9,2,10};
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
}
