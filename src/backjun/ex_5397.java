package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ex_5397 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();
	static Stack<Character> left = new Stack<>();
	static Stack<Character> right = new Stack<>();

	public static void main(String[] args) throws Exception{

		int N = Integer.parseInt(reader.readLine());
		while(N-- > 0) {

			String M = reader.readLine();
			output(M);
		}

		System.out.println(builder.toString());

	}

	static void output(String M) {

		for(int i=0; i<M.length(); i++) {
			char c = M.charAt(i);

			switch (c) {
				case '<' :
					if(!left.isEmpty()) {
						right.push(left.pop());
					}
					break;
				case '>' :
					if(!right.isEmpty()) {
						left.push(right.pop());
					}
					break;
				case '-' :
					if(!left.isEmpty()) {
						left.pop();
					}
					break;
				default: left.push(c);
			}
		}

		List<Character> leftList = new ArrayList<>(left);
		List<Character> rightList = new ArrayList<>(right);

		Collections.reverse(rightList);

		if(leftList.size() > 0) {
			for(char c : leftList) {
				builder.append(c);
			}
		}

		if(rightList.size() > 0) {
			for(char c : rightList) {
				builder.append(c);
			}
		}
		builder.append("\n");
		left.clear();
		right.clear();
	}

}
