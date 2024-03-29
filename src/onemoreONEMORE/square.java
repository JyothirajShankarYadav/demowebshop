package onemoreONEMORE;

public class square 
{
  public static void main(String[] args)
  {
	  int no=7;
	  int sqrt=(int)Math.sqrt(no);
	  if((sqrt*sqrt)==no)
	  {
		  System.out.println(no+" is a Perfect Square number");
	  }
	  else
	  {
		  System.out.println(no+" is not a Perfect Square number"); 
		  int a=(sqrt*sqrt);
		  int b=(sqrt+1)*(sqrt+1);
		  int A=no-a;int B=b-no;
		  if(A<B)
		  {
			  System.out.println(a+" is the nearest Square number");
		  }
		  else
		  {
			  System.out.println(b+" is the nearest Square number");  
		  }
	  }    
  }
}
