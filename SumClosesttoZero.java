package Arrays;
import java.util.*;
public class SumClosesttoZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,60,-10,70,-80,85};
		
		sum(arr);
	}
	public static void sum(int arr[])
	{
		Arrays.sort(arr);
		int i=0,j=arr.length-1,min=Integer.MAX_VALUE,first_index=0,second_index=0;
		while(i<j)
		{
			if(Math.abs(arr[i]+arr[j])<min)
			{
				min=Math.abs(arr[i]+arr[j]);
				first_index=i;
				second_index=j;
			}
			i++;
			j--;
		}
		System.out.println("Elements having sum nearest to zero are : "+arr[first_index]+" and "+arr[second_index]+" sum is : "+(arr[first_index]+arr[second_index]));
	}
}
