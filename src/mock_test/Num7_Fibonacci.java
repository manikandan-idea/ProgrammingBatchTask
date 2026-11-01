package mock_test;

public class Num7_Fibonacci {

	public static void main(String[] args) {
		int n=13;
		int a=0;
		int b=1;
		boolean flag=false;
		while(n>=a) {
			int c=a+b;
			a=b;
			b=c;
			if(a==n)flag=true;
		}
		if(flag)
			System.out.println("The given number is Fibonacci series number");
		else
			System.out.println("The given number is not a Fibonacci series number");
	}

}
