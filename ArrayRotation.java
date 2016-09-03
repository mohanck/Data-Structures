package Arrays;

public class ArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,2,3,4,5,6};
		
		int d=2;
		
		System.out.print("Original Array is : ");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		
		if(arr.length%d==0)
		{
			int temp=0;
			for(int j=0;j<d;j++)
			{
				for(int i=j;(i+d)<arr.length;i+=d) // MOVE I FORWARD BY D STEPS
				{
					temp=arr[i];
					arr[i]=arr[i+d];
					arr[i+d]=temp;
				}
			}
		}
		else
		{
			while(d>0)
			{
				rotate(arr);
				d--;
			}
		}
		
		System.out.print("Modified Array is : ");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();

	}
	
	public static void rotate(int[] arr)
	{
		int temp=arr[0];    //STORE THE ZEROTH INDEX ELEMENT IN A TEMP VARIABLE
		int i=1;
		for(i=1;i<arr.length;i++)
			arr[i-1]=arr[i];
		arr[i-1]=temp;
	}

}
