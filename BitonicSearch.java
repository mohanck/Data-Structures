package Arrays;

public class BitonicSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,5,6,7,8,12,19,-10,-11,-12,-13,-14,-15};
		
		find(arr,0,arr.length-1);
		
	}

	public static void find(int arr[],int start,int end)
	{
		if(start>end)
			return;
		if(start==end)
		{
			System.out.println("Element is : "+arr[start]);
			return;
		}
		int mid=start+(end-start)/2;
		if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])			//ELEMENT FOUND!
		{
			System.out.println("Element is : "+arr[mid]);
			return;
		}
		else if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1])		//SEARCH IN RIGHT HALF
			find(arr,mid+1,end);
		else if(arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1])		//SEARCH IN LEFT HALF
			find(arr,start,mid-1);
	}
	
}
