package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex_1706 {

	public static void main(String[] args) throws IOException {

		HashSet<String> set = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());

		Integer N = Integer.valueOf(st.nextToken());
		Integer M = Integer.valueOf(st.nextToken());

		for(int i=0; i<N; i++) {
			set.add(reader.readLine());
		}

		for(int j=0; j<M; j++) {
			String tmp = reader.readLine();
			if(set.contains(tmp)) {
				list.add(tmp);
			}
		}

		Collections.sort(list);

		System.out.println(list.size());

		list.stream().forEach(e -> System.out.println(e));

	}

}
