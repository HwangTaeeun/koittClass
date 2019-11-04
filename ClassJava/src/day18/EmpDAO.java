package day18;

/*
	이 클래스는 데이터베이스 작업을 처리할 전담 클래스
 */

import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.text.*;
import DB.*;
import sql.*;
import VO.*;

public class EmpDAO {
	MyJDBC db = null;
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public EmpDAO() {
		// 이 클래스는 객체가 되는 순간 데이터베이스 작업을 할 수 있는 상태가 되어야 되므로
		// 이 클래스가 new 되는 순간 우리가 DB 패키지에 제작해 놓은 MyJDBC 를 인스턴스로 만들어 줘야겠다.
		db = new MyJDBC();
	}
	
	// 사원수를 얻오는 함수
	public int getTotalCnt() {
		// 먼저 커넥션 얻고
		con = db.getCON();
		// 질의 명령 가져오고
		String sql = EmpSQL.getSQL(EmpSQL.TOTAL_CNT);
		
		// Statement 얻어오고
		stmt = db.getSTMT(con);
		// 질의명령 실어서 보내고 결과 받고
		int cnt = 0;
		
		try {
			rs = stmt.executeQuery(sql);
			// 결과 뽑고
			rs.next();
			cnt = rs.getInt("cnt");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		return cnt;
	}
	
	// 급여가 1500이상인 사원정보 처리함수
	public ArrayList<EmpVO> get1500Upper(){
		// 질의명령의 결과가 여러줄이므로
		// 각 줄의 데이터를 VO에 담아서 다시 리스트에 담아서 넘겨주자.
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		// Connection 얻어오고
		con = db.getCON();
		
		// Statement 얻어오고
		stmt = db.getSTMT(con);
		String sql = EmpSQL.getSQL(EmpSQL.SEL_1500_UPPER);
		// 질의명령 보내고 결과 받고
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				
				// 데이터 꺼내고
				int eno = rs.getInt("eno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hdate = rs.getDate("hiredate");
				Time hTime = rs.getTime("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int dno = rs.getInt("dno");
				
				// VO 채워주고
				vo.setEno(eno);
				vo.setEname(ename);
				vo.setJob(job);
				vo.setMgr(mgr);
				vo.setHiredate(hdate);
				vo.setHireTime(hTime);
				vo.setsDate();
				vo.setSal(sal);
				vo.setComm(comm);
				vo.setDno(dno);
				
				// 한사람분 데이터를 list에 추가해주고
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list;
	}
	
	
	// 사원정보조회 전담 처리함수
	public EmpVO getEname(String sname) {
		// 한 사원의정보를 담을 변수를 만들고
		EmpVO vo = new EmpVO();
		
		// Connection 얻고
		con = db.getCON();
		
		// 질의 명령 가져오고
		String sql = EmpSQL.getSQL(EmpSQL.SEL_ENAME);
		
		// PreparedStatement 얻오고
		pstmt = db.getPSTMT(con, sql); 
		// 아직은 질의 명령이 완성이 된 상태가 아니다.
		try {
			// 질의명령을 완성해주고
			pstmt.setString(1, sname);
			
			// 질의명령 보내고 데이터 받고
			rs = pstmt.executeQuery();
			// 데이터 꺼내고
			// 지금 커서는 컬럼줄(Begin Of File) 에 있다.
			// 따라서 한줄내려야 데이터를 꺼낼수 있다.
			rs.next();
			
			// 데이터 꺼내고
			int eno = rs.getInt("eno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			Date hdate = rs.getDate("hiredate");
			Time hTime = rs.getTime("hiredate");
			int sal = rs.getInt("sal");
			int comm = rs.getInt("comm");
			int dno = rs.getInt("dno");
			
			// VO 채워주고
			vo.setEno(eno);
			vo.setEname(ename);
			vo.setJob(job);
			vo.setMgr(mgr);
			vo.setHiredate(hdate);
			vo.setHireTime(hTime);
			vo.setsDate();
			vo.setSal(sal);
			vo.setComm(comm);
			vo.setDno(dno);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		// 정보를 반환해주고
		return vo;
	}
	
	// 부서의 직원 조회 전담 처리 함수
	public ArrayList<EmpVO> getDno(int dno){
		// 반환해줄 데이터 변수를 만들고
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		// 데이터베이스 작업을 해야 되므로 커넥션 얻어오고
		con = db.getCON();
		
		// 질의명령 가져오고
		String sql = EmpSQL.getSQL(EmpSQL.SEL_DNO);
		
		// PreparedStatement 얻어오고
		pstmt = db.getPSTMT(con, sql);
		
		try {
			// 질의명령을 완성시키고
			pstmt.setInt(1, dno);
			
			// 질의명령 보내고 결과받고
			rs = pstmt.executeQuery();
			
			// 조회결과가 여러줄이므로 반복해서 VO 에 담아서 
			// 다시 list에 담아주자.
			while(rs.next()) {
				// VO 만들어주고
				EmpVO vo = new EmpVO();
				
				// 데이터 꺼내고
				int eno = rs.getInt("eno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hdate = rs.getDate("hiredate");
				Time hTime = rs.getTime("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int dno1 = rs.getInt("dno");
				
				// VO 채워주고
				vo.setEno(eno);
				vo.setEname(ename);
				vo.setJob(job);
				vo.setMgr(mgr);
				vo.setHiredate(hdate);
				vo.setHireTime(hTime);
				vo.setsDate();
				vo.setSal(sal);
				vo.setComm(comm);
				vo.setDno(dno1);
				
				// 리스트에 사원정보 담고
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		return list;
	}
}
