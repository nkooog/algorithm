package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex_1253 {

	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.valueOf(reader.readLine());

		String[] s = reader.readLine().split(" ");

		if(N != s.length) {
			return;
		}

		Integer[] arr = new Integer[s.length];

		for(int i=0; i<s.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}

		Integer result = 0;
		Arrays.sort(arr);

		List<Integer> list =new ArrayList<>();

		for(int i=0; i<s.length; i++) {

			Integer left = 0;
			Integer right = arr.length - 1;

			while(left < right) {

				if(left == i) {
					left++;
					continue;
				}else if(right == i) {
					right--;
					continue;
				}

				if(arr[left] + arr[right] == arr[i]) {
					result++;
					break;
				}else if(arr[left] + arr[right] < arr[i]) {
					left++;
				}else{
					right--;
				}
			}
		}
		System.out.println(result);
	}

}
