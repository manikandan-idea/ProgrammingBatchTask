package string;

public class Email {
	public void printValidEmail(String s) {
		char[] a=s.toCharArray();
		
		int a_count=0;

		if(a.length<6||a.length>30) {
				System.out.println("Sorry, Length of user name should be (6-30)");
				return ;
	     }

		char f=a[0];
		if(((f>='a'&&f<='z')||(f>='A'&&f<='Z')||(f>='0'&&f<='9'))==false){
			System.out.println("Sorry, First letter of user name should be alphabet(a-z) or numbers(0-9)");
			return ;
		}

		if((f>='a'&&f<='z')||(f>='A'&&f<='Z'))a_count++;

		for(int i=1;i<s.length()-1;i++) {
			f=a[i];
			if(((f>='a'&&f<='z')||(f>='A'&&f<='Z')||(f>='0'&&f<='9')||f=='.')==false){
				System.out.println("Sorry. The only allowed characters are alphabet(a-z), numbers(0-9) and dot(.)");
				return ;
			}

			if(a_count!=1&&(f>='a'&&f<='z')||(f>='A'&&f<='Z'))a_count++;
		}
		f=a[a.length-1];
		if(((f>='a'&&f<='z')||(f>='A'&&f<='Z')||(f>='0'&&f<='9'))==false){
			System.out.println("Sorry, Last letter of user name should be alphabet(a-z) or numbers(0-9)");
			return ;
		}
		if(a_count==0){
			System.out.println("User name should contain atleast one alphabet(a-z)");
			return ;
		}
		
		String ss="";
		// To convert all upper case letters to lower case letters
		
		for(int i=0;i<a.length;i++) {
			f=a[i];
			if(f>='A'&&f<='Z') {
		    	a[i]=(char)(a[i]+32);
		    }
			ss+=a[i];
		}
		System.out.println(ss);
	}

	public static void main(String[] args) {
		String s="pardeePKUmar28389.in.kl";
		String s1=".pardeePKUmar28389.in.kl";
		Email e=new Email();
		e.printValidEmail(s);
		e.printValidEmail(s1);
	}

}
