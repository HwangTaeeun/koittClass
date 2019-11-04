package day18;

// JDBC 사용을 위한 클래스를 준비한 패키지
import java.sql.*;

public class Test01 {

	public Test01() {
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // 질의의 결과를 담아 놓는 클래스
		
		try {
			/*
		 	1. JDBC와 외부 데이터베이스를 연결할 드라이버를 
		 		프로그램에서 가지고 와야 한다.
		 		
		 		외부 클래스를 로딩하는 함수
		 			Class.foName()
		 		드라이버마다 외부 클래스의 이름이 조금씩 다르다.
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 드라이버가 로딩이 되면 이줄을 실행할 것이고
			// 이제 데이터베이스에 접속할 수 있는 상태가 됬다.
			System.out.println("### 드라이버 로딩 성공 ###");
			
			/*
			 	2. 오라클에 접속을 시도
			 		각각의 데이터베이스마다 접속하는 방법(URL)이 조금씩 다르다.
			 		오라클의 경우는 지금의 방법처럼 하면 될 것이고
			 		다른 DBMS의 경우는 검색을 해서 찾으면 될 것이다.
			 		
			 		접속하는 명령어는 JDBC에게 명령하면 된다.
			 			DriverManager.getConnection();
			 */
			
			// 접속에 필요한 것들을 변수로 만들어 놓고
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			// url 은 데이터베이스 마다 조금씩 달라진다.
			String user = "scott";
			String password = "tiger";
			
			// 만들어 놓은 정보로 접속을 한다.
			con = DriverManager.getConnection(url, user, password);
			System.out.println("*** 접속 성공 ***");
			
			/*
				접속을 하게 되면 접속자를 관리하는 세션을 JDBC에서 제공하게 된다.
				이 세션을 관리하는 클래스 바로 Connection이다
				
				이제부터는 동일한 방식으로 JDBC에게 명령을 내리면 
				JDBC가 알아서 해당 DBMS에게 명령을 전달을 하게 된다.
			 */
			///////////////////////////////////////////////////////////////////////////////
			/*
				JDBC가 DBMS에게 명령을 전달하는 방법
					
					1. Statement
						==> 질의명령(데이터베이스에게 요청하는 명령)이 완성이 된 경우 사용하는 클래스
					2. PreparedStatement
						==> 질의명령이 이후에 데이터를 추가해서 완성해야 되는 경우 사용하는 클래스
			 */
			
			// emp테이블의 사원수를 조회하는 질의명령을 보내고 결과를 받아보자.
			String sql = "SELECT count(*) cnt FROM emp";
			
			// Statement 를 만든다.
			stmt = con.createStatement();
			
			// 질의 명령을 실어서 보내고 결과를 받는다.( 보내기와 받기가 동시에 이루어진다. )
			rs = stmt.executeQuery(sql);
			
			rs.next();
			int cnt = rs.getInt(1);
//			int cnt = rs.getInt("cnt");
			
			System.out.println("총 사원 수 : " + cnt);
			
			rs = null;
			
			// 조회를 원하는 부서의 사원수를 조회해보자.
			sql = "SELECT count(*) cnt FROM emp WHERE deptno = ?"; 
			// ? 대신 부서번호를 채워야 질의명령이 완성이 되서 결과가 반환이 될 것이다.
			// 이때 사용하는 클래스가 PreparedStatement 이다.
			
			// 먼저 PreparedStatement 를 만들고
			pstmt = con.prepareStatement(sql);
			
			// 질의 명령 완성하고
			pstmt.setInt(1, 20);
			
			// 질의 명령을 보내고 결과 받고
			rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");
			System.out.println("20번 부서의 사원 수 : " + cnt);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e) {
				System.out.println("*** 닫기 에러 ***");
			}
		}
		
		System.out.println("###### 프로그램 종료 #####");
	}

	public static void main(String[] args) {
		new Test01();
	}

}
