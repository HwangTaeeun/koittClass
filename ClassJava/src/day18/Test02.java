package day18;

/*
	이 클래스는 
	emp 테이블의 내용의 조회를 구분해서 처리요청을 받는 클래스...
		
		내용
			1. 전체 사원수 조회
			2. 사원이름으로 사원정보 조회
			3. 부서번호를 입력받아 부서원의 정보를 조회
			
			보너스
			4. 급여가 1500 이상인 사원의 정보를 조회
 */

import java.util.*;
import VO.*;

public class Test02 {
/*
	DB 처리를 DAO 클래스에서 전담하기로 했으므로
	DAO클래스를 객체를 만들어서 사용해야겠다.
	
 */
	public Test02() {
		EmpDAO dao = new EmpDAO();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("총사원수 조회 : 1\n사원정보조회 : 2"+
								"\n급여가 1500 이상인 사원정보조회 : 3" +
								"\n각 부서의 사원정보 조회 : 4" +
								"\n종료 : 9"
					);
			int no = sc.nextInt();
			if(no == 9) {
				break;
			}
			
			switch(no) {
			case 1:
				int cnt = dao.getTotalCnt();
				System.out.println("총 사원수 : " + cnt);
				break;
			case 2: // 사원 이름 입력하면 정보 조회
//				sc.close();
//				sc = new Scanner(System.in);
				System.out.println("사원 이름 : ");
				String sname = sc.next();
				System.out.println("$$$$$$$$$$$ " + sname);
				EmpVO vo1 = dao.getEname(sname);
				System.out.println("===============================================");
				System.out.println(vo1);
				break;
			case 3:
				ArrayList<EmpVO> list = dao.get1500Upper();
				for(EmpVO vo : list) {
					System.out.println(vo);
				}
				break;
			case 4:
				// 부서번호 입력받고
				System.out.println("부서번호를 입력하세요!");
				int dno = sc.nextInt();
				System.out.println("********** 부서번호 : " + dno);
				if(dno >= 40) break;
				
				ArrayList<EmpVO> list1 = dao.getDno(dno);
				System.out.println("===============================================");
				for(EmpVO vo2 : list1) {
					System.out.println(vo2);
				}
				break;
			}
		}
		
		int cnt = dao.getTotalCnt();
		
		System.out.println("총 사원 수  : " + cnt);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
