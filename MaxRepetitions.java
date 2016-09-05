package Arrays;
import java.util.*;

public class MaxRepetitions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={2,2,3,4,2,2,4};
		
		findMaxRepeatingNumber(arr);
		

	}
	
	public static void findMaxRepeatingNumber(int arr[])
	{
		Arrays.sort(arr);
		int count=1;
		int max=0,maxelement=arr[0];
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
					maxelement=arr[i];
				}
				count=1;
			}
		}
		System.out.println("Maximum Repeating Element is : "+maxelement);
	}

}
