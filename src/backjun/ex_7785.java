package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ex_7785 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();
	public static void main(String[] args) throws Exception{

		HashMap<String, Object> hashMap = new HashMap<>();

		int N = Integer.parseInt(reader.readLine());

		while(N-- > 0) {

			StringTokenizer st = new StringTokenizer(reader.readLine());

			String n = st.nextToken();
			String l = st.nextToken();

			if(hashMap.containsKey(n) && l.equals("leave")) {
				hashMap.remove(n);
			}else {
				hashMap.put(n, l);
			}
		}

		ArrayList<String> list = new ArrayList<>(hashMap.keySet());
		Collections.sort(list, Collections.reverseOrder());
		for(String key : list) {
			builder.append(key).append("\n");
		}

		System.out.println(builder.toString());

	}

}
