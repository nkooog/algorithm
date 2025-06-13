package programmers;

public class video {

	public static void main(String[] args) {

	}

	public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

		/**
		 * 10초 전으로 이동: 사용자가 "prev" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 전으로 이동합니다. 현재 위치가 10초 미만인 경우 영상의 처음 위치로 이동합니다. 영상의 처음 위치는 0분 0초입니다.
		 * 10초 후로 이동: 사용자가 "next" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 후로 이동합니다. 동영상의 남은 시간이 10초 미만일 경우 영상의 마지막 위치로 이동합니다. 영상의 마지막 위치는 동영상의 길이와 같습니다.
		 * 오프닝 건너뛰기: 현재 재생 위치가 오프닝 구간(op_start ≤ 현재 재생 위치 ≤ op_end)인 경우 자동으로 오프닝이 끝나는 위치로 이동합니다.
		 * 현재 위치가 10초 미만인 경우 영상의 처음 위치로 이동
		 *
		 * 동영상의 길이를 나타내는 문자열 video_len
		 * 기능이 수행되기 직전의 재생위치를 나타내는 문자열 pos
		 * 오프닝 시작 시각을 나타내는 문자열 op_start
		 * 오프닝이 끝나는 시각을 나타내는 문자열 op_end
		 * 사용자의 입력을 나타내는 1차원 문자열 배열 commands
		 */

		//1. pos 10초 미만이면 0 or 현재위치가 오프닝 구간이면 오프닝 종료지점으로

		String answer = "";

		boolean isNext = false;
		boolean isPrev = false;


		Long pos_s = (long) (Integer.parseInt(pos) < 10 ?
						0 : Integer.parseInt(op_end));

		Long milliseconds = pos_s * 1000L;

		for(int i=0; i<commands.length; i++) {

			if( ( pos_s + (10 * 1000L) ) > Integer.parseInt(video_len) ) {
				isNext = true;
			}

			if( (pos_s - (10 * 1000L)) < 0) {
				isPrev = true;
			}

			if("next".equals(commands[i])) {
				pos_s = (isNext) ?
						Integer.parseInt(video_len) : pos_s + 10;
			}else{
				pos_s = (isPrev) ?
						0 : pos_s - 10;
			}

		}

		return answer;
	}

}
