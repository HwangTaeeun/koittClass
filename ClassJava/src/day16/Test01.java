package day16;
import java.io.*;

/*
	스트림( Stream )
		==> 자바는 외부장치와 데이터를 주고 받는 방법을 하나의 방법으로 통일 시켜놓았다.
			그것이 바로 Stream 이라는 것이다.
				
				스트림을 빨대로 생각하면 정확한 원리가 이해가 될 것이다.
				
				즉, 스트림을 데이터를 주고받을 외부장치에 꽂기만 하면
				나는 빨기만 하면 (같은 함수를 이용해서)
				외부장치의 데이터가 들어온다. 는 개념이다.
				
		참고]
			스트림은 단방향이다.
			즉, 하나의 스트림은 한방향으로만 데이터를 보낼 수 있다.
			만약 하나의 외부장치에 데이터를 주고 받기를 하려면
			스트림이 두개가 필요하다.
			
			
		종류 : 방향성
			1. 프로그램으로 데이터 들어오는 방향
				==> InputStream, Reader
				
			2. 프로그램에서 데이터가 나가는 방향
				==> OutputStream, Writer
				
		종류 : 데이터의 양
			1. byte(1byte) 단위
				InputStream, OutputStream
				==> 속도가 조금 느리다.
					(기계어 처리가 가능하다.)
			
			2. char(2byte) 단위
				Reader, Writer
				==> 속도가 좀 더 빠르다.
					(오직 문자처리만 가능하다.)
					
				참고]
					byte가  char로 합쳐지는 순간 
					운영체제에 따라서 비트 순서가 바뀔 수 있다.
					
		종류 : 상대방의 종류
			1. 타겟 스트림(기본 스트림)
				==> 외부장치에 직접 연결되는 스트림
				
			2. 필터 스트림
				==> 스트림의 성능 향상, 개발의 편의를 위해서
					스트림에 연결되는 스트림
					
			참고]
				기본 스트림(타겟 스트림)은 반드시 존재해야 하고
				필요에 따라서 보조 스트림(필터 스트림)을 연결해서 사용해야 한다.
				
--------------------------------------------------------------------------------------------------------
	1. InputStream의 기본 함수
		int read()
			==> 오직 한 문자만 (1byte) 읽어들이는 함수
				반환값 	읽은문자
				
		int read(byte[] b)
			==> 여러 바이트를 읽어들이는 함수
				읽은 결과는 byte[] b가 기억하고
				반환값 	읽은 데이터의 갯수(바이트 수)
				
		int read(byte[] b, int off, int len)
			==> 여러 바이트를 읽어들이는 함수
				다만, 배열의 지정한 위치부터 지정한 갯수만큼만 읽어준다.
				반환값		읽은 데이터 갯수(바이트 수)
				
	2. FileInputStream
		==> 파일에 연결되는 입력용 스트림
		
		생성방법]
			FileInputStream(String fileName)
			==> 스트림에 열결할 파일의 이름을 이용해서 스트림을 연결한다.
			
	3. FileOutputStream
		==> 파일로 연결된 보내는 방향의 스트림
		
		이 클래스를 이용해서 OutputStream의 기본 함수를 배운다.
		
		기본함수
			
			void write(int b)
				==> 한 글자만 내보내는 함수
			void write(byte[] b)
				==> 여러글자를 내보내는 함수
			void write(byte[] , int off, int len)
				==> 여러 글자 중에서 지정한 부분만 내보내는 함수
					int off		내보내기 시작위치
					int len		내보내기 데이터 갯수

=======================================================================================================

	File
		==> 이것은 스트림은 아니다. (데이터를 입력, 출력하는 기능은 없다.)
			외부 장치 중에서 가장 많이 사용하는 외부장치가 파일이다.
			==> 그 파일의 정보를 처리하기 위해서 만들어진 클래스
			
		생성방법]
			
			File(String pathName)
				==> 파일의 경로와 이름을 지정해서 만드는 방법
				
				참고]
					프로그래밍 에서는 폴더도 파일로 간주한다.
					예]
						File f = new File("D:\\");
				
			File(String parent, String child)
				==> 파일의 경로와 이름을 따로 지정해서 만드는 방법
				
			File(File parent, String child)
				==> 파일의 정보를 이용하고 파일의 이름만 다시 지정해서 만드는 방법
			
			File(URI uri)
				==> 네트워크에서 다른 시스템에 있는 파일의 정보를 만드는 방법
				
		참고함수]
			1. 정보를 얻어내는 함수
				
				getName()
					==> 파일의 이름만 얻어내는 함수
				
				getParent()
					==> 폴더이름만 알아내는 함수
				
				exists()
					==> 파일의 존재 여부를 알아내는 함수
				
				length()
					==> 파일의 크기를 알아내는 함수
				...
				
			2. 외부적인 작업을 위해서 필요한 함수
				==> 데이터 입출력 이외의 파일 전체에 대해서 필요한 작업을 할 수 있는 함수들...
				
				delete()
					==> 파일 삭제
					
				mkdir()
					==> 폴더를 만드는 함수
					
				mkdirs()
					==> 폴더를 만드는데 경로상에 있는 폴더 까지 만든다.
					
				renameTo()
					==> 파일이름을 변경 하는 함수
						
				list()
					==> 폴더에 존재하는 모든 파일의 목록을 구해주는 함수
					
				..
			
		참고]
			String[] list()		==> 이름만 알아내는 함수
			File[] listFiles()	==> 정보를 알아내는 함수
									==> 일반적인 파일 목록을 구해주는 함수
			
									
			String[] list(FilenameFilter filter)
			File[] listFiles(FileFilter filter)
			File[] listFiles(FilenameFilter filter)
			==> 필터링을 해서 리스트를 구해주는 함수들...
				필요한 파일만 골라서 목록을 구해주는 함수들...
			
 */

/*
	1. D:\ 폴더하나(FileTest)를 강제로 만들 수 있다.
	
	2. D:\ 계층구조의 폴더를 강제로 만들 수 있다.
	
	3. 만들어진 파일 중 하나를 삭제 할 수 있다. (test03 삭제)
 */
public class Test01 {

	public Test01() {
		// ==> 1
		//  만들고 싶은 폴더(없어도 상관 없다) 파일로 만들자.
		File file = new File("D:\\FileTest");
		// 객체가 만들어 졌으니 해당 디렉토리를 만드는 함수를 호출한다.
		
		boolean bool = file.mkdir();
		System.out.println(bool ? "FileTest 폴더 생성이 완료되었습니다." : "FileTest폴더 생성에 실패했습니다.");
		
		// ==> 계층을 D:\FileTest\test1\test2\test3
		File file1 = new File("D:\\FileTest\\test1\\test2\\test3");
		bool = file1.mkdirs();
		System.out.println(bool ? "### FileTest 하위 폴더 생성이 완료되었습니다." : "### FileTest 하위 폴더 생성에 실패했습니다.");
		
		// 폴더 삭제하기
		bool = file1.delete();
		System.out.println(bool ? "@@@@@@@@@ test3을 삭제 했습니다." : "@@@@@@@@@ 삭제작업에 실패했습니다.");
		
		// test3 다시 만들기
		bool = file1.mkdir();
		System.out.println(bool ? "### test3 폴더 생성이 완료되었습니다." : "### test3 폴더 생성에 실패했습니다.");
	}

	public static void main(String[] args) {
		new Test01();
	}

}
