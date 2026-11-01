package mock_test;

public class String5_Panagram {

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
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
		if(count==26)
			System.out.println("The given String is panagram");
		else
			System.out.println("The given String is not panagram");
	}

}
