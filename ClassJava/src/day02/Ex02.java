package day02;

/*
	����2 ]
		1���� 365.2426�� �̴�
		�̰��� 
			����, ��ð�, ���, �� ������ 
			����ϼ���.
 */
public class Ex02 {
	
	// 1. ������ �Լ� �����
	public static void main(String[] args) {
		// 2. ��¥ �̿��� �����͸� ���� ���� ������ ��ȯ�ϰ�
		double tmp = 365.2426;
		int day = (int)(tmp / 1);
		tmp %= 1;
		int totalsec = (int)(tmp * 24 * 60 * 60); // ����� �� �Ŀ� �������͸� ���������� �ٲ۴�.
		int hour = totalsec / (60 * 60) ; // 
		totalsec %= 60*60;
		int min = totalsec / 60 ;
		totalsec %= 60;
		int sec = totalsec;
		
		System.out.println("365.2426���� " + day + "��, " + hour + "�ð�, " + min + "��, " + sec + "�� �Դϴ�.");
		// 3. ����ؼ�
		
		// 4. ����ϰ�
	}
}
