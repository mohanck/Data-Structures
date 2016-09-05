package Arrays;

import java.util.Scanner;

public class MatrixRotation {

	/**
	 * @param args
	 */	
	static int arr[][]=new int[5][5];
	static int k=1;
	static int n=10;
	static int a[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=in.nextInt();
		a=new int[(n/2)];
		
		for(int m=0;(2*m+1)<n;m++)
			a[m]=(2*m)+1;	
		
		System.out.print("Array containing odd numbers upto "+n+" is : ");
		
		for(int m=0;(2*m+1)<n;m++)
			System.out.print(a[m]+" ");	
	    System.out.println();
		System.out.println("-----------------MATRIX ROTATION-----------------------");
		System.out.println();
		for (int i = 0; i < arr[0].length; i++) 
		{
			for(int j=0;j<arr[0].length;j++)
				arr[i][j]=k++;
		}
	    
		System.out.println("Array before is : ");
		for (int i = 0; i < arr[0].length; i++) 
		{
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	    rotate(arr);
		System.out.println("Array after is : ");
		for (int i = 0; i < arr[0].length; i++) 
		{
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	in.close();
	
	}
public static void rotate(int arr[][])
{
	int temp=0,size=arr[0].length; 
	for(int row=0;row<size/2;row++)
	{	
		for(int col=row;col<size-row-1;col++)
		{
			temp=arr[row][col];
			arr[row][col]=arr[size-1-col][row];			
			arr[size-1-col][row]=arr[size-1-row][size-1-col];
			arr[size-1-row][size-1-col]=arr[col][size-1-row];
			arr[col][size-1-row]=temp;		
		}
	}
}

}
