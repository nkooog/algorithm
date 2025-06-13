package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex_4949 {

	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		StringBuffer buffer = new StringBuffer();


		while(true) {

			String s = reader.readLine();

			if(s.equals(".")) {
				break;
			}

			for(int i=0; i<s.length(); i++) {

				char c = s.charAt(i);

				if(c == '(' || c == '[') {
					stack.push(c);
				}else if(c == ')') {
					if(stack.empty() || stack.peek() != ')') {
						buffer.append("no");
						buffer.append("\t");
						break;
					}else{
						stack.pop();
					}
				}else if(c ==']') {
					if(stack.empty() || stack.peek() != ']') {
						buffer.append("no");
						buffer.append("\t");
						break;
					}else{
						stack.pop();
					}
				}
			}

			if(stack.isEmpty()) {
				buffer.append("yes");
				buffer.append("\t");
			}else{
				buffer.append("no");
				buffer.append("\t");
				stack.clear();
			}

		}

		System.out.println(buffer.toString());

	}

}
