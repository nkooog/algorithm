package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex_11866 {

	public static void main(String[] args) throws IOException {

		Queue<Integer> queue = new LinkedList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		Integer n = Integer.valueOf(st.nextToken());
		Integer m = Integer.valueOf(st.nextToken());

		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}

		LinkedList<Integer> list = new LinkedList<>();

		StringBuffer buffer = new StringBuffer();

		while(!queue.isEmpty()) {

			for(int i=1; i < m; i++) {
				queue.offer(queue.poll());
			}
			list.add(queue.poll());

		}
		buffer.append("<");

		for(int i=0; i<list.size(); i++) {
			buffer.append(list.get(i));
			if(i < list.size() - 1) {
				buffer.append(", ");
			}
		}

		buffer.append(">");
		System.out.println(buffer.toString());

	}

}
