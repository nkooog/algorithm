package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ex_1966 {

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Queue<int[]> queue = new LinkedList<>();



		int[] priorities = {1, 2, 9, 1};
//		int[] priorities = {3, 6, 7, 1};
		for (int i = 0; i < priorities.length; i++) {
			queue.add(new int[]{i, priorities[i]});
		}

		//

		System.out.println(queue.peek()[1]);
		// 1. pq = [9],[2],[9],[1]
		// 2. pq = [1],[2],[9],[1]


	}

}
