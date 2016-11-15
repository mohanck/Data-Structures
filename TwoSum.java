package Arrays;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5, 3, 7, 0, 1, 4, 2};
		int sum=5;
		
		finddistinctnums(arr,sum);

	}

	public static void finddistinctnums(int[] arr,int sum)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		Arrays.sort(arr);
		int left=0,right=arr.length-1;
		System.out.println("1 ) Pairs that add upto the sum "+sum+" are : ");
		while(left<=right)
		{
			if(arr[left]+arr[right]==sum)
			{
				hm.put(arr[left],arr[right]);
				System.out.println(arr[left]+" "+arr[right]);
				left++;
				right--;
				continue;
			}
			else if(arr[left]+arr[right]<sum)
				left++;
			else
				right--;
		}
		System.out.println("Pairs that add upto the sum "+sum+" are : ");
		for(@SuppressWarnings("rawtypes") Map.Entry e:hm.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
	 }
}
