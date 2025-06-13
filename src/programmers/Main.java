package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int i = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		while(st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}

		for(int x : arr) {
			if(x > max) max = x;
			if(x < min) min = x;
		}
		System.out.println(max);
		System.out.println(min);
	}

}