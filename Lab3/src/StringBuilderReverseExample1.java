import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderReverseExample1 {  
    public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter n");
    	int n = sc.nextInt();
    	int []arr = new int[n];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	
        arr=getSorted(arr);
        System.out.println("Sorted Array");
        {
        	for(int i=0;i<n;i++)
        	{
        		System.out.println(arr[i]);
        	}
        }
    }
    
    public static int[] getSorted(int[] arr)
    {
    	int l=arr.length;
    	for(int i=0;i<l;i++)
    	{
    		String temp=Integer.toString(arr[i]);
    		StringBuilder temp1=new StringBuilder();
    		temp1.append(temp);
    		temp1=temp1.reverse();
    		temp=temp1.toString();
    		arr[i]=Integer.parseInt(temp);
    	}
    	Arrays.sort(arr);
    	return arr;
    }
}  
