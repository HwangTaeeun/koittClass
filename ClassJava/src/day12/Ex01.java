package day12;

import java.util.regex.*;

/*
	���� 1]
		ȸ�� ���̵��� ������ �˻� �Ϸ��� �մϴ�.
		���̵�� ����ҹ���, ���� �� ��� ���ԵǾ�� �ϰ�
		���̴� 8���� �̻��̾�� �Ѵ�.
		
		���Խ� ������ ����� �˻��ؼ� ����� ����ϼ���.
 */

import java.util.regex.*;


public class Ex01 {

	public Ex01() {
		String sid = "abcD1234";
		
		Pattern reg = Pattern.compile("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]))(^[a-zA-Z0-9]{8}$)");
		
		Matcher match = reg.matcher(sid);
		System.out.println(sid + " | " + match.matches());
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
