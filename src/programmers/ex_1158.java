package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ex_1158 {

	public static void main(String[] args) throws Exception{

		Queue<Integer> queue = new LinkedList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		Integer N = Integer.valueOf(st.nextToken());
		Integer K = Integer.valueOf(st.nextToken());

		for(int i=1; i<=N; i++) {
			queue.offer(i);
		}

		List<Integer> list = new ArrayList<>();
		StringBuffer buffer = new StringBuffer();
		buffer.append("<");

		while(!queue.isEmpty()) {
			for(int i=0; i<K-1; i++) {
				if(!queue.isEmpty()) {
					queue.offer(queue.poll());
				}
			}
			list.add(queue.poll());
		}

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
