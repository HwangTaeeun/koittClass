package day03;

import java.util.Arrays;

/*
	예제]
		한 게임의 로또를 기억할 배열을 만들어서 기억하고
		출력하세요.
		출력은 배열의 내용을 확인하는 함수를 사용해서 처리하세요.
		
 */
public class CreateLotto {
	int[][] myLotto = new int[5][6];
	
	public CreateLotto() {
		/*
			6개의 방에 하나씩 차례로 접근해서
			랜덤하게 1 ~ 45 까지의 숫자를 만들고
			차례로 넣어주면 된다.
		 */
		
		// 1. 여섯번 반복해서 각 방에 접근한다.
		int k = 0 ;
		/*
			label 이 붙은 for 명령
				: 반복문안에 반복이 포함되어 있는 경우
					내부의 반복문에서 상위의 반복문을 종료, 또는 다음회차로 
					진행되기를 원할경우 label을 붙여주고 
						break[또는 continue] label이름;
					형식으로 처리한다.
				label 만드는 방법]
					반복문의 바로 위에 
						label이름 :
					형식으로 붙여준다.
		 */
		for(int n = 0 ; n < myLotto.length ; n++) {
			start:
			for(int i = 0 ; i < myLotto[n].length ; i++) {
				/*
					배열변수에 접근할 때
					변열변수[] 의 []는 최상위 배열부터 시작해서
					하위로 내려간다.
					따라서 다섯게임의 배열을 각각 접근하려면
					myLotto[n] 이라고 표현하고
					결과는 각 인덱스의 들어있는 데이터 즉 배열이 된다.
					
						myLotto[n] ==> myLotto배열의 n번째 방에 있는 데이터(배열)
						
				 */
				System.out.println("반복 횟수 : " + k++);
				// 2. 랜덤한 숫자를 만든다.
				int no = (int)(Math.random() * 45) + 1;
				
				for(int j = 0 ; j < i ; j++ ) {
					if(myLotto[n][j] == no) {
						i--;
						continue start;
					}
				}
				// 이부분을 실행한다는 의미는
				// 바로위의 번호 중복체크를 다 했지만 중복된 것이 없었다는 것이므로
				// 발생한 번호를 넣어주면 된다.
				myLotto[n][i] = no;
			}
		}
		
		// 배열의 내용을 확인하는 함수
		for(int i = 0 ; i < myLotto.length ; i++) {
			System.out.println(Arrays.toString(myLotto[i]));
		}
	}

	public static void main(String[] args) {
		new CreateLotto();
	}
	
	public void toTest() {
		// label이 붙은 for 명령은 break(or continue)가
		// 오직 직계반복문에 한해서만 적용된다.
		
		for(int i = 0 ; i < 10; i++) {
			first:
			for(int j = 0 ; j < 5 ; j++) {
				
			}
			
			for(int j = 0 ; j < 7 ; j++ ) {
				if(j == 3) {
//					continue first; 
					// ==> label 이 붙은 명령은 
					//		반드시 속해있는 반복문에 한해서만 적용된다.
				}
			}
		}
	}

}
