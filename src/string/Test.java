package string;

public class Test {
	public String merge(String s1,String s2) {
	
	    char[] arr=new char[s1.length()+s2.length()];
	    char[] c1=s1.toCharArray();
	    char[] c2=s2.toCharArray();
	    String max=(s1.length()>s2.length())?s1:s2;
	    int count=0;
	    
	    	for(int j=0;j<max.length();j++) {
	    		
	    			if(c1.length>j)
	    				
	    			    arr[count++]=c1[j];
	    			    
	    		    if(c2.length>j)
	    				
	    				arr[count++]=c2[j];
	        }
	    return new String(arr);
	}
	public String reverseEachWord(String s) {
		String[] a=s.split(" ");
		for(int i=0;i<a.length;i++) {
			String rev="";
			for(int j=a[i].length()-1;j>=0;j--) {
				rev+=a[i].charAt(j);
			}
			a[i]=rev;
		}
		String ss=String.join(" ", a);
		return ss;
	}
	public String toUpperCaseFirstLetter(String s) {
	    char[] ch=s.toCharArray();
		if(s.length()>0&&s.charAt(0)>='a'&&s.charAt(0)<='z')ch[0]=(char)(ch[0]-32);
		return new String(ch);
	}
    public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.merge("abcd", "123455548"));
		System.out.println(t.reverseEachWord("i am on fire"));
	}
}
