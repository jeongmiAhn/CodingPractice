package baekjoon.level5.평균은_넘겠지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트케이스 개수 
		int testcase = Integer.parseInt(br.readLine());
		// 배열
		int[] arr;

		StringTokenizer st;
		
		for (int i = 0; i < testcase; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			
			// 학생 수 
			int n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			
			// 성적 누적 합
			double sum = 0;
			
			for (int j = 0; j < n; j++)
			{
				int val = Integer.parseInt(st.nextToken());
				
				arr[j] = val;
				sum += val;
			}
			
			// 평균
			double avg = sum/n;
			// 평균을 넘는 학생 수
			double cnt = 0;
			
			for (int j = 0; j < n; j++)
			{
				if (arr[j] > avg)
					cnt++;
			}
			
			System.out.printf("%.3f%%\n", (cnt/n)*100);			
		}
		
		br.close();
	}
}
