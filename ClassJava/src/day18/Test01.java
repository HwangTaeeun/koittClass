package day18;

// JDBC ����� ���� Ŭ������ �غ��� ��Ű��
import java.sql.*;

public class Test01 {

	public Test01() {
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // ������ ����� ��� ���� Ŭ����
		
		try {
			/*
		 	1. JDBC�� �ܺ� �����ͺ��̽��� ������ ����̹��� 
		 		���α׷����� ������ �;� �Ѵ�.
		 		
		 		�ܺ� Ŭ������ �ε��ϴ� �Լ�
		 			Class.foName()
		 		����̹����� �ܺ� Ŭ������ �̸��� ���ݾ� �ٸ���.
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ����̹��� �ε��� �Ǹ� ������ ������ ���̰�
			// ���� �����ͺ��̽��� ������ �� �ִ� ���°� ���.
			System.out.println("### ����̹� �ε� ���� ###");
			
			/*
			 	2. ����Ŭ�� ������ �õ�
			 		������ �����ͺ��̽����� �����ϴ� ���(URL)�� ���ݾ� �ٸ���.
			 		����Ŭ�� ���� ������ ���ó�� �ϸ� �� ���̰�
			 		�ٸ� DBMS�� ���� �˻��� �ؼ� ã���� �� ���̴�.
			 		
			 		�����ϴ� ��ɾ�� JDBC���� ����ϸ� �ȴ�.
			 			DriverManager.getConnection();
			 */
			
			// ���ӿ� �ʿ��� �͵��� ������ ����� ����
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			// url �� �����ͺ��̽� ���� ���ݾ� �޶�����.
			String user = "scott";
			String password = "tiger";
			
			// ����� ���� ������ ������ �Ѵ�.
			con = DriverManager.getConnection(url, user, password);
			System.out.println("*** ���� ���� ***");
			
			/*
				������ �ϰ� �Ǹ� �����ڸ� �����ϴ� ������ JDBC���� �����ϰ� �ȴ�.
				�� ������ �����ϴ� Ŭ���� �ٷ� Connection�̴�
				
				�������ʹ� ������ ������� JDBC���� ����� ������ 
				JDBC�� �˾Ƽ� �ش� DBMS���� ����� ������ �ϰ� �ȴ�.
			 */
			///////////////////////////////////////////////////////////////////////////////
			/*
				JDBC�� DBMS���� ����� �����ϴ� ���
					
					1. Statement
						==> ���Ǹ��(�����ͺ��̽����� ��û�ϴ� ���)�� �ϼ��� �� ��� ����ϴ� Ŭ����
					2. PreparedStatement
						==> ���Ǹ���� ���Ŀ� �����͸� �߰��ؼ� �ϼ��ؾ� �Ǵ� ��� ����ϴ� Ŭ����
			 */
			
			// emp���̺��� ������� ��ȸ�ϴ� ���Ǹ���� ������ ����� �޾ƺ���.
			String sql = "SELECT count(*) cnt FROM emp";
			
			// Statement �� �����.
			stmt = con.createStatement();
			
			// ���� ����� �Ǿ ������ ����� �޴´�.( ������� �ޱⰡ ���ÿ� �̷������. )
			rs = stmt.executeQuery(sql);
			
			rs.next();
			int cnt = rs.getInt(1);
//			int cnt = rs.getInt("cnt");
			
			System.out.println("�� ��� �� : " + cnt);
			
			rs = null;
			
			// ��ȸ�� ���ϴ� �μ��� ������� ��ȸ�غ���.
			sql = "SELECT count(*) cnt FROM emp WHERE deptno = ?"; 
			// ? ��� �μ���ȣ�� ä���� ���Ǹ���� �ϼ��� �Ǽ� ����� ��ȯ�� �� ���̴�.
			// �̶� ����ϴ� Ŭ������ PreparedStatement �̴�.
			
			// ���� PreparedStatement �� �����
			pstmt = con.prepareStatement(sql);
			
			// ���� ��� �ϼ��ϰ�
			pstmt.setInt(1, 20);
			
			// ���� ����� ������ ��� �ް�
			rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");
			System.out.println("20�� �μ��� ��� �� : " + cnt);
			
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
				System.out.println("*** �ݱ� ���� ***");
			}
		}
		
		System.out.println("###### ���α׷� ���� #####");
	}

	public static void main(String[] args) {
		new Test01();
	}

}
