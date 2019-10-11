package day02;

import java.util.*;
/*
	문제 1]
		54232원을 지불해야 한다.
		우리나라 화폐단위로 
		각 단위별로 몇개가 필요한지 계산하세요.
		
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
	
	System.out.println("나눌 금액을 입력하세요");
	Scanner sc = new Scanner(System.in);
	money = sc.nextInt();
	
	System.out.println(money+ "를" + five + "로 나누면 필요한 장수는 " + (money/five)+ " 장 입니다.");
	System.out.println(money+ "를" + one + "로 나누면 필요한 장수는 " + (money/one)+ " 장 입니다.");
	System.out.println(money+ "를" + fiveThou + "로 나누면 필요한 장수는 " + (money/fiveThou)+ " 장 입니다.");
	System.out.println(money+ "를" + thou + "로 나누면 필요한 장수는 " + (money/thou)+ " 장 입니다.");
	System.out.println(money+ "를" + fiveHun + "로 나누면 필요한 장수는 " + (money/fiveHun)+ " 장 입니다.");
	System.out.println(money+ "를" + Hun + "로 나누면 필요한 장수는 " + (money/Hun)+ " 장 입니다.");
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
		restMoney %= 10; // 1원권....
		
		System.out.println("total : " + money);
		System.out.println("50000원권 : " + oman);
		System.out.println("5000원권 : " + ochun);
		System.out.println("1000원권 : " + chun);
		System.out.println("500원권 : " + obaek);
		System.out.println("100원권 : " + baek);
		System.out.println("10원권 : " + seep);
		System.out.println("1원권 : " + restMoney);
		
	}
}
