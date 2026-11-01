package arrays;

public class DublicateNumber {
	public void count_dub(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for (int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=Integer.MAX_VALUE;
				}
				
			}
			if(a[i]!=Integer.MAX_VALUE)
			System.out.print(a[i]+"("+count+")  ");
		}
	}
public void print_dub(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for (int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=Integer.MAX_VALUE;
				}
				
			}
			if(a[i]!=Integer.MAX_VALUE&&count!=1)
			System.out.print(a[i]+"("+count+")  ");
		}
	}
public boolean isPrime(int a) {
	        
			for(int a1=2;a1<=a/2;a1++) {
			     if(a%a1==0) {
			    	return false; 
			     }
			}
			return true;

}

public void prime_dub(int[] a) {
	
	for(int i=0;i<a.length;i++) {
		int count=1;
		
		for (int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				a[j]=Integer.MAX_VALUE;
			}
			
		}
		if(a[i]!=Integer.MAX_VALUE&&count!=1&&isPrime(a[i]))
		System.out.print(a[i]+"("+count+")  ");
		
	}
}
public void print_non_dub(int[] a) {
	
	for(int i=0;i<a.length;i++) {
		int count=1;
		for (int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				a[j]=Integer.MAX_VALUE;
			}
			
		}
		if(a[i]!=Integer.MAX_VALUE&&count==1)
		System.out.print(a[i]+"("+count+")  ");
	}
}
public void print_prime(int[] a) {
	
	for(int i=0;i<a.length;i++) {
		int count=1;
		
		for (int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				a[j]=Integer.MAX_VALUE;
			}
			
		}
		if(a[i]!=Integer.MAX_VALUE&&isPrime(a[i]))
		System.out.print(a[i]+"("+count+")  ");
		
	}
}


	public static void main(String[] args) {
		int[] arr= {1,4,3,2,3,2,3,2,3,2,34,23,64,765,655,4,64,23,0,999993};
		DublicateNumber dn=new DublicateNumber();
		//dn.count_dub(arr);
		//dn.print_dub(arr);
		//dn.prime_dub(arr);
		//dn.print_non_dub(arr);
		dn.print_prime(arr);
	}

}
