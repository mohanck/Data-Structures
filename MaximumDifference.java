package Arrays;

public class MaximumDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,8,19,20,20,10,100,0,99};
		maximumDifference(arr);
	}
	public static void maximumDifference(int[] arr)
	{
		int min=arr[0];
		int diff=arr[1]-arr[0];
		if(diff<0)
			diff=-diff;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]-min > diff)
				diff=arr[i]-min;
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum Difference is "+diff);
	}
}
