package mock_test;

public class Num4_factor {

	public static void main(String[] args) {
		int n=483948;
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
			System.out.print(uni%10+": ");
			for(int j=1;j<=uni%10;j++) {
				if((uni%10)%j==0) {
					System.out.print(j+" ");
				}
			}
			uni/=10;
			System.out.println();
		}
	}

}
