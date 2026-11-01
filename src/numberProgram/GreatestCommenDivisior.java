package numberProgram;

import java.util.Scanner;

public class GreatestCommenDivisior {
	public int gcd(int a,int b) {
		int min=(a<b)?a:b;
		for(int i=min;i>0;i--) {
			if(a%i==0&&b%i==0) {
				return i;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GreatestCommenDivisior g=new GreatestCommenDivisior();
		System.out.println("Enter the numbers to find gcd : ");
		System.out.println(g.gcd(sc.nextInt(),sc.nextInt()));

	}

}
