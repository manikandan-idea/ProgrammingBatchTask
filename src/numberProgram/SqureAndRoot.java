package numberProgram;

import java.util.function.IntFunction;

public class SqureAndRoot {
	IntFunction f=i->i*i;   
	IntFunction f1=i->{
		for(int a=1;a<i;a++) {
			if(a*a==i)return a;
		}
		return 0;
	};              
     public void rangesqure(int a, int b) {
    	 int min=(a<b)?a:b;
    	 int max=(a>b)?a:b;
    	 for(int i=min;i<=max;i++) {
    		 System.out.println(f.apply(i));
    	 }
     }
     public void rangeSqureRoot(int a,int b) {
    	 int min=(a<b)?a:b;
    	 int max=(a>b)?a:b;
    	 for(int i=min;i<=max;i++) {
    		 if((Integer)f1.apply(i)!=0)
    		 System.out.println(f1.apply(i));
    	 }
     }
     public boolean isPerfectSqure(int x) {
    	 if((Integer)f1.apply(x)!=0) return true;
    	 return false;
     }
     public boolean isSunnyNumber(int x) {
    	 if(isPerfectSqure(x+1))return true;
    	 return false;
     }
}
