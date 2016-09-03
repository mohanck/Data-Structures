package Arrays;

public class majorityElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,1,1,3,3,2,2,3,3,3,2,3,3};
		//int arr[]={1,1,1,1,1,2,2,2,1,2,4,2,2};
		
		findMajorityElement(arr);
		
	}

	public static void findMajorityElement(int[] arr)
	{
		int count=0,maj=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(count==0)
			{
				maj=arr[i];
			}
			if(arr[i]==maj)
				count++;
			else
				count--;
			
		}
		if(count>0)
		{
			count=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==maj)
					count++;
			}
		}
		if(count>arr.length/2)
			System.out.println("Majority Element is "+maj);
		else
			System.out.println("No Majority Element exists");
	}
}
