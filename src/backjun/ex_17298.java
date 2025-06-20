package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex_17298 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) throws IOException {

		List<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();

		Stack<Integer> result = new Stack<>();

		int N = Integer.parseInt(reader.readLine());
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

		while(st.hasMoreTokens()) {
			list.add(Integer.valueOf(st.nextToken()));
		}

		for (int i=N-1; i >= 0; i--) {
			int current = list.get(i);

			while (!stack.isEmpty() && stack.peek() <= current) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				result.push(-1);
			} else {
				result.push(stack.peek());
			}

			stack.push(current);
		}

		while(!result.isEmpty()) {
			builder.append(result.pop()).append(" ");
		}
		System.out.println(builder.toString());
	}

}
