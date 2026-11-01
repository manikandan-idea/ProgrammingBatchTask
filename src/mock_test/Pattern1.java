package mock_test;

public class Pattern1 {
    public static void main(String[] args) {
    	
        int n=4;
    	int num=1;
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i<=j+n-1&&i+j<=n*3-1&&i+j>n&&j<=n+i-1) {
					if(i%2==1) {
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
			if(i<n)
			    num+=1;
			else
				num-=1;
			System.out.println();
	      }
   }
}
