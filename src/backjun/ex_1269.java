package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class ex_1269 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception{

		StringTokenizer st = new StringTokenizer(reader.readLine(),  " ");

		Set<Integer> A = input(Integer.parseInt(st.nextToken()));
		Set<Integer> B = input(Integer.parseInt(st.nextToken()));

		int answer = 0;

		answer += find(A, B);
		answer += find(B, A);
		System.out.println(answer);
	}

	public static int find(Set iter, Set target) {
		int result = 0;

		Iterator<Integer> it = iter.iterator();
		while(it.hasNext()) {
			result += !target.contains(it.next()) ? 1 : 0;
		}
		return result;
	}


	public static Set input(int x) throws Exception {
		Set<Integer> set = new HashSet<>();

		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

		if(st.countTokens() != x)
			return null;

		while(st.hasMoreTokens()) {
			set.add(Integer.valueOf(st.nextToken()));
		}

		return set;
	}

}
