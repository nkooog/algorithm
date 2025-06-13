package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex_17298 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] N = new int[Integer.parseInt(reader.readLine())];
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		Stack<Integer> stack = new Stack<>();

		for(int i=0; i<N.length; i++) {
			N[i] = Integer.parseInt(tokenizer.nextToken());
		}

	}

}
