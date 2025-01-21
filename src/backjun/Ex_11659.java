package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_11659 {

	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int sNo = Integer.parseInt(tokenizer.nextToken());
		int qNo = Integer.parseInt(tokenizer.nextToken());

		long[] arr = new long[sNo + 1];
		tokenizer = new StringTokenizer(reader.readLine());

		// 구간 합 배열 S[i] = S[i-1] + input
		for(int i=1; i<=sNo; i++) {
			arr[i] = arr[i-1] + Long.valueOf(tokenizer.nextToken());
		}

		// 구간 합 S[end] = S[end] - S[start-1]
		for(int j=0; j<qNo; j++) {
			tokenizer = new StringTokenizer(reader.readLine());
			int start = Integer.parseInt(tokenizer.nextToken());
			int end = Integer.parseInt(tokenizer.nextToken());

			System.out.println(arr[end] - arr[start - 1]);

		}
		System.out.println();

	}

}
