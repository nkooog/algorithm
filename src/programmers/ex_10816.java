package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ex_10816 {

	public static void main(String[] args) {



		Integer[] i = {6,3,2,10,10,10,-10,-10,7,3};

		List<Integer> list1 = Arrays.asList(i);
		List<Integer> list2 = Arrays.stream(i).sorted().collect(Collectors.toList());

		Collections.sort(list1);

		int left = 0 , right = list2.size()-1, mid = 0, target = 10;

		boolean isVal = false;

		while(left<=right) {
			mid = (left+right)/2;

			if(list2.get(mid) == target) {
				isVal = true;
				break;
			}

			if(list2.get(mid) < target) {
				left = mid + 1;
			}

			if(list2.get(mid) > target) {
				right = mid - 1;
			}
		}

	}

}
