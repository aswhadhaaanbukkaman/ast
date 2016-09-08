import java.util.*;
public class rev {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		
		StringBuilder sp2=new StringBuilder();
		
		for(String sp:s1)
		{
			StringBuffer st=new StringBuffer(sp);
			String st2=st.reverse().toString();
			for(int i=0;i<sp.length();i++)
			{
				
				if(Character.isUpperCase(sp.charAt(i)))
						{
					String c =st2.substring(i,i+1).toUpperCase();
					sp2.append(c);
					     
						}
			      if(Character.isLowerCase(sp.charAt(i)))
				     {
				       sp2.append(st2.substring(i,i+1).toLowerCase());
					}
			      
			}sp2.append(" ");
			
		 }
		System.out.println(sp2);
		
	}

}
