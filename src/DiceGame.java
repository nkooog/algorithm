import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DiceGame {

	public static void main(String[] args) throws Exception{
		/*TODO
			1.같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
			2.같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
			3.모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
		*/
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			Integer value1 = Integer.parseInt(reader.readLine());
			Integer value2 = Integer.parseInt(reader.readLine());
			Integer value3 = Integer.parseInt(reader.readLine());

			if(value1 == value2 && value1 == value3) {
				System.out.println( 10000 + (value1) * 1000 );
			}else if( (value1 == value2 && value1 != value3) || (value1 == value3 && value1 != value2)) {
				System.out.println( 1000 + (value1) * 100 );
			}else if( value2 == value3 && value2 != value1) {
				System.out.println( 1000 + (value2) * 100 );
			}else {
				Integer max = value1;
				if( max < value2) max = value2;
				if( max < value3) max = value3;
				System.out.println( max * 100);
			}
		}catch (NumberFormatException e) {
			System.out.println("정수만 입력하세요");
		}


	}

}
