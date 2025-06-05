package Preparation;
import java.util.HashMap;

public class SubArraySumEqualsK {
	
	public static int subArraySum(int[] arr,int k)
	{
		int count=0, sum=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0,1 );
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(map.containsKey(sum-k))
			{
				count++;
			}
			map.put(sum, 1);
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {3,4,7,2,-3,1,4,2};
		int k=7;
		System.out.println(subArraySum(arr,k));
	}

}
