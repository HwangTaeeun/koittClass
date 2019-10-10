package day01;

/*
	형변환(Casting)
		- 리터럴 형변환
		- 강제 형변환
		- 자동 형변환
		
	참고]
		데이터의 크기
		
		정수 < 실수 < 문자열
		
			long(8바이트) < float(4바이트) < String
 */
public class Test04 {
	int no1 = 10;
	int no2 = 3;
	float fl1 = 3.14f;			// 리터럴 형변환
	float fl2 = (float) 3.14; // 강제형변환
	
	double db1 = fl1;
	double db2 = no1;
	
	double db3 = 3d;	// 리터럴 형변환
	
//	double db4 = no1d; // 리터럴풀에 이미 담긴 내용은 리터럴 형변환이 불가하다.  
	
	
	
	public static void main(String[] args) {
		
	}
}
