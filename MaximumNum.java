package Arrays;

/*
 * Given an array of elements which is first increasing and then decreasing, 
 * find the maximum element in the array.
 */
public class MaximumNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]=new int[100];
    for(int i=0;i<=98;i++)
    	arr[i]=i+1;
    arr[99]=0;
    
    System.out.println("Maximum number in the array is :"+findMax(arr,0,arr.length-1));
	}

	public static int findMax(int arr[],int start,int end)
	{
		if(start>end)
			return 0;
		int mid=(start+end)/2;
			if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1])
				return findMax(arr,mid+1,end);
			else if(arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1])
				return findMax(arr,start,mid-1);	
			else
				return arr[mid];
			
	}
}
