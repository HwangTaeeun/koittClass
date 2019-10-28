package day13;

/*
		Quiz 1]
			
			<input type="text" id="id" name="id">
			<input type="password" id="pw" name="pw" >
			
			<div class="d1" id="d1"><p></p></div>
			
	----------------------------------------------------------------------------------------
	위 코드에서 입력되는 아이디를 읽어서 p 태그에 출력하려고 한다.
		a) 자바스크립트로 처리
			==> 자바스크립트에서는 모든 것들이 대부분 property 에 저장이 된다.
				따라서 property에 접근해서 가져와야 한다.
				
				var str = document.getElementById('id').value;
				
				document.getElelemtById('d1').innerHTML = '<p>' + str + '</p>';
				
				
				
		b) jQuery 로 처리
			
			==> 대부분의 것들이 함수로 처리가 되어 있어서
				함수를 실행하고 반환되는 객체를 받아서 처리해야 한다.
				
				$(document).ready(function(){
					var str = $('#id').val();
					
					$('#d1 < p').text(str);
				});
			
	Quiz 2]
		
		innerHTMl과 textContent 또는 innerText의 차이점... ==> 태그의 기능을 살려두느냐 마느냐..
		
		html() text()
		
 */

import java.text.*;
import java.util.*;

public class Test04 {
/*
	ChoiceFormat
		==> switch ~ case 문 등을 이용해야 하는 경우에 그것을 간소화 해놓은 클래스
			즉, 특정 범위의 값은 특정 문자열로 교체해서 출력하는 기능을 가진 클래스
			
		생성방법]
			
			ChoiceFormat(double[] limits, String[] format)
				
				limits[] 	-	치환될 범위
				format[]	- 	치환할 문자
 */
	public Test04() {
		double[] limits = {0, 60, 70, 80, 90};
		/*
			==> limits 만들때 주의 사항
					1. 반드시 오름차순으로 정렬되어야 한다.
						60 ~69 사이는 하나의 문자로 바꾸고
						70~ 79 사이는 하나의 문자로 바꾸고
						....
		 */
		
		String[] format = {"F", "D", "C", "B", "A"};
		/*
			==> format 을 만들때 주의사항
				반드시 limits와 갯수를 일치시켜야 한다.
		 */
		
		ChoiceFormat form = new ChoiceFormat(limits, format);
		// 특정 점수를 입력해서 학점을 구해보자.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 점수입력받고
			System.out.println("점수를 입력하세요! : ");
			String str = sc.nextLine();
			
			// "quit" 이라는 문자열이 입력되면 반복문을 강제 종료한다.
			if(str.equals("quit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			// 점수 저장할 변수 만들고
			int score ;
			try {
				// 문자열을 정수로 변환할 때 예외가 발생할 수 있으므로 예외처리 해준다.
				score = Integer.parseInt(str);
				
				// 점수가 범위밖의 숫자일 경우 강제로 예외를 발생시켜서 처리한다.
				if(score > 100 || score < 0) {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("잘못된 숫자 형식입니다.");
				continue;
			}
			
			// 출력하기
			System.out.println(form.format(score));
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
