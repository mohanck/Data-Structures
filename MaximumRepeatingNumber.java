package Arrays;
import java.util.*;
public class MaximumRepeatingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,2,2,3,3,3,3,4,4,4,4,4,4,2,2,4,2,2,2,2,2,1,1};
		findMaxRepeatingNumber(arr);
	}
	
	public static void findMaxRepeatingNumber(int arr[])
	{
		int count=1,max=0,num=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;								
			}
			else
			{			
				if(count>max)
				{
					max=count;
					num=arr[i];
				}
				count=1;
			}
		}
		
		System.out.println("Maximum Repeating Number is "+num);
	}

}
