package day13;

import java.text.*;
import java.util.*;

/*
	���� 7]
		�����ͺ��̽��� 
			�̸�	: name
			��ȭ	: tel
			����	: age
		�� �Է��ϵ��� ���̺� ����� ���Ҵ�.
		
		�׷��� Ư���� �̸�(ȫ�浿)���� ��ȸ�ϴ� ���� �����
			
			"
			SELECT 
				name, tel, age
			FROM
				friend
			WHERE
				name = 'ȫ�浿'
			"
			
		�̷� �������� ���Ǹ���� ��������µ�
		�̸��� �Է¹޾Ƽ� ���Ǹ���� �ϼ��ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class Test07 {

	public Test07() {
		StringBuffer buff = new StringBuffer();
		buff.append("SELECT ");
		buff.append("	name, tel, age ");
		buff.append("FROM ");
		buff.append("	member ");
		buff.append("WHERE ");
		buff.append("	name = ");
		buff.append("{0}");
		
		// StingBuffer �� String ���� ��ȯ�ؼ� MessageFormat �� �����.
		MessageFormat form = new MessageFormat(buff.toString());
		
		// �Է¹��� �غ��ϰ�
		Scanner sc = new Scanner(System.in);
		// �޼�������ϰ� �Է¹ް�
		System.out.println("�˻��� ģ���� �̸� : ");
//		String sname = sc.nextLine();
		String sname = "'"+sc.nextLine() + "'";
		// ������ä���� ���Ǹ�� �ϼ��ϰ�
		Object[] obj = {sname};
		String msg = form.format(obj);
		
		// �ϼ��� ���� ��� ���
		System.out.println("�Է��� [ " + sname + " ]�� �������Ǹ�� :\n" + msg);
	}

	public static void main(String[] args) {
		new Test07();
	}

}
