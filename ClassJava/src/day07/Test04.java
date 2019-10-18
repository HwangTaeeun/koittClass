package day07;

/*
	���� 3�� ������ �迭�� �����
	�����ϰ� �������� ����
	�迭�� ������ �ʱ�ȭ �ϼ���.
 */
public class Test04 {

	public Test04() {
		// ����
		// 	1. ���� 3���� ������ �迭�� �����.
		Circle01[] won = new Circle01[3];
		// 	2. ���� �������� �����ϰ� ���� ���� ��ü�� �迭�� �ִ´�.
		for(int i = 0 ; i < won.length ; i++ ) {
			// �������Լ��� ȣ���� �� �������� �ʿ��ϹǷ� ���� �����ϰ� �������� �����.
			// �������� ������ 1 ~ 10 ���� ��������� ����.
			int radius = (int)(Math.random() * 10) + 1 ;
			
			// ���������� ���� ��ü�� �ϳ��� ���� �� �濡 �־�����.
			won[i] = new Circle01(radius);
		}
		// 	3. ���� ������, �ѷ�, ���̸� ����Ѵ�.
		
		int idx = 1;
		for(Circle01 c : won) {
			System.out.printf("%3d ] %12s - %3d | %3s - %5.2f | %3s - %6.2f\n", idx++ , "��° ���� ������", c.radius, "�ѷ�", c.arround, 
								"����", c.area
								);
			System.out.printf("%3d ] ��° ���� ������  - %3d | �ѷ� - %5.2f | ���� - %6.2f\n", 
								idx++ , c.radius, c.arround, c.area );
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
