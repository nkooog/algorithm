package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ex_1406_오답 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static LinkedList<Character> list = new LinkedList<>();
	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) throws Exception{

		String N = reader.readLine();

		int M = Integer.parseInt(reader.readLine());
		int cursor = N.length();

		for(int i=0; i<N.length(); i++) {
			char c = N.charAt(i);
			list.add(c);
		}

		for(int i=0; i<M; i++) {

			StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

			switch (st.nextToken()) {
				case "P" :
					list.add(cursor, st.nextToken().charAt(0));
					cursor++;
					break;
				case "L" :
					if((cursor-1) >= 0) cursor--;
					break;
				case "D" :
					if((cursor+1) <= list.size()) cursor++;
					break;
				case "B" :
					if((cursor-1) >= 0) {
						list.remove((cursor-1));
						cursor--;
					}
					break;
			}
		}

		list.stream().forEach(e -> builder.append(e));

		System.out.println(builder.toString());

	}

}
