package day16;

import java.io.*;

/*
	day15 패키지 안의 파일중 .txt 파일의 목록을 알아내자.
	
 */

public class Test03 {

	public Test03() {
		// 목록을 알아내고 싶은 폴더를 먼저 파일로 만들고
		File file = new File("src/day15");
		
		/*
		String[] arr = file.list();
		for(String fname : arr) {
			System.out.println(fname);
		}
		*/
		// 확장자가 txt인 파일만 골라서 출력하고 싶다.
		String[] arr = file.list(new MyFilter());
		// 목록을 출력한다.
		for(String fname : arr) {
			System.out.println(fname);
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		/*
			이 함수의 매개변수의 설명
				File dir	- 현재 파일의 정보를 알려주고
				String name	- 현재 파일의 이름을 알려준다.
				
			이 함수는 list()가 실행될 때 함수가 자동 호출하는 함수이다.
			목록을 구하는 파일을 하나씩 발견할 때 마다 이 함수가 호출이 된다.
			
			반환값이 실행이 될 때마다 true 아니면 false 가 반환이 되는데...
				true	- 목록에 포함시키고
				false	- 목록에서 제외
		 */
		boolean bool = false;
		
		if(name.endsWith(".txt")) {
			bool = true;
		}
		
		return bool;
	}
	
}