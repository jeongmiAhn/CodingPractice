package baekjoon.level4.빠른_A_B;

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
		
		// 테스트 케이스의 개수
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i = 0; i < n; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			
			// write 메소드를 사용할 경우, System.out.println 처럼 바로 출력되지 않는다.
			// 직접 출력 stream 에 반영되는 것이 아니라 성능을 위해 buffer 에 저장해 두었다가
			// flush 되거나 close 되었을 때 한번에 출력 stream 에 반영하기 때문이다. 
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		
		br.close();
		
		// 출력
		bw.flush();
		// 메모리 반납
		bw.close();
	}
}
