package day12;

public class Test02 {
/*
	StringBuffer
		==> String Ŭ������ �����ϰ� ���ڿ��� ���ϴ� Ŭ����
			
			String Ŭ�������� ��������
			String Ŭ������ �����͸� ������ �� �ִ� ����� ������ ���� ������
			StringBuffer Ŭ������ ������ ������ �����ϴ�.
			
			String�� ������ ��ȭ�Ǹ� ���ο� �޸𸮸� �ٽ� Ȯ���ϰ�
			��ȭ�� ������ �ٽ� ����� �� �ּҸ� �ٲٴµ�
			==> ��ȭ�� ���� �Ͼ�� ��쿡�� �޸𸮸� ���� ����ϰ� �ȴ�.
			
			StringBuffer �� 
			String �� �������� �ذ��ϱ� ���ؼ�
			����� ���� ���ڿ� ���� Ŭ�����̴�.
			������ ��ȭ�� �����Ͼ�� ��쿡�� 
			���� �޸𸮸� Ȯ������ �ʴ� ������� ���ڿ��� ó���Ѵ�.
			
			������ StringBuffer �� �Է¹޾Ƽ� ����Ǵ� �Լ��� 
			String �� �Է¹޾Ƽ� ����Ǵ� �Լ����� ������ �ʴ�.
			���� �ᱹ�� StringBuffer �� ���ڿ��� ������ �ߴٸ�
			String Ÿ������ ��ȯ�� ���Ѽ� ����ؾ߸� �Ѵ�.
			
			�� ����� ������ �Լ���
				StringBuffer.toString()
			�Լ��̴�.
			
			�����
				String str = "" ;
				StringBuffer buff = new StringBuffer();
				
				buff.append(���ڿ�);
				buff.append(���ڿ�);
				buff.append(���ڿ�);
				buff.append(���ڿ�);
				buff.append(���ڿ�);
				buff.append(���ڿ�);
				
				str = buff.toString();
				
-----------------------------------------------------------------------------------
	����]
	
		StringBuilder
			==>	�� Ŭ���� ���� StringBuffer�� ������ ������ �ϴ� Ŭ�����̴�.
				
				�ַ� Thread ó���� �� �� ����ȭ�� ���������� ó���� ������ Ŭ�����̴�.
				
				
				
 */
	public static final int SEL_ID = 1001;
	
	public Test02() {
		String sql = getSQL(Test02.SEL_ID);
		
		sql = sql.replace("###", "'jfla'");
		
		System.out.println(sql);
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	public String getSQL(int code) {
//		String sql = "";
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case 1001:
			buff.append("SELECT ");
			buff.append("	mno, mid, mpw, mname, maddr, mtel ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	mid = ### ");
			break;
		case 1002:
			buff.append("SELECT ");
			buff.append("SELECT ");
			buff.append("SELECT ");
			buff.append("SELECT ");
			buff.append("SELECT ");
			break;
		case 1003:
			buff.append("UPDATE ");
			buff.append("UPDATE ");
			buff.append("UPDATE ");
			buff.append("UPDATE ");
			buff.append("UPDATE ");
			buff.append("UPDATE ");
			break;
		}
		
		return buff.toString();
//		sql = buff.toString();
//		return sql;
	}
}


class MemberSQL {
	public static final int SEL_ID = 1001;
	public static final int SEL_NAME = 1002;
	
	public static final int UPDATE_TEL = 2001;
	
	public static final int INSERT_MEMBER = 3001;
	
	
	
	
	public String getSQL(int code) {
//		String sql = "";
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case 1001:
			buff.append("SELECT ");
			buff.append("	mno, mid, mpw, mname, maddr, mtel ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	mid = ### ");
			break;
		case 1002:
			buff.append("SELECT ");
			buff.append("SELECT ");
			buff.append("SELECT ");
			buff.append("SELECT ");
			buff.append("SELECT ");
			break;
		case 2001:
			buff.append("UPDATE ");
			buff.append("UPDATE ");
			buff.append("UPDATE ");
			buff.append("UPDATE ");
			buff.append("UPDATE ");
			buff.append("UPDATE ");
			break;
		case 3001:
			buff.append("INSERT INTO ");
			buff.append("	member ");
			buff.append("VALUES( ");
			buff.append("  ");
			buff.append(") ");
			break;
		}
		
		return buff.toString();
//		sql = buff.toString();
//		return sql;
	}
}
