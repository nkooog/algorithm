package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex_12891 {


	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int S = Integer.parseInt(tokenizer.nextToken());
		int P = Integer.parseInt(tokenizer.nextToken());
		int result = 0;

		char[] text = reader.readLine().toCharArray();

		int left = 0, right = (P-1);
		int[] valid = new int[4];

		tokenizer = new StringTokenizer(reader.readLine());
		int len = tokenizer.countTokens();
		char[] input = new char[len];

		for(int i=0; i<len; i++) {
			input[i] = tokenizer.nextToken().charAt(0);
		}

		while(right < S) {

			for(int i=left; i<=right; i++) {
				switch (text[i]) {
					case 'A' -> valid[0] = ++valid[0];
					case 'C' -> valid[1] = ++valid[1];
					case 'G' -> valid[2] = ++valid[2];
					case 'T' -> valid[3] = ++valid[3];
				}
			}

			if(Arrays.toString(valid).equals(Arrays.toString(input)))
				result++;

			Arrays.fill(valid, 0);
			left++; right++;
		}
		System.out.println(result);
	}
}
