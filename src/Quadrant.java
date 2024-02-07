import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Quadrant {

	public static void main(String[] args) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		int x = Integer.parseInt(reader.readLine());
//		int y = Integer.parseInt(reader.readLine());
		int x = -12;
		int y = -5;

		if(isValue(x) && isValue(y)) {
			System.out.println(getQuadrant(x, y));
		}
	}

	public static int getQuadrant(int x, int y) {
		if( x > 0 ) {
			if( y > 0 ) {
				return 1;
			}else{
				return 4;
			}
		}else {
			if ( y > 0) {
				return 2;
			}else{
				return 3;
			}
		}
	}


	public static boolean isValue(int param) {
		return param >= -1000 && param <= 1000 ? true : false;
	}

}
