package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex_14425 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static int count = 0;
	static String[] target = null;
	static String[] groups = null;

	public static void main(String[] args) throws Exception{

		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

		target = parseArray(Integer.parseInt(st.nextToken()));
		groups = parseArray(Integer.parseInt(st.nextToken()));

		binarySearch();
		System.out.print(count);

	}

	public static void binarySearch() throws Exception {

		for(int i=0; i < groups.length; i++) {

			int left=0, right=target.length-1, mid=0;

			while(left <= right) {

				mid = (left+right) / 2;
				int result = groups[i].compareTo(target[mid]);

				if( result < 0 ) {
					right = mid - 1;
				}else if(result > 0){
					left = mid + 1;
				}else {
					count++;
					break;
				}

			}

		}
	}

	public static String[] parseArray(int size) throws IOException {

		String[] arr = new String[size];

		for(int i=0; i<size; i++) {
			arr[i] = reader.readLine();
		}
		Arrays.sort(arr);
		return arr;
	}

}
