package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ex_1822 {


	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();
	public static void main(String[] args) throws Exception{

		ArrayList<Integer> list = new ArrayList<>();

		String N = reader.readLine();

		String s1 = reader.readLine();
		String s2 = reader.readLine();

		Set A = new LinkedHashSet();
		Set B = new LinkedHashSet();

		A = getSetData(A, s1);
		B = getSetData(B, s2);

		Iterator<Integer> iter = A.iterator();

		while(iter.hasNext()) {
			int num = iter.next();
			if(!B.contains(num)) {
				list.add(num);
			}
		}

		Collections.sort(list);

		for(int s: list) {
			builder.append(s).append(" ");
		}

		System.out.println(list.size());
		System.out.println(builder.toString());
	}

	public static Set<Integer> getSetData(Set<Integer> set, String s) {
		for(int a : getArrays(s)) {
			set.add(a);
		}
		return set;
	}

	public static int[] getArrays(String s) {
		StringTokenizer st = new StringTokenizer(s, " ");
		int[] arr = new int[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		return arr;
	}

}
