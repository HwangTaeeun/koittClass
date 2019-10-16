package day05;

import java.util.Arrays;

/*
	문제 1]
		'A' ~ 'J' 까지 임의의 문자를 랜덤하게 100개 
		발생시킨 후 2차원배열에 저장하고
		각문자가 몇번씩 발생했는지도 문자들이 들어있는 배열에 저장해서 출력하세요.
 */
public class PreEx01 {
/*
	배열을 만들게 되면
	Heap 영역에 만들게 되는데
	이때 배열이 관리할 타입을 정해줘야 한다.
	
	이때 Heap 영역에 만들게 되는 것의 데이터 타입을 Heap Type 이라고 부른다.
	
	그런데 배열은 이 Heap Type 이 같은 것들만 넣을 수 있다.
 */
	public PreEx01() {
		/*
		int[][] chArr = new int[2][10];
		int[] ch = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		
		chArr[0] = ch;
		
		참고]
			배열을 선언과 동시에 초기화하는 방법
				1. 
					int[] no = {1,2,3,4,5};
					
				2. 
					int[] no = new int[]{1,2,3,4,5};
		
		---------------------------------------------------------------------------
		
				int[] tmp = new int[10];
					==> {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		
		*/
		
		// 정수 10개들을 저장해서 관리할 2차원 배열을 만든다.
		/*
		int[][] chArr = new int[][] {
										{ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'}, 
										//{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
										new int[10]
									};
		*/
		int[][] chArr = new int[2][10];
		
		// 2차원 배열의 첫방에 대문자 'A' ~ 'J' 까지 채운다.
		for(int i = 0 ; i < 10; i++ ) {
			chArr[0][i] = 65 + i;
		}
		
		// 대문자를 랜덤하게 발생시켜서 두번째방의 배열의 해당방의 카운트를 1 올려준다.
		for(int i = 0 ; i < 100 ; i++ ) {
			int index = (int)(Math.random() * 10);
			chArr[1][index] = chArr[1][index] + 1;
		}
		
		// 출력하기
		// 반복해서 차례로 꺼내서 출력한다.
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.println("[ " + (char)chArr[0][i] + " ] : " + chArr[1][i] + " 번 출현");
		}
		
		
		System.out.println("########## " + Arrays.deepToString(chArr));
	}

	public static void main(String[] args) {
		new PreEx01();
	}
	
}
