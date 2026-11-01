package numberProgram;

public class N_time_N {
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
   public static void main(String[] args) {
	N_time_N p=new N_time_N();
	p.nPrintNTime(5);
	p.intPrintNLength(8);
}
}
