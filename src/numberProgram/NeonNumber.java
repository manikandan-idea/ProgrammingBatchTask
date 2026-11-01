package numberProgram;

public class NeonNumber {
    public boolean isNeonNumber(int x){
    	int squre=x*x;
    	int sum=0;
    	while(squre>0) {
    		sum+=squre%10;
    		squre/=10;
    	}
    	if(sum==x)return true;
    	return false;
    }
    public void rangeNeonNumber(int a, int b) {
    	int min=(a<b)?a:b;
    	for(int i=a;i<=b;i++) {
    		if(isNeonNumber(i)) {
    			System.out.println(i);
    		}
    	}
    }
}
