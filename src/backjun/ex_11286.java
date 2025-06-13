package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class ex_11286 {

	static PriorityQueue<Integer> q = new PriorityQueue(
			(a, b) -> {
				int a1 = Math.abs((Integer) a);
				int b1 = Math.abs((Integer) b);

				return a1 == b1 ? Integer.compare((int) a, (int) b) : Integer.compare(a1, b1);

			}
	);
	static StringBuilder builder = new StringBuilder();
	public static void main(String[] args) throws Exception{



		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(reader.readLine());

		for(int i=0; i<N; i++) {

			String command = reader.readLine();

			if(command.equals("0")) {
				builder.append(
						q.isEmpty() ? "0" : q.poll()
				).append("\n");
			}else{
				q.offer(Integer.valueOf(command));
			}
		}

		System.out.println(builder.toString());

	}

}
