package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex_10799_2 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static Stack stack = new Stack();
	public static void main(String[] args) throws Exception{

		String s = reader.readLine();
		int result = 0;

		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(') {
				stack.push(c);
			}else{
				stack.pop();
				if(s.charAt(i-1) == '(') {
					result += stack.size();
				}else{
					result += 1;
				}
			}
		}
		System.out.println(result);
	}

}
