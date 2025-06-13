package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class ex_1927 {
	static PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
	static StringBuilder builder = new StringBuilder();
	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());

		while(N-- > 0) {

			int command = Integer.parseInt(reader.readLine());

			if(command == 0) {
				builder.append(queue.isEmpty() ? 0 : queue.poll()).append("\n");
			}else{
				queue.offer(command);
			}
		}
		System.out.println(builder.toString());
	}

}
