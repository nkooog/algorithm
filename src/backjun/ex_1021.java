package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ex_1021 {

	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> q = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		for(int i=1; i<=N; i++) {
			q.offer(i);
		}

		st = new StringTokenizer(reader.readLine(), " ");

		ArrayList<Integer> target = new ArrayList();

		while(st.hasMoreTokens()) {
			target.add(Integer.valueOf(st.nextToken()));
		}

		if(target.size() > M) return;

		int x = 0;

		for(int i=0; i<target.size(); i++) {

			for(int j=0; j<q.size(); j++) {

				if(q.peek() != target.get(i)) {
					x++;
					q.offer(q.poll());
				}else{
					q.poll();
					break;
				}

			}
		}

	}

}
