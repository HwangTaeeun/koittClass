package extra;

public class Test10_01 {
/*
	ȸ������ ���α׷��� ���� �����̴�.
	ȸ���� ���̵�, ��й�ȣ, �������� ������ �����̰�
	
	ȸ�� ���̵� �Է��ϸ�
	ȸ���� ������ ����ϴµ�
	������´� 
		
		H**g - **** - 2019/10/23
		
	���·� ��µǰ� �ϼ���.
	
	ȸ���� �迭��(10��¥��) �־ �����ϼ���.
 */
	public Test10_01() {
		String name = "Hong Gil Dong";
		String pw = "1234";
		
		String tmp = "";
		for(int i = 0 ; i < pw.length() ; i++) {
			tmp += '*';
		}
		
		String sname = "";
		for(int i = 0 ; i < name.length(); i++ ) {
			if(i == 0 || i == name.length() - 1) {
				sname += name.charAt(i);
			} else {
				sname += '*';
			}
		}
		
		System.out.println(sname + " - " + tmp);
	}

	public static void main(String[] args) {
		new Test10_01();
	}

}
