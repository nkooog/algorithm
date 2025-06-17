package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ex_10799_1 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{

		String s = reader.readLine();
		int answer = 0;
		int result = 0;

		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(') {
				answer++;
			}else{
				answer--;
				if(s.charAt(i-1) == '(') {
					result += answer;
				}else{
					result += 1;
				}
			}
		}
		System.out.println(result);
	}

}
