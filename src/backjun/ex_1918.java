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

		Stack<Character> stack = new Stack();

		String s = reader.readLine();

		if(map.containsKey(s.charAt(0))) return;

		for(int i=0; i<s.length(); i++) {

			char c = s.charAt(i);

			switch (c) {
				case '+':
				case '-':
				case '*':
				case '/':
			}

		}

		while(!stack.isEmpty()) {
			if(stack.peek() == '(' || stack.peek() == ')') {
				stack.pop();
			}else{
				builder.append(stack.pop());
			}
		}

		System.out.println(builder.toString());

	}

}
