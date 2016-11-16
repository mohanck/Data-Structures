package Arrays;
import java.util.*;

public class Duplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,2,3,5,6,9,8,2,0,4};
		int arr1[]={1, 2, 3, 1, 3, 6, 6};
		int arr2[]={1,2,3,4,5,6,1,2,3,4,6};
		
		findDuplicates(arr);
		
		findDuplicates(arr1);
		
		findnonrepeatingnumber(arr2);
		
		findNonRepeatingNumberWithMap(arr2);
		
		findnonrepeatingnumberwithXOR(arr2);

	}
	
	public static void findDuplicates(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[Math.abs(arr[i])]>=0)
				arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			else
			{
				System.out.println(Math.abs(arr[i]) + " is repeating");
			}
		}
	}
	
	public static void findnonrepeatingnumber(int arr[])
	{
		Arrays.sort(arr);
		int i=0;
		for(i=0;i<arr.length-2;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				if(arr[i+1]!=arr[i+2])
				{
					System.out.println(arr[i+1] + " is the non-repeating number");
					break;
				}
			}
		}
		if(i==arr.length-2)
		{
			System.out.println(arr[i+1]+" is the non-repeating number");
		}
	}
	
	public static void findNonRepeatingNumberWithMap(int [] arr)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!hm.containsKey(arr[i]))
				hm.put(arr[i],1);
			else
				hm.put(arr[i],hm.get(arr[i])+1);
		}
		
		for(@SuppressWarnings("rawtypes") Map.Entry e:hm.entrySet())
		{
			if((int)e.getValue()==1)
				System.out.println(e.getKey()+" is the non-repeating number");
		}
	}
	
	public static void findnonrepeatingnumberwithXOR(int[] arr)
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
			j=j^arr[i];
		System.out.println("Non-Repeating Number is : "+j);
	}

}
