package day12;

public class Test02 {
/*
	StringBuffer
		==> String 클래스와 동일하게 문자열을 관하는 클래스
			
			String 클래스와의 차이점은
			String 클래스는 데이터를 변경할 수 있는 기능은 가지고 있지 않지만
			StringBuffer 클래스는 데이터 변경이 가능하다.
			
			String은 내용이 변화되면 새로운 메모리를 다시 확보하고
			변화된 내용은 다시 기억한 후 주소를 바꾸는데
			==> 변화가 자주 일어나는 경우에는 메모리를 많이 사용하게 된다.
			
			StringBuffer 는 
			String 의 문제점을 해결하기 위해서
			만들어 놓은 문자열 관리 클래스이다.
			내용의 변화가 자주일어나는 경우에도 
			따로 메모리를 확보하지 않는 방법으로 문자열을 처리한다.
			
			하지만 StringBuffer 를 입력받아서 실행되는 함수는 
			String 을 입력받아서 실행되는 함수보다 많지가 않다.
			따라서 결국에 StringBuffer 로 문자열을 수정을 했다면
			String 타입으로 변환을 시켜서 사용해야만 한다.
			
			그 기능을 가지는 함수가
				StringBuffer.toString()
			함수이다.
			
			사용방법
				String str = "" ;
				StringBuffer buff = new StringBuffer();
				
				buff.append(문자열);
				buff.append(문자열);
				buff.append(문자열);
				buff.append(문자열);
				buff.append(문자열);
				buff.append(문자열);
				
				str = buff.toString();
				
-----------------------------------------------------------------------------------
	참고]
	
		StringBuilder
			==>	이 클래스 역시 StringBuffer와 동일한 역할을 하는 클래스이다.
				
				주로 Thread 처리를 할 때 동기화에 안정적으로 처리가 가능한 클래스이다.
				
				
				
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
