package day02;

/*
	문제2 ]
		1년은 365.2426일 이다
		이것은 
			몇일, 몇시간, 몇분, 몇 초인지 
			계산하세요.
 */
public class Ex02 {
	
	// 1. 진입점 함수 만들고
	public static void main(String[] args) {
		// 2. 날짜 이외의 데이터를 제일 작은 단위로 변환하고
		double tmp = 365.2426;
		int day = (int)(tmp / 1);
		tmp %= 1;
		int totalsec = (int)(tmp * 24 * 60 * 60); // 계산을 한 후에 더블데이터를 정수형으로 바꾼다.
		int hour = totalsec / (60 * 60) ; // 
		totalsec %= 60*60;
		int min = totalsec / 60 ;
		totalsec %= 60;
		int sec = totalsec;
		
		System.out.println("365.2426일은 " + day + "일, " + hour + "시간, " + min + "분, " + sec + "초 입니다.");
		// 3. 계산해서
		
		// 4. 출력하고
	}
}
