package numberProgram;

import java.util.Scanner;

public class HappyAndSadNumber {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x<=0) {
			System.out.println("Givin number is invalid");
			System.exit(0);
		}
		int dummy=x;
		while(true) {
			System.out.println(x);
			if(x==1) {
				System.out.println(dummy+" is a happy number");
				break;
			}else if(x==4) {
				System.out.println(dummy+" is a sad number");
				break;
			}else {

				int sum=0;
				while(x>0) {
					int squre=(x%10)*(x%10);
					sum+=squre;
					x/=10;
				}
				x=sum;
			}
		}
	}
}
