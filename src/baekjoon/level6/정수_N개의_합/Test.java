package baekjoon.level6.정수_N개의_합;

public class Test
{
	public static long sum(int[] a)
	{
		long sum = 0;
		
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		
		return sum; 
	}
}
