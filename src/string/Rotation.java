package string;

public class Rotation {
	public String RotateRight(String s) {
		char[] c=s.toCharArray();
		char tem=c[0];
		for(int i=0;i<c.length;i++) {
			
			if(i==c.length-1)
	        	c[i]=tem;
	        else
	        	 c[i]=c[i+1];
		}
		String ss=new String(c);
		return ss;
	}
	public String RotateLeft(String s) {
		char[] c=s.toCharArray();
		char tem=c[c.length-1];
		for(int i=c.length-1;i>=0;i--) {
			
			if(i==0)
	        	c[i]=tem;
	        else
	        	 c[i]=c[i-1];
		}
		String ss=new String(c);
		return ss;
	}
    public static void main(String[] args) {
		Rotation r=new Rotation();
		String s="abcdefghijklmnopqrstuvwxyz";
		System.out.println(r.RotateLeft(s));
		System.out.println(r.RotateRight(s));
	}
}
