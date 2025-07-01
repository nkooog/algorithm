package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ex_2075 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) throws Exception{

		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

		int N = Integer.parseInt(reader.readLine());
		int M = N;
		while(N-- > 0) {

			StringTokenizer st = new StringTokenizer(reader.readLine(), " ");

			while(st.hasMoreTokens()) {
				q.add(Integer.valueOf(st.nextToken()));
			}

		}

		for(int i=M; i>0; i--) {
			if(i == 1) {
				System.out.println(q.poll());
			}else{
				q.poll();
			}
		}

		System.out.println();

	}

}
