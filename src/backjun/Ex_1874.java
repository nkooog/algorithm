package backjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex_1874 {

	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer buffer = new StringBuffer();
		Stack<Integer> stack = new Stack<>();

		boolean valid = false;
		int temp = 1;
		int[] A = new int[Integer.parseInt(reader.readLine())];

		for(int i=0; i<A.length; i++) {
			A[i] = Integer.parseInt(reader.readLine());
		}

		for(int i=1; i<=A.length; i++) {

			for( ; A[i-1] >= temp; temp++) {
				stack.push(temp);
				buffer.append("+\n");
			}

			if(stack.peek() == A[i-1]) {
				stack.pop();
				buffer.append("-\n");
			}else{
				valid = true;
			}

		}

		if(valid) {
			System.out.println("NO");
		}else{
			System.out.println(buffer.toString());
		}


	}

}
