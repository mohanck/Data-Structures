package Arrays;

import java.util.Scanner;

public class MaxSlidingWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[8];
		int max_arr[];
		int i,j,var=0,sum_var=Integer.MIN_VALUE,w,temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(i=0;i<arr.length;i++)		
			arr[i]=in.nextInt();
		System.out.println("Enter the sliding window : ");
		w=in.nextInt();
		max_arr=new int[arr.length-2];
		for(i=0;i+w<=arr.length;i++)
		{
			var=0;
			temp=Integer.MIN_VALUE;
			for(j=0;j<w;j++)
			{
				var=arr[i+j]+var;
				if(arr[i+j]>temp)
					temp=arr[i+j];
			}
			max_arr[i]=temp;
			if(var>sum_var)
				sum_var=var;
		}
		System.out.println("Maximum sum in sliding window is : "+sum_var);
		System.out.println("Maximum elements are :");
		for(i=0;i<max_arr.length;i++)		
			System.out.print(max_arr[i]+" ");
	}
}
