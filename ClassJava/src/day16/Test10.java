package day16;

import java.io.*;

/*
	Test09에서 만든 파일을 읽어보자.
 */
public class Test10 {

	public Test10() {
		// DataOutputStream 으로 저장한 파일은 반드시
		// DataInputStream 으로 읽어야 내용이 정확하게 보인다.
		
		// 기본 스트림 준비하고
		FileInputStream fin = null;
		// 보조 스트림 준비하고
		DataInputStream din = null;
		
		try {
			// 스트림 만들고
			fin = new FileInputStream("src/day16/DoutTest.txt");
			din = new DataInputStream(fin);
			/*
				주의 사항]
					데이터를 저장할 때
						이름, 나이, 신장, 성별, 전화, 메일 
					순으로 저장을 했으므로
					읽을 때도 반드시 순서를 저장한 순서대로 읽어야 한다.
			 */
			
			String name = din.readUTF();
			int age = din.readInt();
			double height = din.readDouble();
			boolean gen = din.readBoolean();
			String tel = din.readUTF();
			String mail = din.readUTF();
			
			System.out.println("name : " + name + 
								"\nage : " + age +
								"\nheight : " + height +
								"\ngen : " + gen + 
								"\ntel : " + tel + 
								"\nmail : " + mail
			);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				din.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
