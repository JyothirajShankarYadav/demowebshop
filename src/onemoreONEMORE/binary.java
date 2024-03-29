package onemoreONEMORE;

import java.util.Arrays;
import java.util.Scanner;

public class binary 
{
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Arrays");
	int size=sc.nextInt();
	int [] a=new int[size];
	System.out.println("Enter your Array elements");
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	int f=0;int l=size-1;int mid=(f+l)/2;
	System.out.println("Enter element to be searched");
	int ele=sc.nextInt();
	while(f<=l)
	{
		if(a[mid]==ele)
		{
			System.out.println("Element found");
			break;
		}
		else if(a[mid]<ele)
		{
			f=mid+1;
		}
		else
		{
			l=mid-1;
		}
		mid=(f+l)/2;
	}
	if(f>l)
	{
		System.out.println("Element not found");
	}
 }
}
