package mock_test;

public class Num8_AutoMorpic {
    public static void main(String[] args) {
    	for(int i=1;i<=1000;i++) {
    	 int n=i;
    	 int squre=n*n;
    	 boolean flag=true;
         while(n>0) {
       	  if(n%10!=squre%10)flag= false;
       	  n/=10;
       	  squre/=10;
         }
         if(flag)
        	 System.out.println(i +" is a Automarphic number");
	    }
    }
}
