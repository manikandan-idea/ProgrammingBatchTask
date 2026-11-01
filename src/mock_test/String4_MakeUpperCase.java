package mock_test;

public class String4_MakeUpperCase {

	public static void main(String[] args) {
		 String s="my name is tom";
		 String[] ch=s.split(" ");
		 for(int i=0;i<ch.length;i++) {
			if(ch[i].length()>0&&ch[i].charAt(0)>='a'&&ch[i].charAt(0)<='z') {
				char[] cc=ch[i].toCharArray();
				cc[0]=(char)(cc[0]-32);	
				ch[i]=new String(cc);
			}
				
		 }
		 String ss=String.join(" ", ch);
			System.out.println(ss); 
	}

}
