package numberProgram;

import java.util.Scanner;

public class PerfectNumber {
	public void perfectNumberSeries(int x, int y) {
		int a=(x<y)?x:y;
		int b=(x>y)?x:y;
		for(int i=a; i<=b;i++) {
			if(isPerfectnumber(i)) {
				System.out.println(i);
			}
		}
	}
	public boolean isPerfectnumber(int x) {
		int total=0;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0) {
				total+=i;
			}
		}
		if(total==x)return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PerfectNumber pn=new PerfectNumber();
		System.out.println("Enter the number to check perfect number :");
        System.out.println(pn.isPerfectnumber(sc.nextInt()));
        System.out.println("Enter the range numbers to get perfect number :");
        pn.perfectNumberSeries(sc.nextInt(),sc.nextInt());

	}

}
