package mock_test;

public class FindOccurenceEven {
    public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,2,3,2,5,4,2,12,2,6};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0&&arr[i]!=Integer.MAX_VALUE) {
				count++;
			    for(int j=i+1;j<arr.length;j++) {
				  if(arr[i]==arr[j])arr[j]=Integer.MAX_VALUE;  
			    }
			}
		}
		System.out.println("Count of even elements in this array is: "+count);
	}
}
