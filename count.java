import java.util.Scanner;

public class count {
  public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int count=0;
	      for(int i=0;i<n;i++)
	      {
	    	  String s=i+"";
	    	 for(int j=0;j<s.length();j++)
	    	  {
	    		  
	    		  if(s.charAt(j)=='2')
	    		  {
	    			  count=count+1;
	    		  }
	    		  else 
	    			  {
	    			  continue;
	    			  
	    			  }
	    		  
	    		  
	    	    }
	    	    
	      }
         System.out.println(count);
	}

}
