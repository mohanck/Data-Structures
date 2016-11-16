package Arrays;

public class Leader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={16,17,4,3,5,2};
		
		findLeader(arr);
		
	}
	
	public static void findLeader(int[] arr)
	{
		int i;
		System.out.print("Leaders are : ");
		/*
		 * int j;for(i=arr.length-1;i>=0;i--)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]<=arr[j])
					break;
			}
			if(j>=arr.length-1)
				System.out.print(arr[i]+" ");
		}
		*/
		int max=arr[arr.length-1];
		System.out.print(max+" ");
		for(i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>max)
			{
				System.out.print(arr[i]+" ");
				max=arr[i];
			}
		}
	}

}
