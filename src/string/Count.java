package string;

public class Count {
	public void count(String s) {
		int l=0,d=0,sp=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
				l++;
			}
			else if(c>='0'&&c<='9'){
				d++;
			}else {
				sp++;
			}
		}
		System.out.println("Number of alphabets = "+l);
		System.out.println("Number of digits = "+d);
		System.out.println("Number of Special Characters = "+sp);
	}
	public int vowelCount(String s) {
		int vow=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')vow++;
		}
	return vow;
	}
	public boolean hasOnlyLetters(String s) {
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c<'a'||c>'z')&&(c<'A'||c>'Z'))
				return false;
		}
	return true ;
	}
	public int countSpace(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c==' ')count++;
				
		}
	return count;
	}
	public boolean hasVowel(String s) {
	
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')return true;
		}
	return false;
	}
public boolean hasOnlyConsonents(String s) {
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c<'0'||c>'9')
				return false;
		}
	return true ;
	}
public boolean hasOnlySpecialCharacters(String s) {
	
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))
			return false;
	}
return true ;
}
    public static void main(String[] args) {
		Count c=new Count();
		String s="hai i am manikandan. how can i help you@### 1903839";
		String sp="@#$%@#$&*(";
		//c.count(s);
		//System.out.println(c.vowelCount(s));
		//if(c.hasOnlyLetters(sp))System.out.println("it has only letters");
		System.out.println(c.countSpace(s));
		if(c.hasOnlyConsonents(sp))System.out.println("it has only cons");
		if(c.hasOnlySpecialCharacters(sp))System.out.println("it has only sp");
	}
}
