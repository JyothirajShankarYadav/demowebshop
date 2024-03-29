package onemoreONEMORE;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class orderOfOccurance 
{
	public static void main(String[] args) 
	{
		String name="uniqueidentificationauthorityofindia";
		LinkedHashMap< Character,Integer> map=new LinkedHashMap();
		char [] c=name.toCharArray();
		for(char ch : c)
		{
		 if(map.containsKey(ch))
		 {
			 map.put(ch, 1);
		 }
		 else
		 {
			 int no=map.get(c);
			 map.put(ch, no+1);
		 }
		}
		for(Entry<Character, Integer> e : map.entrySet())
		{
			System.out.println(e.getKey()+" ===> "+e.getValue());
		}

	}

}
