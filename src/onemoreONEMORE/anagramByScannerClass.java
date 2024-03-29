package onemoreONEMORE;

import java.util.Arrays;
import java.util.Scanner;

public class anagramByScannerClass {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String a = sc.next();
		System.out.println("Enter the second string");
		String b = sc.next();
		int A=a.length(); int B=b.length();
		if(A==B)
		{
			char[] aa=a.toCharArray();Arrays.sort(aa);
			char[] bb=b.toCharArray();Arrays.sort(bb);
			a=new String(aa);b=new String(bb);
			if(a.equals(b))
			{
				System.out.println("Given Strings are Anagrams");
			}
			else
			{
				System.out.println("Given Strings are not Anagrams");
			}
			
		}
		else
		{
			System.out.println("Given Strings are not Anagrams");
		}

	}

}
