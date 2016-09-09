import java.util.Arrays;

public class max {

	public static void main(String[] args) {
	int n[]={1,3,2,4,3,2,1,2,4,5,6,6,6,5,4,3,2,6};
	int count=0;
	Arrays.sort(n);
	for(int i=0;i<n.length;i++)
	{
		if(n[n.length-1]==n[i])
			count=count+1;
	}
	System.out.println(count);
	
	}

}
