package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex_11399 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception{

		int N = Integer.parseInt(reader.readLine());

		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
		int[] arr = new int[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}

		Arrays.sort(arr);

		int sum = 0;
		int count = 0;
		for(int num : arr) {
			sum += num;
			count += sum;
		}

		System.out.println(count);
	}


}
