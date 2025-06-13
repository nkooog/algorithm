package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ex_10773 {

	List<Integer> list;

	public ex_10773() {
		this.list = new ArrayList<>();
	}

	public void push(Integer num) {
		list.add(num);
	}

	public Integer pop() {
		if(this.list.isEmpty()) {
			return 0;
		}
		Integer result = list.get(this.list.size()-1);
		list.remove(this.list.size()-1);
		return result;
	}

	public Integer peek() {
		return list.get(this.list.size()-1);
	}

	public boolean isEmpty() {
		return this.list.isEmpty() ? true : false;
	}

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.valueOf(br.readLine());

		ex_10773 obj = new ex_10773();

		for(int i=0; i<num; i++) {
			Integer in = Integer.valueOf(br.readLine());

			if(in > 0){
				obj.push(in);
			} else{
				obj.pop();
			}
		}

		Integer sum = obj.list.stream().mapToInt(i -> i).sum();
		System.out.println(sum);
	}

}
