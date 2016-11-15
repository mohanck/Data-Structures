package Arrays;

import java.util.HashSet;
import java.util.Iterator;

public class unionandintersection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,3,4,5,7};
		int arr2[]={2,3,5,6};
		
		findunionandintersectionwithoutmemory(arr1,arr2);
		findunionandintersectionusingmemory(arr1,arr2);

	}
	
	public static void findunionandintersectionwithoutmemory(int[] arr1,int[] arr2)
	{
		int i=0,j=0,k_union=0,k_intersection=0;
		int[] union=new int[arr1.length+arr2.length];
		int[] intersection = new int[Math.max(arr1.length,arr2.length)];
		
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				union[k_union]=arr1[i];
				i++;
				k_union++;
			}
			else if(arr1[i]>arr2[j])
			{
				union[k_union]=arr2[j];
				j++;
				k_union++;
			}
			else
			{
				union[k_union]=arr1[i];
				intersection[k_intersection]=arr2[j];
				i++;
				j++;
				k_union++;
				k_intersection++;
			}
		}
		while(i<arr1.length)
			union[k_union++]=arr1[i++];
		while(j<arr2.length)
			union[k_union++]=arr2[j++];
		
		System.out.print("Union array is : ");
		for(i=0;i<union.length;i++)
			System.out.print(union[i]+" ");
		System.out.println();
		
		System.out.print("Intersection array is : ");
		for(i=0;i<intersection.length;i++)
			System.out.print(intersection[i]+" ");     //PROBLEM
	}
	
	public static void findunionandintersectionusingmemory(int[] arr1,int[] arr2)
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		int union[];
		int intersection[]=new int[Math.max(arr1.length,arr2.length)];
		for(int i:arr1)
			hs.add(i);
		int j=0;
		for(int i:arr2)
		{
			if(hs.contains(i))
				intersection[j++]=i;	
			else
				hs.add(i);
		}
		union=new int[hs.size()];
		Iterator<Integer> itr=hs.iterator();
		int i=0;
		while(itr.hasNext())
		{
			union[i++]=itr.next();
		}
		
		System.out.println();
		System.out.print("Union array is : ");
		for(i=0;i<union.length;i++)
			System.out.print(union[i]+" ");
		System.out.println();
		
		System.out.print("Intersection array is : ");
		for(i=0;i<intersection.length;i++)
			System.out.print(intersection[i]+" ");     //PROBLEM
		
	}

}
