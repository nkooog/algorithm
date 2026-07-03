package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1546 {

	// 시간제한 2초
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


		int N = Integer.parseInt(reader.readLine());
		int[] arr = new int[N];
		double max = 0;
		double sum = 0;

		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(tokenizer.nextToken());
			arr[i] = num;
			if(num > max) {
				max = num;
			}
		}

		for(int i=0; i<N; i++) {
			sum += (arr[i] / max) * 100;
		}

		System.out.println(sum/N);

	}

}
