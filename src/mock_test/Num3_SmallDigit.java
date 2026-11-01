package mock_test;

public class Num3_SmallDigit {
    public static void main(String[] args) {
    	int n=2289373;
		int copy=n;
		int s_digit=copy%10;
		
		while(copy>0) {
			if(s_digit>copy%10)s_digit=copy%10;
			copy/=10;
		}
		System.out.println("Small digit of "+n+" is :"+s_digit);
	}
}
