package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Vps {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();

		for(int i=0; i<num; i++) {

			String s = br.readLine();

			for(int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
				if(c == '(') {
					stack.push(c);
				}else{
					if(stack.empty()) {
						stack.push(c);
						break;
					}else{
						stack.pop();
					}
				}
			}
			if(stack.empty()){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			stack.clear();
		}

	}

}
