package day04;

import java.util.Arrays;

/*
	배열 정렬하기
		
		0 ~ 99 까지의 숫자를 랜덤하게 10 만들어서 배열에 저장하고
		크기가 작은 순으로 배열을 정렬하세요.
 */

public class Test02 {

	public Test02() {
		// 아래서 정의한 함수를 실행시켜서 배열을 받는다.
		int arr[] = getIntArr();
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		/*
		 * // 순차적으로 각 자리에 접근해서 // 이후 숫자와 비교해서 작은 숫자와 현재숫자를 교체한다.
		 * 
		 * // 먼저 비교할 원본 데이터를 각 방마다 하나씩 차례로 뽑아낸다. for(int i = 0 ; i < arr.length - 1; i++
		 * ) {
		 * 
		 * // 뽑아낸 해당 방 이후의 방부터 끝까지 하나씩 꺼내서 비교한다. for(int j = i+1; j < arr.length ; j++ )
		 * { // 만약 이후에 꺼낸 데이터가 작다면 작은 데이터를 원본과 교체한다. if(arr[i] > arr[j]) { // 원본데이터는 변수를
		 * 만들어서 주소를 기억해두고.. // <== 배열에 교체가 되는 순간 배열의 그 방의 저장되어 있는 주소는 사라지므로 // 다시 그 데이터를
		 * 비교할 방에 채워넣을려면 데이터의 주소는 기억해 둬야 한다. int tmp = arr[i]; arr[i] = arr[j]; // 작은 수를
		 * 원본에 저장하고 arr[j] = tmp; // 큰수의 주소는 변수에 저장해 뒀으므로 변수를 작은 수가 있던 방에 교체한다. } } }
		 */
		
		toSort(arr);
		
//		Arrays.sort(arr);
		
		System.out.println("정렬 후 : " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	// 이 함수는 랜덤하게 만든 정수 10개를 저장하고 반환해주는 함수
	public int[] getIntArr() {
		// 정수 10개를 관리할 배열을 만든다.
		int[] num = new int[10];
		
		// 랜덤하게 숫자를 발생시킨다. x 10
		makeNum:
		for(int i = 0 ; i < 10 ; i++ ) {
			int no = (int)(Math.random() * 99 + 1);
			
			// 만약 중복된 값이 만들어지면 다시 뽑는다.
			for(int j = 0 ; j < i ; j++) {
				if(num[j] == no) {
					i--;
					continue makeNum;
				}
				// 이 라인을 읽는 경우는 위의 조건문에 맞는 경우가 없으므로 중복되는 값이 없는 경우다.
			}
			
			num[i] = no;
		}
		
		return num;
	}
	
	// 이 함수는 생성자 함수에서 작성했던 코드를 함수로 분리해서 처리했다.
	public void toSort(int[] arr) {
		// 순차적으로 각 자리에 접근해서 
		// 이후 숫자와 비교해서 작은 숫자와 현재숫자를 교체한다.
		
		// 먼저 비교할 원본 데이터를 각 방마다 하나씩 차례로 뽑아낸다.
		for(int i = 0 ; i < arr.length - 1; i++ ) {
			
			// 뽑아낸 해당 방 이후의 방부터 끝까지 하나씩 꺼내서 비교한다.
			for(int j = i+1; j < arr.length ; j++ ) {
				// 만약 이후에 꺼낸 데이터가 작다면 작은 데이터를 원본과 교체한다.
				if(arr[i] < arr[j]) {
					// 원본데이터는 변수를 만들어서 주소를 기억해두고..
					// 	<== 배열에 교체가 되는 순간 배열의 그 방의 저장되어 있는 주소는 사라지므로 
					//		다시 그 데이터를 비교할 방에 채워넣을려면 데이터의 주소는 기억해 둬야 한다.
					int tmp = arr[i];
					arr[i] = arr[j]; // 작은 수를 원본에 저장하고
					arr[j] = tmp;	 // 큰수의 주소는 변수에 저장해 뒀으므로 변수를 작은 수가 있던 방에 교체한다.
				}
			}
		}
	}
}
