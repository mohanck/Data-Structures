package Arrays;

public class countOccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,2,2,2,2,3,4,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,7,8,9};
		System.out.println("Occurrence of 2 is "+count(2,arr,0,arr.length-1));
		System.out.println("Occurrence of 6 is "+count(6,arr,0,arr.length-1));
		System.out.println("Occurrence of 6 is "+countSearch(6,arr,0,arr.length-1));
		System.out.println("Occurrence of 2 is "+countSearch(2,arr,0,arr.length-1));

	}
	
	public static int count(int num,int arr[],int start,int end)
	{
		if(start>end)
			return 0;
		if(arr[start]>num)
			return 0;
		if(arr[end]<num)
			return 0;
		if(arr[start]==num && arr[end]==num)
			return end-start+1;
		
		int mid=(start+end)/2;
		if(arr[mid]>num)
			return count(num,arr,start,mid-1);
		else if(arr[mid]<num)
			return count(num,arr,mid+1,end);
		else //(arr[mid]==num)
			return 1+count(num,arr,start,mid-1)+count(num,arr,mid+1,end); 
	}
	
	public static int countSearch(int num,int arr[],int start,int end)
	{
		if(start>end)
			return 0;
		else
		{
			int mid=(start+end)/2;
			if(arr[mid]>num)
				return count(num,arr,start,mid-1);
			else if(arr[mid]<num)
				return count(num,arr,mid+1,end);
			else
			{
				int i,j,begin,finish;
				for(i=mid-1;arr[i]==num;i--);
				 begin=i+1;
				for(j=mid+1;arr[j]==num;j++);
				 finish=j-1;
				return finish-begin+1; 					
			}
		}
	}

}
