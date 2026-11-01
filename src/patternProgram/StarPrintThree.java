package patternProgram;

public class StarPrintThree {
	  public void rightUpperTriangle(int a) {
				for(int i=1;i<=a;i++) {
					for(int j=1;j<=a;j++) {
						if(i>=j) {
							System.out.print("* ");
						}else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			}
	  public void leftUpperTriangle(int a) {
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=a;j++) {
					if(i+j>=a+1) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	  public void rightDownTriangle(int a) {
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=a;j++) {
					if(i+j<=a+1) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	  public void leftDownTriangle(int a) {
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=a;j++) {
					if(i<=j) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	  public void left_RightUpperTriangle(int a) {
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=a*2-1;j++) {
					if(i>=j||i+j>=a*2) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	  public void left_RightDownTriangle(int a) {
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=a*2-1;j++) {
					if(i+j<=a+1||i+a-1<=j) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	  public void leftTopDownTriangle(int a) {
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=a*2-1;j++) {
					if(i+j>=a*2||i+a-1<=j) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	  public void pyramid(int a) {
		  for(int i=1;i<=a;i++) {
				for(int j=1;j<=a*2-1;j++) {
					if(i+j>=a+1&&j-i<=a-1) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	  public void downPyramid(int a) {
		  for(int i=1;i<=a;i++) {
				for(int j=1;j<=a*2-1;j++) {
					if(i<=j&&i+j<=a*2) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
	  public void leftPyramid(int a) {
		  for(int i=1;i<=a*2-1;i++) {
				for(int j=1;j<=a;j++) {
					if(i>=j&&i+j<=a*2) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}  
	  public void rightPyramid(int a) {
		  for(int i=1;i<=a*2-1;i++) {
				for(int j=1;j<=a;j++) {
					if(i<=j+a-1&&i+j>a) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}  
	  
	  public static void main(String[] args) {
		StarPrintThree st=new StarPrintThree();
		//st.rightUpperTriangle(6);
		//st.leftUpperTriangle(8);
		//st.rightDownTriangle(7);
		//st.leftDownTriangle(5);
	   // st.left_RightUpperTriangle(5);
		//st.left_RightDownTriangle(10);
	    //  st.leftTopDownTriangle(5);
		// st.pyramid(8);
	    //   st.downPyramid(9);
	     // st.leftPyramid(8);
	      //  st.rightPyramid(9);
	  }
}
