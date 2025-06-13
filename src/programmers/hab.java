package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hab {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int result = N * (N + 1) / 2;

		System.out.println(result);
	}


}
