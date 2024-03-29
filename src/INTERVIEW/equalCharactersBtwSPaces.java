package INTERVIEW;

public class equalCharactersBtwSPaces 
{
	public static void main(String[] args)
	{
		String a="alpha tango whiskey";
		String rev[]=a.split(" ");
		String fin="";
		for(int i=0;i<rev.length;i++)
		{
			for(int j=rev[i].length()-1;j>=0;j--)
			{
				fin=fin+rev[i].charAt(j);
			}
			fin=fin+" ";
		}
		System.out.println(fin);
	}
}
