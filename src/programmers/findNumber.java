package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class findNumber {

	public static void main(String[] args) throws Exception{

		Boolean isValid = true;
		Integer[] arr = null;
		Integer[] target = null;

		final String SEPERATOR = " ";


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer buffer = new StringBuffer();
		while(isValid) {

			Integer size = Integer.valueOf(br.readLine());
			String data = br.readLine();

			arr = new Integer[size];
			StringTokenizer st = new StringTokenizer(data, SEPERATOR);

			int index =0;

			while(st.hasMoreTokens()) {
				arr[index] = Integer.parseInt(st.nextToken());
				index++;
			}

			index = 0;

			Arrays.sort(arr);

			// arr 삽입정렬 (이진탐색을 위한 정렬 선행)
			// 삽입정렬은 O(N2)이므로 현재 문제에서 N <= 100,000이니까 부적합함 최악인 경우 10,000,000,000번 연산이 필요하므로... 무슨말인지
			/*for(int i=1; i<arr.length; i++) {
				for(int j=i; j > 0; j--) {
					if(arr[j] < arr[j-1]){
						int tmp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = tmp;
					}
				}
			}*/

			size = Integer.valueOf(br.readLine());
			data = br.readLine();
			target = new Integer[size];

			st = new StringTokenizer(data, SEPERATOR);

			while(st.hasMoreTokens()) {
				target[index] = Integer.parseInt(st.nextToken());
				index++;
			}

			for(int i=0; i<target.length; i++) {

				int low = 0;
				int high = arr.length-1;
				int mid = 0;
				int value = target[i];

				while(low<=high) {
					mid = (low + high) / 2;

					if(value < arr[mid]) {
						high = mid - 1;
					}else if(value > arr[mid]) {
						low = mid + 1;
					}else if(value == arr[mid]){
						buffer.append("1");
						break;
					}
				}

				if(low>high) buffer.append("0");

			}
			isValid = false;
			br.close();
		}

	}

}
