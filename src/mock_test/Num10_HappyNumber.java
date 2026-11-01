package mock_test;
public class Num10_HappyNumber {

	public static void main(String[] args) {
		for(int i=2;i<=500;i+=2) {
		
		int dummy=i;
		while(true) {

			if(dummy==1) {
				System.out.println(i+" is a happy number");
				break;
			}else if(dummy==4) {
				
				break;
			}else {

				int sum=0;
				while(dummy>0) {
					int squre=(dummy%10)*(dummy%10);
					sum+=squre;
					dummy/=10;
				}
				dummy=sum;
			}
		}
	    }
    }

}
