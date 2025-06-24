package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 입력: [1] → 중앙값: 1
 입력: [1, 5] → 중앙값: 1 (두 개일 땐 작은 쪽 출력)
 입력: [1, 5, 2] → 정렬: [1, 2, 5] → 중앙값: 2
 입력: [1, 5, 2, 10] → 정렬: [1, 2, 5, 10] → 중앙값: 2
 입력: [1, 5, 2, 10, -99] → 정렬: [-99, 1, 2, 5, 10] → 중앙값: 2
 입력: [1, 5, 2, 10, -99, 7] → 정렬: [-99, 1, 2, 5, 7, 10] → 중앙값: 2
 입력: [1, 5, 2, 10, -99, 7, 5] → 정렬: [-99, 1, 2, 5, 5, 7, 10] → 중앙값: 5
 */

public class ex_1655 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception{

		StringBuilder builder = new StringBuilder();

		PriorityQueue<Integer> left = new PriorityQueue(Collections.reverseOrder());
		PriorityQueue<Integer> right = new PriorityQueue();


		int N = Integer.parseInt(reader.readLine());

		while(N-- > 0) {

			int M = Integer.parseInt(reader.readLine());

			if(left.size() == 0) {
				left.offer(M);
				builder.append(left.peek()).append("\n");
				continue;
			}

			if(left.size() >= right.size() + 1) {

				// left 원소가 더 많은 경우

				if(right.size() == 0) {

					if(M > left.peek()) {
						right.offer(M);
					}else{
						right.offer(left.poll());
						left.offer(M);
					}
					builder.append(left.peek()).append("\n");
					continue;
				}

				left.offer(M);
				right.offer(left.poll());

			}else{
				left.offer(M);

				if(right.peek() < left.peek()) {
					int r = right.poll();
					int l = left.poll();
					left.offer(r);
					right.offer(l);
				}

			}
			builder.append(left.peek()).append("\n");
		}
		System.out.println(builder.toString());
	}

}
