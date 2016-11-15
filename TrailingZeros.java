package Arrays;

public class TrailingZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int count=0;
		for(int i=5;(num/i)>0;i=i*5)
		{
			count=count+(num/i);
		}
		System.out.println("Number of trailing zeros are : "+count);
	}

}
