package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex_10815 {

	final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	final static StringBuilder BUILDER = new StringBuilder();

	public static void main(String[] args) throws Exception{

		Integer N = Integer.valueOf(READER.readLine());

		int[] nList = tt(N);
		Arrays.sort(nList);

		Integer M = Integer.valueOf(READER.readLine());

		int[] mList = tt(M);

		boolean isValid = false;

		for(int i=0; i<mList.length; i++) {
			BUILDER.append(search(nList, mList[i])).append(" ");
		}

		System.out.println(BUILDER.toString());

	}

	public static int search(int[] nList, int index) {

		int left = 0;
		int right = nList.length - 1;
		int middle = 0;

		while(left <= right) {
			middle = (left + right) / 2;

			if(nList[middle] == index) {
				return 1;
			}else{
				if(nList[middle] < index) {
					left = middle + 1;
				}
				if(nList[middle] > index) {
					right = middle -1;
				}
			}
		}
		return 0;
	}

	public static int[] tt(Integer n) throws Exception{

		String result = READER.readLine();
		StringTokenizer st = new StringTokenizer(result, " ");
		int[] arr = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		return arr;

	}

}
