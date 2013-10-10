/*
 * Function that finds the missing element in an array
 * 
 * ex: {1, 2, 3, 5} <- missing element is 4
 */

public class MissingElement {
	
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 5};
		solution(a);
		System.out.println(solution(a));
	}
	
	
	public static int solution(int[] A)
	{
		//get length of the array
		float len = A.length+1;
		//formula to get expected sum of all elements in the array
		float expectedsum = len/2 * (len + 1);
		//System.out.println("expected: " + expectedsum);
		//calculate actual sum of all elements in the array
		float actualsum = 0;
		
		for (int i = 0; i < A.length; i++)
		{
			actualsum += A[i];
		}
		//System.out.println("actual: " + actualsum);
		//missing number will be the difference
		return (int)(expectedsum - actualsum);
	}
	
	
}
