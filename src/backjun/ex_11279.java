package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class ex_11279 {

	static LinkedList<Integer> queue = new LinkedList<>();
	static StringBuilder builder = new StringBuilder();
	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());

		while(N-- > 0) {

			int command = Integer.parseInt(reader.readLine());

			if(command == 0) {
				builder.append(queue.isEmpty() ? 0 : queue.poll()).append("\n");
			}else{
				int i = 0;
				while (i < queue.size() && queue.get(i) >= command) {
					i++;
				}
				queue.add(i, command);
			}
		}
		System.out.println(builder.toString());
	}

}
