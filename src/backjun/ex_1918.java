package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ex_1918 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();
	static Map<Character, Integer> map = new HashMap<Character, Integer>() {{
				put('*', 1);
				put('/', 1);
				put('+', 2);
				put('-', 2);
			}};

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char now = str.charAt(i);

			switch (now){
				case '+':
				case '-':
				case '*':
				case '/':
					while (!stack.isEmpty() && priority(stack.peek()) >= priority(now)) {
						sb.append(stack.pop());
					}
					stack.add(now);
					break;
				case '(':
					stack.add(now);
					break;
				case ')':
					while(!stack.isEmpty() && stack.peek() != '('){
						sb.append(stack.pop());
					}
					stack.pop();
					break;
				default:
					sb.append(now);
			}
		}

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		System.out.println(sb.toString());
	}

	// 연산자 별 우선순위 리턴
	public static int priority(char operator){

		if(operator=='(' || operator==')'){
			return 0;
		} else if (operator == '+' || operator == '-') {
			return 1;
		} else if (operator == '*' || operator == '/') {
			return 2;
		}
		return -1;
	}

}
