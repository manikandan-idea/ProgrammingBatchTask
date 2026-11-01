package patternProgram;

public class ShalloPattern {
	public void triangle(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(i==a||j==1||i==j)
					System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public void diamond(int a) {
		for(int i=1;i<=a*2-1;i++) {
			for(int j=1;j<=a*2-1;j++) {
				if(i+a-1==j||j+a-1==i||i+j==a+1||i+j==a*3-1)
					System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
     public static void main(String[] args) {
		ShalloPattern sp=new ShalloPattern();
		sp.triangle(6);
		sp.diamond(5);
	}
}
