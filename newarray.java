import java.util.*;

public class newarray {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int j=0;
		int n=sc.nextInt();
		int s=sc.nextInt();
		int ar[]=new int[n];
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    if(arr[i]==s)
		    {
		    	continue;
		    
		    }
		    else
		    {
		    	ar[j]=arr[i];
		    	j++;
		    }
		}
		for (int i = 0; i <j; i++) {
			System.out.print(ar[i]+" ");
		}
		
		

	}

}
