import java.util.Arrays;
import java.util.Scanner; 
  
public class CFG  
{ 
    // Method to sort a string alphabetically 
    public static String[] sortString(int n, String s[]) 
    { 
        Arrays.sort(s);
        for(int i=0;i<n;i++)
        {
        	System.out.println(s[i]);
        }
        if(n%2!=0)
        {
        	for(int i=0;i<n/2+1;i++)
        	{
        		s[i]=s[i].toUpperCase();
        		s[i+(n/2)]=s[i+(n/2)].toLowerCase();
        	}
        	s[n/2]=s[n/2].toUpperCase();
        }
        else
        {
        	for(int i=0;i<n/2;i++)
        	{
        		s[i]=s[i].toUpperCase();
        		s[i+n/2]=s[i+n/2].toLowerCase();
        	}
        }
        return s;
    } 
      
    // Driver method 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n= sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++)
        {
        	s[i]=sc.next();
        }
        s=sortString(n,s);
        System.out.println("Resulted array is");
        for(int i=0;i<n;i++)
        {
        	System.out.println(s[i]);
        }
    } 
} 