package programmingBatch;

import java.util.Scanner;

public class ShirtSelect {
	Scanner sc=new Scanner(System.in);
   public boolean find(String color) {
	   if(color.equalsIgnoreCase(this.sc.nextLine())) {
		   return true;
	   }
	   return false;
   }
   public static void main(String[] args) {
	ShirtSelect s=new ShirtSelect();
	System.out.println(s.find("blue"));
}
}

