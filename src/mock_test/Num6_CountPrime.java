package mock_test;

public class Num6_CountPrime {
    public static void main(String[] args) {
    	int count=0;
    	
		for(int i=1;i<=100;i++) {
			if(i==2||i==3) {
				count++;
				continue;
			}
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) break;
				if(j==i/2)count++;
			}
		}
		System.out.println("The count of prime number from 1 to 100 is:"+count);
	}
}
