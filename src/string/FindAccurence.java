package string;

public class FindAccurence {
	public void countCharacter(String s) {
		 char[] ch=s.toCharArray();
	     for(int i=0;i<ch.length;i++) {
	    	 int count=1;
	    	 for(int j=i+1;j<ch.length;j++) {
	    		 if(ch[i]==ch[j]&&ch[j]!=Character.MAX_VALUE) {
	    			 ch[j]=Character.MAX_VALUE;
	    			 count++;
	    		 }
	    	 }
	    	 if(ch[i]!=Character.MAX_VALUE) {
	    		System.out.println(ch[i]+"--->"+count+" times"); 
	    	 }
	     }
	
	
	}
	
	
		public void countWord(String s) {
			 String[] ch=s.split(" ");
		     for(int i=0;i<ch.length;i++) {
		    	 int count=1;
		    	 for(int j=i+1;j<ch.length;j++) {
		    		 if(ch[j]!=""&&ch[i].equalsIgnoreCase(ch[j])) {
		    			 ch[j]="";
		    			 count++;
		    		 }
		    	 }
		    	 if(ch[i]!="") {
		    		System.out.println(ch[i]+"--->"+count+" times"); 
		    	 }
		     }
		
		
		}
	public void printRepeatedElement(String s) {
		char[] ch=s.toCharArray();
	     for(int i=0;i<ch.length;i++) {
	    	 int count=1;
	    	 for(int j=i+1;j<ch.length;j++) {
	    		 if(ch[i]==ch[j]&&ch[j]!=Character.MAX_VALUE) {
	    			 ch[j]=Character.MAX_VALUE;
	    			 count++;
	    		 }
	    	 }
	    	 if(count!=1&&ch[i]!=Character.MAX_VALUE) {
	    		System.out.println(ch[i]+"--->"+count+" times"); 
	    	 }
	     }
	}
	public void printNonRepeatedElement(String s) {
		char[] ch=s.toCharArray();
	     for(int i=0;i<ch.length;i++) {
	    	 int count=1;
	    	 for(int j=i+1;j<ch.length;j++) {
	    		 if(ch[i]==ch[j]&&ch[j]!=Character.MAX_VALUE) {
	    			 ch[j]=Character.MAX_VALUE;
	    			 count++;
	    		 }
	    	 }
	    	 if(count==1&&ch[i]!=Character.MAX_VALUE) {
	    		System.out.println(ch[i]); 
	    	 }
	     }
	}
    public static void main(String[] args) {
    	String s="manikandan has a good soul and strong person manikandan has a good soul and strong person manikandan has a good soul and strong person";
		FindAccurence fa=new FindAccurence();
		//fa.countCharacter(s);
		//fa.printRepeatedElement(s);
		//fa.printNonRepeatedElement(s);
		fa.countWord(s);
	}
}
