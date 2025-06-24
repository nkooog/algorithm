package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hab {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int result = N * (N + 1) / 2;

		System.out.println(result);
		System.out.println(1/2);
	}


}
