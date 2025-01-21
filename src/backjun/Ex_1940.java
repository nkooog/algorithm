package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex_1940 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(reader.readLine());
		int hab = Integer.parseInt(reader.readLine());
		int[] arr = new int[N];
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(tokenizer.nextToken());
		}

		int left = 0, right = arr.length - 1, sum = 0, count = 0;

		Arrays.sort(arr);

		while(left < right){
			sum = arr[left] + arr[right];
			if(sum == hab) {
				count++;
				left++; right--;
			}else if(sum > hab) {
				right--;
			}else{
				left++;
			}
		}
		System.out.println(count);
	}

}
