package day03;

/*
	문제 4] - 반복문 문제
		한라산의 높이는 1947m이다
		두사람의 외국인이 한사람은 정상에서 0.95m/s로 내려오고
		한사람은 밑에서 0.75m/s 로 올라간다.
		두사람은 몇초후에 지표에서 부터 
		몇미터 부근에서 만나는지 계산해서 출력하세요
		
		단, 이 문제는 반복문으로 해결을 하세요.
 */

public class Ex04 {

	public Ex04() {
		toCalc();
	}

	public static void main(String[] args) {
		new Ex04();
	}
	
	// 이 함수는 두사람이 만나는 시간을 출력해주는 기능을 가진 함수
	public void toCalc() {
		// 1. 몇초후에 두사람이 만날지 알 수 없으므로 반복해서 시간을 증가시켜서 계산을 한다.
		// 	  두사람이 만나는 시간을 저장할 변수를 만들어둔다.
		
		int sec = 0;
		for(int i = 0 ; true ; i++) {
			//		a와 b 사람의 위치를 저장할 변수를 만들어둔다.
			double upper = 0.75 * i;
			double lower = 1947 - 0.95*i;
			
			
			// 올라가는 사람의 수직 위치가 내려오는 사람의 수직위치보다 처음 큰 값일경우
			// 두사람이 만난 시간이다.
			if(upper >= lower) {
				sec = i;
				break;
			}
		}
		
		// 출력하고
		System.out.println("두 사람은 [ " + sec + " ] 초 후에 만나게 되고 \n[ " + 0.75*sec + " ] m 위치에서 만난다.");
	}

}
