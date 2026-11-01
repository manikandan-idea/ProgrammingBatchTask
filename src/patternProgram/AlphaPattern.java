package patternProgram;

public class AlphaPattern {
	
		public void nPrintNTime(int n){
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(n);
				}
				System.out.println();
			}
		}
		public void intPrintNLength(int n){
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		public void reverseIntPrintNLength(int n){
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(n-j+1);
				}
				System.out.println();
			}
		}
		public void alphaTriangle(int n){
			char num='A';
			for(int i=1;i<=n*2-1;i++) {
				for(int j=1;j<=n*2-1;j++) {
					if(i>=j&&i+j<=n*2) {
						System.out.print(num+" ");
					}else {
						System.out.print("  ");
					}
				  num+=1;
				}
				num='A';
				System.out.println();
			}
		}
		public void numericOuterTriangle(int n){
			int num=1;
			for(int i=1;i<=n*2-1;i++) {
				for(int j=1;j<=n*2-1;j++) {
					if(i>=j||i+j<=n*2) {
						if(i>=n)System.out.print(num+" ");
						else System.out.print(n-i+1+" ");
					}else {
						System.out.print("  ");
					}
				 
				}
				if(i>=n)num+=1;
				System.out.println();
			}
		}
		public void squreBinary(int n){
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(i%2==0)
					System.out.print(0+" ");
					else System.out.print(1+" ");
				}
				System.out.println();
			}
		}
		public void alterNumericDownPyramid(int n){
			int num=1;
			for(int i=1;i<=n*2-1;i++) {
				for(int j=1;j<=n*2-1;j++) {
					if(i<=j&&i+j<=n*2) {
						if(i%2==0) {
							if(j%2==0)
							    System.out.print(num+" ");
							else 
								System.out.print("* ");
						}
						else {
							if(j%2==1)
							    System.out.print(num+" ");
							else 
								System.out.print("* ");
						}
					}else {
						System.out.print("  ");
					}
				 
				}
				num+=1;
				System.out.println();
			}
		}
		public void Butterfly(int n) {
			for(int i=1;i<=n*2-1;i++) {
				for(int j=1;j<=n*2-1;j++) {
				if((i>=j && i+j<=n*2) || (j>=i && i+j>=n*2)) {
				System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
				}
				System.out.println();
				}

		}
		public void xBinary(int n){
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(i==j&&i+j==n+1) 
						  System.out.print("* ");
				    else if(i==j)
					      System.out.print(0+" ");
					else if(i+j==n+1)
						  System.out.print(1+" ");
					else
						  System.out.print("  ");
				}
				System.out.println();
			}
		}
		public void alphaLeftUpperTriangle(int n){
			char num=(char)('A'+n-1);
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(i+j>=n+1) 
						  System.out.print(num+" ");
				   
					else
						  System.out.print("  ");
					num--;
				}
				num=(char)('A'+n-1);
				System.out.println();
			}
		}
		public void iAlphaLeftUpperTriangle(int n){
			char num='A';
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(i+j>=n+1) 
						  System.out.print(num+" ");
				   
					else
						  System.out.print("  ");
					
				}
				num++;
				System.out.println();
			}
		}
	   public static void main(String[] args) {
		AlphaPattern p=new AlphaPattern();
		//p.nPrintNTime(5);
		//p.intPrintNLength(8);
		//p.reverseIntPrintNLength(5);
		//p.alphaTriangle(6);
		//p.numericOuterTriangle(5);
		//p.squreBinary(6);
		p.alterNumericDownPyramid(6);
		//p.Butterfly(6);
		//p.xBinary(7);
		//p.iAlphaLeftUpperTriangle(5);
	}
}
