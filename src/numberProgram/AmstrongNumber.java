package numberProgram;

public class AmstrongNumber {
	public int count(int x) {
		int count=0;
		while(x>0) {
			count++;
			x/=10;
		}
		return count;
	}
	public boolean isAmstrong(int x) {
		int dummy=x;
		int power=count(x);
		int sum=0;
		while(x>0) {
			int ldigit=x%10;
			
			int total=1;
			for(int i=1;i<=power;i++) {
				total=total*ldigit;
				
			}
			sum+=total;
			
			x/=10;
		}
		if(sum==dummy)
		return true;
		return false;
	}
	public void printamstrong(int x) {
		if(isAmstrong(x)) {
			System.out.println(x+" is a Amstrong Number");
		}
		else {
			System.out.println(x+" is not a Amstrong Number");
		}
	}
	public void rangeAms(int a,int b) {
		int min=(a<b)?a:b;
		int max=(a>b)?a:b;
		for(int i=min;i<=max;i++) {
			if(isAmstrong(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		AmstrongNumber an=new AmstrongNumber();
		an.printamstrong(153);
		System.out.println(an.count(153));
		System.out.println(an.isAmstrong(153));
		an.rangeAms(1, 1000);

	}

}
