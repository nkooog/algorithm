package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ex_1320 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) throws Exception{

		int N = Integer.parseInt(reader.readLine());
		int max = 0;
		String result = "";

		HashMap<String, Integer> hashMap = new HashMap<>();

		while(N-- > 0) {

			String s = reader.readLine();

			if(hashMap.containsKey(s)) {
				hashMap.put(s, hashMap.get(s) + 1);
			}else{
				hashMap.put(s, 1);
			}
		}


		Map<String, Integer> sortedMap = new TreeMap<>(hashMap);

		for(String s : sortedMap.keySet()) {
			if(sortedMap.get(s) > max) {
				max = sortedMap.get(s);
				result = s;
			}
		}
		System.out.println(result);

	}

}
