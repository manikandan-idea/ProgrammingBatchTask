package mock_test;

public class String2_Rotation {

	public static void main(String[] args) {
		String s="abcdef";
		char[] c=s.toCharArray();
		char tem=c[0];
		for(int i=0;i<c.length;i++) {
			
			if(i==c.length-1)
	        	c[i]=tem;
	        else
	        	 c[i]=c[i+1];
		}
	
		System.out.println("Clockwise rotation of "+s+" is: "+new String(c));
		 c=s.toCharArray();
		 tem=c[c.length-1];
			for(int i=c.length-1;i>=0;i--) {
				
				if(i==0)
		        	c[i]=tem;
		        else
		        	 c[i]=c[i-1];
			}
		System.out.println("Anticlockwise rotation of "+s+" is: "+new String(c));
	}

}
