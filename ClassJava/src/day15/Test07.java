package day15;

import java.util.*;

/*
	Properties 클래스
		==> Map의 역할을 하는 클래스
		
			일반 Map과의 차이점은 파일(외부장치)을 이용해서 직접 데이터를 읽어서
			Map 처럼 저장할 수 있고
			Map에 저장된 데이터를 직접 파일(외부장치)로 출력해서 저장할 수 있다.
			
		문제점]
			파일의 내용을 읽을 때 인코딩이 되지 않는다.
			==> 한글 파일의 경우 파일 자체에서 인코딩을 해결하지 않으면
				내용이 한글인 경우 깨져서 들어온다.
				
			*****
			Properties 파일에 저장된 데이터에 공백문자(' ')도 문자이므로
			키나 벨류에 입력될 경우 일치하는 데이터를 못가져올 수도 있다.
			따라서 각 행의 맨 마지막 문자가 공백인지 아닌지 항상 조심해야하고 확인해야 한다.
			
		참고]
			한글이 포함된 파일을 Properties 에서 사용하기 위해서 인코딩 방법
				
				1. cmd 창을 연다.
				2. path를 자바 HOME으로 잡아준다.
				3. native2ascii 기능을 이용해서 인코딩 해준다.
				
				형식]
					native2ascii 	현재파일	변경파일
					
				예제]
					native2ascii test.properties test1.properties
					
	---------------------------------------------------------------------------------------
	
		참고]
			Properties 클래스는 오직 문자열(String)으로만 키값과 데이터를 처리한다.
			
		참고]
			Properties 는
			현재 프로그램의 정보를 Map으로 자동처리하는 기능을 가지고 있다.
 */

public class Test07 {

	public Test07() {
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}
