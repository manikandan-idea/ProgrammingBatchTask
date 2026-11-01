package mock_test;

public class Num2_Spynumber {
    public static void main(String[] args) {
		int n=22;
		int copy=n;
		int sum=0;
		int multi=1;
		while(copy>0) {
			sum=sum+copy%10;
			copy/=10;
		}
		copy=n;
		while(copy>0) {
			multi=multi*(copy%10);
			copy/=10;
		}
		if(sum==multi)
			System.out.println(n+" is a Spy number");
		else
			System.out.println(n+" is not a Spy number");
	}
}
