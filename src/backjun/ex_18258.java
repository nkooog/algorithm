package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ex_18258 {

	static LinkedList<Integer> list = new LinkedList<>();
	static StringBuilder builder = new StringBuilder();

	// 정수 X를 큐에 넣는 연산이다.
	public static void push(int x) {
		list.offer(x);
	}

	// 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int pop() {
		return list.isEmpty() ? -1 : list.poll();
	}

	// 큐에 들어있는 정수의 개수를 출력한다.
	public static int size() {
		return list.size();
	}

	public static int empty() {
		return list.isEmpty() ? 1 : 0;
	}

	public static int front() {
		return list.isEmpty() ? -1 : list.peek();
	}

	public static int back() {
		return list.isEmpty() ? -1 : list.get(list.size()-1);
	}

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(reader.readLine());

		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

			switch (st.nextToken()) {
				case "push" : push(Integer.parseInt(st.nextToken())); break;
				case "pop" : builder.append(pop()).append("\n"); break;
				case "size" : builder.append(size()).append("\n"); break;
				case "empty" : builder.append(empty()).append("\n"); break;
				case "front" : builder.append(front()).append("\n"); break;
				case "back" : builder.append(back()).append("\n"); break;
			}
		}
		System.out.println(builder.toString());
	}

}
