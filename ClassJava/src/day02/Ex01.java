package day02;

import java.util.*;
/*
	���� 1]
		54232���� �����ؾ� �Ѵ�.
		�츮���� ȭ������� 
		�� �������� ��� �ʿ����� ����ϼ���.
		
 */

/*
class Caculator {
	public static void calc() {
	int money;
	final int five = 50000;
	final int one = 10000;
	final int fiveThou = 5000;
	final int thou = 1000;
	final int fiveHun = 500;
	final int Hun = 100;
	
	System.out.println("���� �ݾ��� �Է��ϼ���");
	Scanner sc = new Scanner(System.in);
	money = sc.nextInt();
	
	System.out.println(money+ "��" + five + "�� ������ �ʿ��� ����� " + (money/five)+ " �� �Դϴ�.");
	System.out.println(money+ "��" + one + "�� ������ �ʿ��� ����� " + (money/one)+ " �� �Դϴ�.");
	System.out.println(money+ "��" + fiveThou + "�� ������ �ʿ��� ����� " + (money/fiveThou)+ " �� �Դϴ�.");
	System.out.println(money+ "��" + thou + "�� ������ �ʿ��� ����� " + (money/thou)+ " �� �Դϴ�.");
	System.out.println(money+ "��" + fiveHun + "�� ������ �ʿ��� ����� " + (money/fiveHun)+ " �� �Դϴ�.");
	System.out.println(money+ "��" + Hun + "�� ������ �ʿ��� ����� " + (money/Hun)+ " �� �Դϴ�.");
	}
}
public class Ex01 {
	public static void main(String[] args) {
	
//		new Caculator().calc();
		
 		Caculator cal = new Caculator();
		cal.calc();

	}

}
*/


public class Ex01 {
	public static void main(String[] args) {
		int money = 54232;
		int oman = money / 50000;
		int restMoney = money % 50000;
		int ochun = restMoney / 5000;
		restMoney = restMoney % 5000;
		int chun = restMoney / 1000;
		restMoney = restMoney % 1000;
		int obaek = restMoney / 500;
		restMoney %= 500;
		int baek = restMoney / 100;
		restMoney %= 100;
		int seep = restMoney / 10;
		restMoney %= 10; // 1����....
		
		System.out.println("total : " + money);
		System.out.println("50000���� : " + oman);
		System.out.println("5000���� : " + ochun);
		System.out.println("1000���� : " + chun);
		System.out.println("500���� : " + obaek);
		System.out.println("100���� : " + baek);
		System.out.println("10���� : " + seep);
		System.out.println("1���� : " + restMoney);
		
	}
}
