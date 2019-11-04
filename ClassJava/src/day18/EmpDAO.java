package day18;

/*
	�� Ŭ������ �����ͺ��̽� �۾��� ó���� ���� Ŭ����
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
		// �� Ŭ������ ��ü�� �Ǵ� ���� �����ͺ��̽� �۾��� �� �� �ִ� ���°� �Ǿ�� �ǹǷ�
		// �� Ŭ������ new �Ǵ� ���� �츮�� DB ��Ű���� ������ ���� MyJDBC �� �ν��Ͻ��� ����� ��߰ڴ�.
		db = new MyJDBC();
	}
	
	// ������� ����� �Լ�
	public int getTotalCnt() {
		// ���� Ŀ�ؼ� ���
		con = db.getCON();
		// ���� ��� ��������
		String sql = EmpSQL.getSQL(EmpSQL.TOTAL_CNT);
		
		// Statement ������
		stmt = db.getSTMT(con);
		// ���Ǹ�� �Ǿ ������ ��� �ް�
		int cnt = 0;
		
		try {
			rs = stmt.executeQuery(sql);
			// ��� �̰�
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
	
	// �޿��� 1500�̻��� ������� ó���Լ�
	public ArrayList<EmpVO> get1500Upper(){
		// ���Ǹ���� ����� �������̹Ƿ�
		// �� ���� �����͸� VO�� ��Ƽ� �ٽ� ����Ʈ�� ��Ƽ� �Ѱ�����.
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		// Connection ������
		con = db.getCON();
		
		// Statement ������
		stmt = db.getSTMT(con);
		String sql = EmpSQL.getSQL(EmpSQL.SEL_1500_UPPER);
		// ���Ǹ�� ������ ��� �ް�
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				
				// ������ ������
				int eno = rs.getInt("eno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hdate = rs.getDate("hiredate");
				Time hTime = rs.getTime("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int dno = rs.getInt("dno");
				
				// VO ä���ְ�
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
				
				// �ѻ���� �����͸� list�� �߰����ְ�
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
	
	
	// ���������ȸ ���� ó���Լ�
	public EmpVO getEname(String sname) {
		// �� ����������� ���� ������ �����
		EmpVO vo = new EmpVO();
		
		// Connection ���
		con = db.getCON();
		
		// ���� ��� ��������
		String sql = EmpSQL.getSQL(EmpSQL.SEL_ENAME);
		
		// PreparedStatement �����
		pstmt = db.getPSTMT(con, sql); 
		// ������ ���� ����� �ϼ��� �� ���°� �ƴϴ�.
		try {
			// ���Ǹ���� �ϼ����ְ�
			pstmt.setString(1, sname);
			
			// ���Ǹ�� ������ ������ �ް�
			rs = pstmt.executeQuery();
			// ������ ������
			// ���� Ŀ���� �÷���(Begin Of File) �� �ִ�.
			// ���� ���ٳ����� �����͸� ������ �ִ�.
			rs.next();
			
			// ������ ������
			int eno = rs.getInt("eno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			Date hdate = rs.getDate("hiredate");
			Time hTime = rs.getTime("hiredate");
			int sal = rs.getInt("sal");
			int comm = rs.getInt("comm");
			int dno = rs.getInt("dno");
			
			// VO ä���ְ�
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
		
		// ������ ��ȯ���ְ�
		return vo;
	}
	
	// �μ��� ���� ��ȸ ���� ó�� �Լ�
	public ArrayList<EmpVO> getDno(int dno){
		// ��ȯ���� ������ ������ �����
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		// �����ͺ��̽� �۾��� �ؾ� �ǹǷ� Ŀ�ؼ� ������
		con = db.getCON();
		
		// ���Ǹ�� ��������
		String sql = EmpSQL.getSQL(EmpSQL.SEL_DNO);
		
		// PreparedStatement ������
		pstmt = db.getPSTMT(con, sql);
		
		try {
			// ���Ǹ���� �ϼ���Ű��
			pstmt.setInt(1, dno);
			
			// ���Ǹ�� ������ ����ް�
			rs = pstmt.executeQuery();
			
			// ��ȸ����� �������̹Ƿ� �ݺ��ؼ� VO �� ��Ƽ� 
			// �ٽ� list�� �������.
			while(rs.next()) {
				// VO ������ְ�
				EmpVO vo = new EmpVO();
				
				// ������ ������
				int eno = rs.getInt("eno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				Date hdate = rs.getDate("hiredate");
				Time hTime = rs.getTime("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int dno1 = rs.getInt("dno");
				
				// VO ä���ְ�
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
				
				// ����Ʈ�� ������� ���
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
