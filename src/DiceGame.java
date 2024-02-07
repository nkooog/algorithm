import com.sun.xml.internal.bind.v2.TODO;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class DiceGame {

	public static void main(String[] args) throws Exception{
		/*TODO
			1.같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
			2.같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
			3.모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int value1 = Integer.parseInt(reader.readLine());
		int value2 = Integer.parseInt(reader.readLine());
		int value3 = Integer.parseInt(reader.readLine());

		getBonus(value1,value2,value3);
		getBonus(value1,value2);

	}

	public static int getBonus(int ... param) {

		HashSet<Integer> hashSet = new HashSet<>();

		for(int value : param) {
//			hashSet.add(value);
			System.out.print(value);
		}
		System.out.println();
		return 0;
	}

}
