package Arrays;
import java.util.*;
public class NonRepeatingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,2,7,9,9,7,4,5,3};
		findNonRepeatingNumber(arr);
	}
	public static void findNonRepeatingNumber(int[] arr)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i:arr)
		{
			if(hm.containsKey(i))
				hm.put(i, hm.get(i)+1);
			else
				hm.put(i, 1);
		}
		
		System.out.println("Hash Map contents are :");
		for(@SuppressWarnings("rawtypes") Map.Entry e:hm.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
		
		for(@SuppressWarnings("rawtypes") Map.Entry e:hm.entrySet())
		{
			if((int)e.getValue()==1)
				System.out.println("Non Repeating Number is "+e.getKey());
			
		}
		
	}
}
