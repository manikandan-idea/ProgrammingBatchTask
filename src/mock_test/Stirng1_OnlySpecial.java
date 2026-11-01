package mock_test;

public class Stirng1_OnlySpecial {
    public static void main(String[] args) {
		String s="&&*^(&%&&)#@!%^^&*";
		boolean flag=false;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c>='0'&&c<='9')||(c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("The given String contain only Special characters");
		else
			System.out.println("The given String contain Alphabet or Numeric characters also");
	}
}
