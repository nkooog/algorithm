package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex_1406 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();
	static Stack ls = new Stack();
	static Stack rs = new Stack();
	static Queue q = new LinkedList();

	public static void main(String[] args) throws Exception{



		String N = reader.readLine();
		int M = Integer.parseInt(reader.readLine());

		for(int i=0; i<N.length(); i++) {
			char c = N.charAt(i);
			ls.push(c);
		}


		while(M-- > 0) {
			int cursor = ls.size();
			StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

			switch (st.nextToken()) {
				case "L" :
					if(!ls.isEmpty()) rs.push(ls.pop());
					break;
				case "D" :
					if(!rs.isEmpty())  ls.push(rs.pop());
					break;
				case "B" :
					if(!ls.isEmpty()) ls.pop();
					break;
				default:
					ls.push(st.nextToken().charAt(0));
			}
		}

		while (!ls.isEmpty()) {
			rs.push(ls.pop());
		}

		while (!rs.isEmpty()) {
			builder.append(rs.pop());
		}

		System.out.println(builder.toString());

	}

}
