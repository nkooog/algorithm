package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex_1253 {

	public static void main(String[] args) throws Exception{

		// A[left] + A[right] > K = j--;
		// A[left] + A[right] < K = i++;
		// A[left] + A[right] == K = i++; j--; count++;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(reader.readLine());
		int count = 0;
		long[] arr = new long[N];
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		for(int i=0; i<N; i++) {
			arr[i] = Long.parseLong(tokenizer.nextToken());
		}

		Arrays.sort(arr);

		for(int K = 0; K < N; K++) {
			long find = arr[K];
			int left =0, right= (arr.length -1), sum = 0;

			while(left < right) {
				if(arr[left] + arr[right] == find) {
					count++; left++; right--;
					break;
				}else if(arr[left] + arr[right] < find) {
					left++;
				}else{
					right--;
				}
			}
		}
		System.out.println(count);
		reader.close();
	}
}
