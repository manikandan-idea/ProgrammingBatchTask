package string;

public class PonagramString {
	public boolean isPonagram(String s) {
		char[] a=s.toCharArray();
		int count=0;
		for(char i='a';i<='z';i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j]==i||a[j]==(char)i-32) {
					count++;
					break;
				}
			}
		}
		if(count==26)return true;
		return false;
	}
    public static void main(String[] args) {
	String s="abcdEFghijklmnopqrstuvwxyzAFGDHFR84993849%%^$#%^#";
	PonagramString ps=new PonagramString();
	System.out.println(ps.isPonagram(s));
	if(ps.isPonagram(s))System.out.println("It is a ponagram String");
	}
}
