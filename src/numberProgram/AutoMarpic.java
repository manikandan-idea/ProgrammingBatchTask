package numberProgram;
import java.util.function.*;

public class AutoMarpic {
	   
	   IntPredicate isAutomarpic=i->{
		                  int squre=i*i;
		                  while(i>0) {
		                	  if(i%10!=squre%10)return false;
		                	  i/=10;
		                	  squre/=10;
		                  }
		                  return true;
	                      };
       public static void main(String[] args) {
    	   AutoMarpic a=new AutoMarpic();
    	   System.out.println(a.isAutomarpic.test(125));
		
	   }
}
