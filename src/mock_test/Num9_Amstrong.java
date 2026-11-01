package mock_test;

public class Num9_Amstrong {
	public static void main(String[] args) {
		boolean flag=false;
		for(int i=1;i<=1000;i++) {
			int dummy=i;
			int power=0;
			while(dummy>0) {
				power++;
				dummy/=10;
			}
			dummy=i;
			int sum=0;
			while(dummy>0) {
				int ldigit=dummy%10;
				
				int total=1;
				for(int j=1;j<=power;j++) {
					total=total*ldigit;					
				}
				sum+=total;
				
				dummy/=10;
			}
			if(sum==i) {
				if(i>9&&i<100) {
					System.out.println(i+" is a Amstrong Number");
					flag=true;
				}
			    
			}	
		}
		if(flag==false)System.out.println("There is two digit Amstrong number");
	}
	
}
