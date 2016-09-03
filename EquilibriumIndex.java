package Arrays;

public class EquilibriumIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={2,3,4,10,9};
		int left[]=new int[arr.length];
		int right[]=new int[arr.length];
		
		left[0]=0;		
		for(int i=1;i<left.length;i++)
			left[i]=left[i-1]+arr[i-1];
		
		right[right.length-1]=0;		
		for(int j=right.length-2;j>=0;j--)
			right[j]=right[j+1]+arr[j+1];
			
		System.out.print("Equilibrium index is : ");
		for(int k=0;k<arr.length;k++)
			if(left[k]==right[k])
				System.out.println(arr[k]);
		
	}

}
