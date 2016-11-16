package Arrays;

public class MergeSortedArrays {
//representing the empty slots using -1
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={-2,-1,2,-1,-1,7,-1,10,-1};
		int arr2[]={-10,5,8,12,100};
		
		mergeSortedArrays(arr1,arr2);
	}
	
	public static void mergeSortedArrays(int[] arr1,int[] arr2)
	{
		
		int j=arr1.length-1,i=j;
		System.out.println("Original array is ");
		for(int k=0;k<arr1.length;k++)
			System.out.print(arr1[k]+" ");
		System.out.println();
		
		while(i>=0)
		{
			if(arr1[i]!=-1)
			{
				arr1[j]=arr1[i];
				arr1[i]=-1;
				j--;
			}
			i--;
		}
	
		i=0;
		int i1=j+1,i2=0;
		
		while(i1<arr1.length && i2<arr2.length)
		{
			if(arr1[i1]<arr2[i2])
			{
				arr1[i++]=arr1[i1++];
			}
			else if(arr1[i1]>arr2[i2])
			{
				arr1[i++]=arr2[i2++];
			}
			else
			{
				arr1[i++]=arr1[i1++];
				arr1[i++]=arr2[i2++];
			}
		}
		while(i1<arr1.length)
			arr1[i++]=arr1[i1++];
		while(i2<arr2.length)
			arr1[i++]=arr2[i2++];
		
		System.out.println("New array is :");
		for(i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
	}

}
