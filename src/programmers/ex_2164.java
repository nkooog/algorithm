package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ex_2164 {

	public static void main(String[] args) throws Exception{
		/*
		Queue<Integer> queue = new LinkedList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.valueOf(br.readLine());

		for(int i=0; i<num; i++) {
			queue.offer((i+1));
		}

		while(queue.size() > 1) {
			queue.poll();
			queue.offer(queue.poll());
		}

		System.out.println(queue.poll());*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.valueOf(br.readLine());
		// 배열풀이
		Integer[] arr = new Integer[num];

		for(int i=0; i<num; i++) {
			arr[i] = (i+1);
		}

		int rear = num-1;

		// 1 2 3 4
		for(int front=1; front<rear; front++) {
			int idx = front;
			int tmp = arr[front];

			arr[front]=arr[rear];
			arr[rear]=tmp;

			while(idx < (rear-1)) {
				tmp = arr[idx];
				arr[idx] = arr[++idx];
				arr[idx] = tmp;
			}
		}
		System.out.println(arr[rear]);
	}

}
