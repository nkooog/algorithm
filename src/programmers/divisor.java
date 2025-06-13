package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class divisor {

	public static void main(String[] args) {
		int[] arr= {3,2,6};
		divisor.solution(arr, 10);
	}

	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();

		for(int x : arr) {
			if(x % divisor == 0) {
				list.add(x);
			}
		}

		if(list.isEmpty()) list.add(-1);

		Collections.sort(list);
		answer = list.stream().mapToInt(Integer::intValue).toArray();

		for(int x: answer) {
			System.out.println(x);
		}

		return answer;
	}

}
