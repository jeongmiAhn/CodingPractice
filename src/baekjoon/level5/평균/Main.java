package baekjoon.level5.평균;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double score[] = new double[n];
		double sum = 0;
		
		for (int i = 0; i < score.length; i++)
			score[i] = Double.parseDouble(st.nextToken());
		
		Arrays.sort(score);
		
		for (int i = 0; i < score.length; i++)
		{
			score[i] = (score[i] / score[score.length-1]) * 100;
			//System.out.println(score[i]);
			sum += score[i];			
		}
		
		System.out.println(sum/n);
	}
}
