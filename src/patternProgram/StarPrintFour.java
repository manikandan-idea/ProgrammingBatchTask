package patternProgram;

public class StarPrintFour {
	 public void narayanaSymbol(int a) {
		 for(int i=1;i<=a*2-1;i++){
			 for(int j=1;j<=a*2-1;j++) {
				 if(i==a||j==a||(j==a*2-1&&i<a)||(j==1&&i>a)||(i==1&&j<a)||(i==a*2-1&&j>a))
					 System.out.print("* ");
				 else
					 System.out.print("  ");
			 }
		    System.out.println();
		 }
	 }
	 public void laderStar(int a) {
		 for (int i =1;i<=a;i++) {
			 for(int j=1;j<a*2;j++) {
				 if(i<=j&&i+a-1>=j)
					 System.out.print("* ");
				 else
					 System.out.print("  ");
			 }
		    System.out.println();
			 
		 }
	 }
	 public void soilClockDown(int a) {
		 for (int i =1;i<a*2;i++) {
			 for(int j=1;j<a*2;j++) {
				 if((i<=j&&i+j>=a*2)||(i>=j&&i+j<=a*2 ))
					 System.out.print("* ");
				 else
					 System.out.print("  ");
			 }
		    System.out.println();
			 
		 }
	 }
	
	 public void diamondPrint(int a) {
		 for (int i =1;i<a*2;i++) {
			 for(int j=1;j<a*2;j++) {
				 if(i+a-1>=j&&j+a-1>=i&&i+j>=a+1&&i+j<=a*3-1)
					 System.out.print("* ");
				 else
					 System.out.print("  ");
			 }
		    System.out.println();
			 
		 }
	 }
     public static void main(String[] args) {
	     StarPrintFour spf=new StarPrintFour();
	    // spf.narayanaSymbol(7);
	    // spf.laderStar(5);
	    //  spf.soilClockDown(5);
	     spf.diamondPrint(5);
     }
}
