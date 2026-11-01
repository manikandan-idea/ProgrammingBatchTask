package string;

public class ChangeCase {
     public void toLowerCase(String s) {
    	 String ss="";
    	 for(int i=0;i<s.length();i++) {
    			char c=s.charAt(i);
    			
    				if(c>='A'&&c<='Z')
    				    ss=ss+(char)(c+32);
    				else
    					ss=ss+c;
    		}
    	 System.out.println(ss);
     }
     public static void main(String[] args) {
		String s="i aM MAIN METHOD 123433543$%$%$";
		ChangeCase cc=new ChangeCase();
		cc.toLowerCase(s);
	}
}
