package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class stack {

	List<Integer> list;

	public stack() {
		this.list = new ArrayList<>();
	}

	public void push(Integer num) {
		this.list.add(num);
	}

	public Integer pop() {
		if(this.list.isEmpty()) {
			return -1;
		}
		Integer result = this.list.get(list.size() - 1);
		this.list.remove(list.size()-1);
		return result;
	}

	public Integer empty() {
		return this.list.isEmpty() ? 1 : 0;
	}

	public Integer size() {
		return this.list.size();
	}

	public Integer top() {
		return this.list.isEmpty() ? -1 : this.list.get(list.size()-1);
	}

	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		final String SEPARATOR = " ";
		Integer commands = Integer.valueOf(reader.readLine());

		stack s = new stack();

		for(int i=0; i<commands; i++) {
			String command = reader.readLine();

			StringTokenizer st = new StringTokenizer(command, SEPARATOR);

			while(st.hasMoreTokens()) {
				switch (st.nextToken()) {
					case "push" :
						s.push(Integer.valueOf(st.nextToken())); break;
					case "top" :
						System.out.println(s.top()); break;
					case "size" :
						System.out.println(s.size()); break;
					case "empty" :
						System.out.println(s.empty()); break;
					case "pop" :
						System.out.println(s.pop()); break;
				}
			}
		}
	}



}
