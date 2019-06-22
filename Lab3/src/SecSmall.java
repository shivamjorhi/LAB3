import java.util.Arrays;
import java.util.Scanner;

public class SecSmall {

	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements in array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int z=getSecondSmallest(arr);
		System.out.println(z);
	}
	
	public static int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		
		return arr[1];

	}

}
