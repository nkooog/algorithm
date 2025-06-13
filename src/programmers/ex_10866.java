package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ex_10866 {

	LinkedList<Integer> list;

	public ex_10866() {
		this.list = new LinkedList<>();
	}

	/**
	 * 정수 X를 덱의 뒤에 넣는다.
	 * @param x
	 */
	public void push_back(Integer x) {
		list.add(x);
	}

	/**
	 * 정수 X를 덱의 앞에 넣는다.
	 * @param x
	 */
	public void push_front(Integer x) {
		list.push(x);
	}

	/**
	 * 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 * @return
	 */
	public Integer pop_front() {
		return this.list.size() > 0 ? this.list.pollFirst() : -1;
	}

	/**
	 * 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 * @return
	 */
	public Integer pop_back() {
		return this.list.size() > 0 ? this.list.pollLast() : -1;
	}

	/**
	 * 덱에 들어있는 정수의 개수를 출력한다.
	 * @return
	 */
	public Integer size() {
		return this.list.size();
	}

	/**
	 * 덱이 비어있으면 1을, 아니면 0을 출력한다.
	 * @return
	 */
	public Integer empty() {
		return this.list.isEmpty() ? 1 : 0;
	}

	/**
	 * 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 * @return
	 */
	public Integer front() {
		return this.list.isEmpty() ? -1 : this.list.getFirst();
	}

	/**
	 * 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	 * @return
	 */
	public Integer back() {
		return this.list.isEmpty() ? -1 : this.list.getLast();
	}

	public static void main(String[] args) throws Exception{

		ex_10866 obj = new ex_10866();
		StringBuffer buffer = new StringBuffer();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.valueOf(reader.readLine());

		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
			switch (st.nextToken()) {
				case "push_back" :
					obj.push_back(Integer.valueOf(st.nextToken()));
					break;
				case "push_front" :
					obj.push_front(Integer.valueOf(st.nextToken()));
					break;
				case "pop_back" :
					buffer.append(obj.pop_back()).append("\n");
					break;
				case "pop_front" :
					buffer.append(obj.pop_front()).append("\n");
					break;
				case "front" :
					buffer.append(obj.front()).append("\n");
					break;
				case "back" :
					buffer.append(obj.back()).append("\n");
					break;
				case "size" :
					buffer.append(obj.size()).append("\n");
					break;
				case "empty" :
					buffer.append(obj.empty()).append("\n");
					break;
			}
		}

		System.out.println(buffer.toString());


	}

}
