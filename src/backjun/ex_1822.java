package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ex_1822 {


	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();
	public static void main(String[] args) throws Exception{

		ArrayList<String> list = new ArrayList<>();

		String N = reader.readLine();

		String[] s1 = reader.readLine().split(" ");
		String[] s2 = reader.readLine().split(" ");

		Set A = new LinkedHashSet(Arrays.asList(s1));
		Set B = new LinkedHashSet(Arrays.asList(s2));

		Iterator<String> iter = A.iterator();

		while(iter.hasNext()) {
			String num = iter.next();
			if(!B.contains(num) && !"".equals(num)) {
				list.add(num);
			}
		}

		Collections.sort(list);

		for(String s: list) {
			builder.append(s).append(" ");
		}

		System.out.println(list.size());
		System.out.println(builder.toString());
	}

}
