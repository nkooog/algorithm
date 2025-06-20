package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex_17413 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();
	static Stack stack = new Stack();

	public static void main(String[] args) throws Exception{

		String s = reader.readLine();

		boolean isValid = false;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);

			if(c == '<') {
				input();
				builder.append(c);
				isValid = true;
			}else{
				if(c == 32) {
					input();
					builder.append(c);
				}else if(isValid) {
					builder.append(c);
				}else{
					stack.push(c);
				}
			}

			if(c == '>') isValid = false;

		}

		input();
		System.out.println(builder.toString());

	}

	public static void input() {
		while(!stack.isEmpty()) {
			builder.append(stack.pop());
		}
	}

}
