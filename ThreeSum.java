package Arrays;
import java.util.*;
public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1, 4, 45, 6, 10, 8};
		System.out.println("There exists three numbers with sum = 22 : "+threeSum(arr,22));
	}

	public static boolean threeSum(int arr[],int sum)
		{
		    int l, r;
		 
		    /* Sort the elements */
		    Arrays.sort(arr);
		 
		    /* Now fix the first element one by one and find the
		       other two elements */
		    for (int i = 0; i < arr.length - 2; i++)
		    {
		 
		        // To find the other two elements, start two index variables
		        // from two corners of the array and move them toward each
		        // other
		        l = i + 1; // index of the first element in the remaining elements
		        r = arr.length-1; // index of the last element
		        while (l < r)
		        {
		            if( arr[i] + arr[l] + arr[r] == sum)
		            {
		                System.out.print("Triplet is :"+ arr[i] + " "+ arr[l] + " " + arr[r]);
		                System.out.println();
		                return true;
		            }
		            else if (arr[i] + arr[l] + arr[r] < sum)
		                l++;
		            else // A[i] + A[l] + A[r] > sum
		                r--;
		        }
		    }
		 
		    // If we reach here, then no triplet was found
		    return false;
	}
}
