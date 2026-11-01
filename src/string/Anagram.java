package string;

import java.util.Arrays;

public class Anagram {
	public boolean isAnagram(String s1, String s2) {
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		String s3=new String(a1);
		String s4=new String(a2);
		if(s3.equalsIgnoreCase(s4)) {
            return true;
		}
	
	return false;
	}
    public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		String s2="zyxwvutsrqponmlkjihgfedcba";
		String s3="ooo hai";
		Anagram a=new Anagram();
		if(a.isAnagram(s, s2))
			System.out.println("it is anagram");
		else 
			System.out.println("it is not a anagram");
		System.out.println(a.isAnagram(s3, s2));
	}
}
