package day16;

/*
	필터스트림 ( 보조스트림 )
		==> 기본스트림에 기능을 추가한다던지
			사용자의 편의를 제공하기 위한
			보조적인 기능을 하는 스트림
			
			주의 사항
				기본스트림은 반드시 존재해야하며
				필터스트림은 필요에 따라서 연결해서 사용하면 된다.
				
			참고]
				필터스트림 역시 방향성이 있고
				반드시 같은 방향끼리만 연결이 된다.
				
		***
		1. BufferedInputStream / BufferedOutputStream
			==> 사용자의 편의기능은 없고
				대신에
				스트림의 성능을 향상시키는 역할을 한다.
				버퍼에 데이터를 모아놓았다가 한번에 처리하는 기능이 추가된 스트림...
				
			주요함수]
				
				flush()
					==> 강제로 버퍼를 비우는 함수
					
		2. DataInputStream / DataOutputStream
			==> 많이 사용하는 스트림은 아니다.
				기능 향상은 없고
				대신
				보조 스트림은 반드시 byte[]로만 데이터를 처리한다.
				문자데이터가 아닌 다른 형태의 데이터는 
				문제가 있을 수 있다.
				==> 자바의 데이터형을 byte[]로 변환 하지 않고
					직접 외부장치로 입력하는 기능을 추가한 것.
					
				
				잘 사용하지 않는 이유
					DataOutputStream 을 이용한 경우는
					반드시 DataInputStream을 이용해서 받아야 한다.
					<== 순서가 지켜져야하기 때문에...
					(저장할 때 int, float -> 받을 때도 int, float의 순서대로 받아야 한다.)
					
 */

import java.io.*;

public class Test08 {
// BufferedStream 을 사용해서 임의의 내용이 저장되는 파일을 만들어 보자.
	public Test08() {
		// 1. 반드시 기본스트림은 필요하다.
		FileOutputStream fout = null;
		// 2. 필요에 따라서 보조(필터)스트림을 연결해서 사용할 수 있다.
		BufferedOutputStream bout = null;
		
		String str = "write(byte[] b)\r\n" + 
				"Writes b.length bytes from the specified byte array to this file output stream.";
		
		byte[] buff = str.getBytes();
		
		try {
			fout = new FileOutputStream("src/day16/TestBOut.txt");
			bout = new BufferedOutputStream(fout);
			
			// 데이터를 보낸다.
			bout.write(buff);
			// 버퍼는 다 채워지지 않으면 자동으로 내보내지 않는다.
			// 따라서 기본스트림으로 데이터가 전달되지 않은 상태다.
			
			// 반드시 습관적으로 완료된 시점에서 버퍼를 강제로 비우는 습관을 가져야 한다.
			bout.flush();
			
			// 저장 완료
			System.out.println("### 저장 완료 ###");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();
				fout.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
