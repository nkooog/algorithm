package programmers;

import java.util.*;

public class stringSort {

	public static void main(String[] args) {

		String[] strings={"sun", "bed", "car"};
		stringSort.solution(strings, 1);

	}

	public static String[] solution(String[] strings, int n) {
		List<String> list = new ArrayList<>();

		for(int i=0; i<strings.length; i++) {
			list.add(strings[i].charAt(n) + strings[i]);
		}

		Collections.sort(list);

		List<String> result = new ArrayList<>();
		list.stream().forEach(e -> result.add(e.substring(1)));

		for(String s: list) {
			System.out.println(s);
		}

		return result.toArray(new String[strings.length]);
	}

}
