package programmers;

public class langCenter {

	public static void main(String[] args) {
		System.out.println(langCenter.solution("qwertt"));
	}


	public static String solution(String s) {
		return (s.length() % 2 == 0) ? String.valueOf(s.charAt(s.length()/2 -1)) + String.valueOf(s.charAt(s.length() / 2))
				:   String.valueOf(s.charAt(s.length()/2));
	}
}
