package day16;

import java.io.*;

/*
	예제 1]
		파일에 
		친구의 정보를 저장하자.
			정보
				이름	- String
				나이	- int
				신장	- double
				성별	- boolean ( 여성 - true, 남성 - false )
				전화	- String
				메일	- String
				
		저장을 하는데 DataStream 으로 처리를 해보자.
 */

public class Test09 {

	public Test09() {
		// 기본 스트림 준비하고
		FileOutputStream fout = null;
		// 보조스트림 준비하고
		DataOutputStream dout = null;
		try {
			fout = new FileOutputStream("src/day16/DoutTest.txt");
			dout = new DataOutputStream(fout);
			
			String name = "둘리";
			int age = 100000000;
			double height = 125.5;
			boolean gen = false;
			String tel = "010-2222-2222";
			String mail = "dooly@naver.com";
			
			// DataInput(/Output)Stream 의 특징은 자바의 데이터를
			// 변환없이 사용할 수 있다. ==> 처리해주는 함수가 별도로 존재한다.
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeDouble(height);
			dout.writeBoolean(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			
			System.out.println("### 저장완료 ###");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
