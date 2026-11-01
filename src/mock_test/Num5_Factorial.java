package mock_test;

public class Num5_Factorial {
	public static void main(String[] args) {
		int n=42648;
		int copy=n;
		int uni=n;
		
		while(copy>0) {
			int dc=copy/10;
			while(dc>0) {
				if(uni%10==dc%10) {
					uni/=10;
					break;
				}
				dc/=10;
			}
			copy/=10;
		}
		while(uni>0) {
			if(uni%2==0) {
			System.out.print(uni%10+"! is: ");
			int fac=1;
			for(int j=2;j<=uni%10;j++) {
				fac*=j;
			}
			System.out.println(fac);
			}
			uni/=10;
			
		}
	}
}
