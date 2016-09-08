import java.util.Scanner;

public class encryt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		StringBuilder sp=new StringBuilder();
		char a[]=new char[s.length()];
		for (int i = 0; i < c.length-1; i++) {
			if(c[i]=='a')
			{
				a[i]='z';
			}
			else
			{
				int n=(int)c[i];
				a[i]=(char)(n-1);
			}
		
			}	
		for(int j=0;j<c.length-1;j++)
		{
			sp.append(a[j]);
		}
		sp.append(c[c.length-1]);
		
		System.out.println(sp);
		

	}

}
