package day16;

import java.io.*;

/*
	PrintStream
		==> 필터계열의 스트림이다.
			보조스트림이다.
			
			사용자의 편의성 + 기능 향상을 동시에 만들어 놓은 보조 스트림이다.
			
			기능]
				1. 내부적으로 Buffered와 연결해 놓았다.
				2. 사용자 편의를 위해서 자바의 데이터형태를 그래도 출력하도록 해 놓았다.
				3. 파일과 직접 연결할 수 있도록 해 놓았다.
					( 다른 외부장치와도 연결이 가능하다. )
					
			단점 ]
				한 쌍을 이루는 InputStream 이 존재하지 않는다.
 */

/*
	예제 2]
		PrintStream 을 사용해서 
		시를 파일로 저장해 보자.

 */
public class Test11 {

	public Test11() {
		// 스트림을 준비하고
		PrintStream ps = null;
		// 직접 파일에 연결된 스트림을 만드는 보조스트림...
		
		try {
			// 스트림을 만들고
			ps = new PrintStream("src/day16/poem.txt");
			
			ps.println("*** 서시 ***");
			ps.println("\t\t\t\t윤동주");
			ps.println();
			ps.println("죽는 날까지 하늘을 우르러");
			ps.println("한점 부끄럼이 없기를,");
			ps.println("잎새에 이는 바람에도");
			ps.println("나는 괴로워했다.");
			ps.println("별을 노래하는 마음으로");
			ps.println("모든 죽어가는것을 사랑해야지");
			ps.println("그리고 나안테 주어진 길을");
			ps.println("거러가야겠다.");
			ps.println();
			ps.println("오늘밤에도 별이 바람에 스치운다.");
			
			ps.flush();
			// 내부적으로 BufferStream의 기능을 가지고 있으므로
			// 반드시 내보내기가 끝나면 버퍼를 비워야 한다.
			System.out.println("***** 저장 완료 *****");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
