package programmers;

import java.util.ArrayList;
import java.util.List;

public class chainNumber {

	public static void main(String[] args) {
		int[] arr= {4,4,4,3,1};
		chainNumber.solution(arr);
	}

	public static int[] solution(int []arr) {
		int[] answer = {};

		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);

		for(int i=1; i<arr.length; i++) {
			if(arr[i - 1] == arr[i]) {
				continue;
			}else{
				list.add(arr[i]);
			}
		}

		answer = list.stream().mapToInt(Integer::intValue).toArray();

		return answer;
	}

}
