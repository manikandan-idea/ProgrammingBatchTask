package patternProgram;

public class StarPrint {
	public void printStar(int x) {
		for(int i=0;i<x;i++) {
			System.out.print("*");
		}		
	}
	public void printStarNext(int x) {
		for(int i=0;i<x;i++) {
			System.out.println("*");
		}		
	}
	public void printStar(int x,int y) {
	 for(int j=0;j<y;j++) {
		for(int i=0;i<x;i++) {
			System.out.print("*");
		}
		System.out.println();
	 }
	}
	public void patternStar(int x,int y) {
		for(int j=0;j<y;j++) {
			for(int i=0;i<x;i++) {
				if(i==x-1||j==y-1)
				{System.out.print("*");
				System.out.print(" ");
				}else {
					System.out.print(" ");
					System.out.print(" ");
				}
			}
			System.out.println();
		 }
	}
	public void patternStarSqure(int x) {
		for(int j=0;j<x;j++) {
			for(int i=0;i<x;i++) {
				if(i==x-1||i==0||j==0||j==x-1)
				{System.out.print("*");
				System.out.print(" ");
				}else {
					System.out.print(" ");
					System.out.print(" ");
				}
			}
			System.out.println();
		 }
	}
	public void patternStarSqure(int x,int r,int c) {
		for(int j=1;j<=x;j++) {
			for(int i=1;i<=x;i++) {
				if(i==1||i==x||j==1||j==x||i==c||j==r)
				     
					System.out.print("* ");
			
				else 
					System.out.print("  ");
				
			}
			System.out.println();
		 }
	}
	public void patternStar(int x,int y,int v,int h) {
		for(int j=1;j<=y;j++) {
			for(int i=1;i<=x;i++) {
				if(i==v||j==h)
				   System.out.print("* ");				
				else 
					System.out.print("  ");
					
			}
			System.out.println();
		 }
	}
	public void patternStarRect(int x,int y,int v,int h) {
		for(int j=1;j<=y;j++) {
			for(int i=1;i<=x;i++) {
				if(i==v||j==h||i==x-v+1||j==y-h+1)
				   System.out.print("* ");				
				else 
					System.out.print("  ");
					
			}
			System.out.println();
		 }
	}
	
    public static void main(String[] args) {
		StarPrint ps=new StarPrint();
		//ps.printStar(1);
		//ps.printStarNext(3);
		//ps.printStar(6, 4);
		//ps.patternStar(10, 10);
		//ps.patternStar(5,3,0,2);
	//	ps.patternStarRect(9, 9, 5,5);
	//	ps.patternStar(5, 7);
		ps.patternStarSqure(11, 2, 6);
	}
}
