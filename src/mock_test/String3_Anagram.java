package mock_test;

public class String3_Anagram {

	public static void main(String[] args) {
		String s1="cbadefghijklmnopqrstuvwxyz";
		String s2="zyxwvutsrqponmlkjihgfedbca";
		char[] c1=new char[s1.length()];
		for(int i=0;i<c1.length;i++) {
			c1[i]=s1.charAt(i);
		}
		for(int i=0;i<c1.length;i++) {
		     char min=c1[i];
		     for(int j=i+1;j<c1.length;j++) {
		    	 if(c1[j]<min) {
		    		 min=c1[j];
		    		 c1[j]=c1[i];
		    		 c1[i]=min;
		    	 }
		     }	
		}
		char[] c2=new char[s2.length()];
		for(int i=0;i<c2.length;i++) {
			c2[i]=s2.charAt(i);
		}
		for(int i=0;i<c2.length;i++) {
		     char min=c2[i];
		     for(int j=i+1;j<c2.length;j++) {
		    	 if(c2[j]<min) {
		    		 min=c2[j];
		    		 c2[j]=c2[i];
		    		 c2[i]=min;
		    	 }
		     }	
		}
		
		String s3=new String(c1);
		String s4=new String(c2);
		if(s3.equalsIgnoreCase(s4)) {
            System.out.println("The given two Strings are Anagram");
		}else {
			System.out.println("The given two Strings are not a Anagram");
		}
	}

}
