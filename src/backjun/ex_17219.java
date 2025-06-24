package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ex_17219 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) throws Exception{

		HashMap<String, String> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		while(N-- > 0) {
			st = new StringTokenizer(reader.readLine(), " ");
			map.put(st.nextToken(), st.nextToken());
		}

		while(M-- > 0) {
			st = new StringTokenizer(reader.readLine());
			builder.append(map.get(st.nextToken())).append("\n");
		}

		System.out.println(builder.toString());

	}


}
