package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ex_10845 {

	List<Integer> list = null;

	public ex_10845() {
		this.list = new ArrayList<>();
	}

	public void push(Integer n) {
		list.add(n);
	}

	public Integer pop() {
		if(this.list.isEmpty()) {
			return -1;
		}
		Integer result = this.list.get(0);
		this.list.remove(0);
		return result;
	}

	public Integer size() {
		return this.list.size();
	}

	public Integer empty() {
		return this.list.isEmpty() ?
				1 : 0;
	}

	public Integer front() {
		return this.list.isEmpty() ?
				-1 : this.list.get(0);
	}

	public Integer back() {
		return this.list.isEmpty() ?
				-1 : this.list.get(this.list.size()-1);
	}

	public static void main(String[] args) throws Exception{

		final String SEPARATOR = " ";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ex_10845 s = new ex_10845();

		Integer n = Integer.valueOf(reader.readLine());

		for(int i=0; i<n; i++) {

			String command = reader.readLine();
			StringTokenizer st = new StringTokenizer(command, SEPARATOR);

			while(st.hasMoreTokens()) {
				switch (st.nextToken()) {
					case "push" :
						s.push(Integer.valueOf(st.nextToken())); break;
					case "pop" :
						System.out.println(s.pop()); break;
					case "size" :
						System.out.println(s.size());
						break;
					case "empty" :
						System.out.println(s.empty());
						break;
					case "front" :
						System.out.println(s.front());
						break;
					case "back" :
						System.out.println(s.back());
						break;
				}
			}

		}
	}

}
