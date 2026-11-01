package numberProgram;

public class InnerAndOuterSum {
	public int innerSum(int x) {
		x=x/10;
		int sum=0;
		while(x>9) {
			sum+=x%10;
			x=x/10;
		}
		return sum;
	}
	public int outerSum(int x) {
		int sum=x%10;
		while(x>9) {
			x=x/10;
		}
		sum+=x;
		return sum;
	}
	public boolean isXylem(int x) {
	     return (innerSum(x)==outerSum(x))?true:false;
	}
	public boolean isPhloem(int x) {
	     return (innerSum(x)!=outerSum(x))?true:false;
	}
	public void rangeXylem(int a, int b) {
		int min=(a<b)?a:b;
		for(int i=a;i<=b;i++) {
			if(isXylem(i)) {
			System.out.println(i);	
			}
		}
	}
	public int findFactorial(int x) {
		int ans=1;
		for(int i=1;i<=x;i++) {
			ans*=i;
		}
		return (x>0)?ans:0;
	}
	public int digitFacSum(int x) {
		int sum=0;
		while(x>0) {
			sum+=findFactorial(x%10);
			x=x/10;
		}
		return sum;
	}
	public boolean isStrongNumber(int x) {
		return (x==digitFacSum(x))?true:false;
	}
	public void rangeStrongNum(int a,int b) {
		int min =(a<b)?a:b;
		for(int i=a;i<=b;i++) {
			if(isStrongNumber(i))System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		InnerAndOuterSum io=new InnerAndOuterSum();
		System.out.println(io.innerSum(123323));
		//System.out.println(io.outerSum(123323));
        //System.out.println(io.isXylem(2345));
        //System.out.println(io.isPhloem(2345));
       // io.rangeXylem(1000, 5000);
       // System.out.println(io.findFactorial(5));
        System.out.println(io.digitFacSum(99999999));
      //  System.out.println(io.isStrongNumber(666));
		io.rangeStrongNum(1, 10000000);
	}

}
