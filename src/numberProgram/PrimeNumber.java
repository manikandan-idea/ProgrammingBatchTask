package numberProgram;
import java.util.Scanner;

public class PrimeNumber { 
	public void even_prime_range(int a,int b) {
		for(int i=a;i<=b;i++) {
			if(isPrime(i)&&i%2==0) {
				System.out.println(i);
			}
		}
	}
	public void prime_range(int a,int b) {
	for(int i=a;i<=b;i++) {
		if(isPrime(i)) {
			System.out.println(i);
		}
	}
	}
    
	public boolean isPrime(int x ) {
		
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
public boolean isComposite(int x ) {
		
		for(int i=2;i<x/2;i++) {
			if(x%i==0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
        PrimeNumber prime=new PrimeNumber();
        System.out.println("Enter the number to check is prime : ");
        System.out.println(prime.isPrime(sc.nextInt()));
      //  System.out.println("Enter the number Range to get is prime numbers : ");
       // prime.prime_range(sc.nextInt(),sc.nextInt());
       // System.out.println("Enter the number to check is composite : ");
       // System.out.println(prime.isComposite(sc.nextInt()));
       // System.out.println("Enter the number Range to get is prime numbers : ");
       // prime.even_prime_range(sc.nextInt(),sc.nextInt());
        
	}

}
