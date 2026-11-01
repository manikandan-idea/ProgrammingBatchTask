package mock_test;

public class Num1_Findlarge {

	public static void main(String[] args) {
		int[] arr= {23,65,73,21,14,13,91,37};
        int max=arr[0];
        for(int a:arr) {
        	if(max<a)max=a;
        }
        System.out.println("Large number is :"+max);
	}

}
