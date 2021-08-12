package baekjoon.level5.최소_최대;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		// 기준 잡기 → arr[0] 
		
		int max = arr[0];
		int min = arr[0];
  
		/*
		for (int i : arr)
		{
			if (max < i)
				max = i; 
			if (min > i)
				min = i;
		}
		*/
		
		for (int i = 0; i < n; i++) 
		{ 
			if (max < arr[i])
				max = arr[i]; 
			if (min > arr[i])
				min = arr[i];
		}
		
  
		bw.write(min + " " + max);
  
		bw.flush();
		bw.close();
		br.close();	 
	}
}
