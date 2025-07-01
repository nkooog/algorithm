package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex_11047 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception{

		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] K = new int[N];

		while(N-- > 0) {
			K[N] = Integer.parseInt(reader.readLine());
		}

		int count = 0;
		for(int x : K) {
			if(M == 0) break;
			count += M / x;
			M -= (M / x) * x;
		}

		System.out.println(count);

	}

}
