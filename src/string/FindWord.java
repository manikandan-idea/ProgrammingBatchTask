package string;

public class FindWord {
	public String largeWord(String string) {
		String[] s=string.split(" ");
		String big=s[0];
		for(int i=1;i<s.length;i++) {
		   if(big.length()<s[i].length())big=s[i];	
		}
		return big;
	}
	public String smallWord(String string) {
		String[] s=string.split(" ");
		String small=s[0];
		for(int i=1;i<s.length;i++) {
		   if(small.length()>s[i].length())small=s[i];	
		}
		return small;
	}
    public static void main(String[] args) {
		FindWord f=new FindWord();
		String s="manikandan has a good soul and strong person manikandan has a good soul and strong person manikandan has a good soul and strong person";
		System.out.println(f.largeWord(s));
		System.out.println(f.smallWord(s));
	}
}

