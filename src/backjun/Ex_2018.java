package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2018 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());

		int count = 1;
		int left = 1, right = 1, sum = 1;

		while(right != n) {

			if(sum == n) {
				count++;
				right++;
				sum = sum + right;
			}

			if(sum > n) {
				sum = sum - left;
				left++;
			}else{
				right++;
				sum = sum + right;
			}

		}
		System.out.println(count);

	}

}
