package patternProgram;

public class StarPrintTwo {
	public void diagonal(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public void backDiagonal(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(i+j==a+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public void crossMarkBox(int a,int b,int f,int r) {
		int c=1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				 if((i+j==r+1)&&c==i)
					{
					System.out.print("* ");
					c++;
					r+=2;
				
				}else
					if(i==a||i==1||j==b||j==1||i+j==f+1) {
						System.out.print("* ");	
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public void printN(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(j==1||j==a||i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public void printZ(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(i==1||i==a||i+j==a+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public void upperArrow(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(i==1||j==a||i+j==a+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public void downArrow(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(j==1||i==a||i+j==a+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public void printX(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(i==j||i+j==a+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
    public static void main(String[] args) {
		StarPrintTwo pp= new StarPrintTwo();
		StarPrint sp=new StarPrint();
		//pp.diagonal(10);
		
		//sp.patternStar(10,1,10,1);
		//pp.backDiagonal(10);
		//sp.patternStar(10,1,10,1);
		//pp.crossMarkBox(10, 10, 10, 1);
		//pp.printN(10);
		//pp.printZ(10);
		//pp.upperArrow(7);
		//pp.downArrow(7);
	    pp.printX(8);
    }
}
