package mock_test;

public class String6_PrintName {

	public static void main(String[] args) {
		String s="Abhi Smith Tom Aakash Jerry Ashwini  Ramesh Allen";
		 String[] ch=s.split(" ");
		 for(int i=0;i<ch.length;i++) {
			if(ch[i].length()>0&&(ch[i].charAt(0)=='a'||ch[i].charAt(0)=='A')) {
				System.out.print(ch[i]+"  ");
			}
				
		 }
	}

}
