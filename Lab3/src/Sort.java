import java.util.Scanner;

public class Sort {

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
		int k=arr.length;
		int temp=0;
		for(int i=0;i<k;i++)
		{
			for(int j=1;j<(k-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i = 0;i<k;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
