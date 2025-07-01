package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ex_2776 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) throws Exception{


		int T = Integer.parseInt(reader.readLine());

		while(T-- > 0) {
			reader.readLine();
			int[] A = setData(reader.readLine());
			reader.readLine();
			int[] B = setData(reader.readLine());

			binarySearch(A, B);
		}


		System.out.println(builder.toString());

	}

	public static void binarySearch(int[] A, int[] B) {

		Arrays.sort(A);

		for(int i=0; i<B.length; i++) {

			int left= 0, mid = 0, right = A.length - 1;

			while(left <= right) {
				mid = (left + right) / 2;

				if(A[mid] > B[i]) {
					right = mid - 1;
				}else if(A[mid] < B[i]) {
					left = mid + 1;
				}else if(A[mid] == B[i]){
					builder.append("1").append("\n");
					break;
				}

				if(left > right) {
					builder.append("0").append("\n");
					break;
				}
			}

		}

	}

	public static int[] setData(String s) {
		StringTokenizer st = new StringTokenizer(s, " ");
		int[] arr = new int[st.countTokens()];
		int i = 0;
		while(st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		return arr;
	}

}
