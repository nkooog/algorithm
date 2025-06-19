package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class ex_1715 {

	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) throws Exception{

		PriorityQueue<Integer> q = new PriorityQueue<>();

		int N = Integer.parseInt(reader.readLine());

		while(N-- > 0) {
			int M = Integer.parseInt(reader.readLine());
			q.offer(M);
		}

		int hab = 0;

		while(q.size() > 1) {
			int x = q.poll() + q.poll();
			q.offer(x);
			hab +=x;
		}

		System.out.println(hab);
	}

}
