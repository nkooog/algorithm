package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ex_9375 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();
	public static void main(String[] args) throws Exception{

		int N = Integer.parseInt(reader.readLine());

		while(N-- > 0) {

			Map<String, Integer> map = new HashMap<>();
			int M = Integer.parseInt(reader.readLine());
			int result = 1;

			for(int i=0; i<M; i++) {
				StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
				st.nextToken();

				String T = st.nextToken();

				if(map.containsKey(T)) {
					map.put(T, map.get(T) + 1);
				}else{
					map.put(T, 1);
				}
			}

			for(int x : map.values()) {
				result *= x + 1;
			}
			builder.append(result - 1).append("\n");
		}

		System.out.println(builder.toString());

	}

}
