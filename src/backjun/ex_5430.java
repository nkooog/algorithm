package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class ex_5430 {

	static Deque<Integer> q = new LinkedList<>();
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) throws Exception{

		int N = Integer.parseInt(reader.readLine());

		while(N-- > 0) {

			String func = reader.readLine();
			int M = Integer.parseInt(reader.readLine());
			String arr = reader.readLine();
			String[] split = arr.substring(1, arr.length() - 1).split(",");

			if(split.length == M) {
				for(String s : split) {
					q.offer(Integer.parseInt(s));
				}
			}

			xx(func);

		}
		System.out.print(builder.toString());
	}

	public static String xx(String func) {

		int isValid = 0;
		boolean isErr = false;
		for(int i=0; i<func.length(); i++) {
			char c = func.charAt(i);
			if(c == 'R'){
				isValid++;
			}else{

				if(q.isEmpty()) {
					isErr = true;
					break;
				}

				if(isValid % 2 == 0) {
					q.poll();
				}else{
					q.removeLast();
				}
			}
		}

		if(isErr) {
			return builder.append("error\n").toString();
		}

		builder.append("[");
		while(!q.isEmpty()) {
			builder.append(
					isValid % 2 == 0 ? q.pop() : q.pollLast()
			);
			if(!q.isEmpty()) builder.append(",");
		}


		return builder.append("]\n").toString();
	}

}
