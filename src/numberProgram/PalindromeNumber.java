package numberProgram;

import java.util.function.IntFunction;

public class PalindromeNumber {
     IntFunction f=i->{
    	                int rev=0;     	 
    	               while(i>0) {
    	            	    
    	            	   rev= rev*10+i%10;
    	            	   i=i/10;
    	               }
    	               return rev;
     };
     public boolean isPalindrome(int x){
    	 if(x==(Integer)f.apply(x)) {
    		return true; 
    	 }
    	 return false;
     }
}
