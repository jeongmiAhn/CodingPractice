package baekjoon.level7.알파벳_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 받을 문자열
		String s = br.readLine();
		
		// 출력할 배열
		int[] arr = new int[26];
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = -1;
		
		for (int i = 0; i < s.length(); i++)
		{
			// 문자열 분리
			char c = s.charAt(i);
			
			// b 일 경우, arr[1] 은 0 이 된다.
			// 같은 문자일 경우를 고려하여 -1 일 때만 초기화하도록 조건 설정.
			if (arr[c-'a']==-1)
				arr[c-'a'] = i;
		}

		for (int i : arr)
			System.out.print(i + " ");
		
		br.close();
	}	
}
