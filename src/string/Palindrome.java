package string;

public class Palindrome {
	public String getRev(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		return rev;
	}
	public boolean ispalindrome(String s) {
		if(s.equalsIgnoreCase(getRev(s)))return true;
		return false;
	}

	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		String s="Level";
		System.out.println(p.getRev(s));
		System.out.println(p.ispalindrome(s));
		
	}

}
