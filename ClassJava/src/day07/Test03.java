package day07;

public class Test03 {

	public Test03() {
		Circle[] won = new Circle[5];
		
		for(int i = 0 ; i < won.length ; i++ ) {
			won[i] = new Circle();	// �ν��Ͻ� ����
			won[i].radius = i+1; 	// �������Է�
			won[i].arround = won[i].getArround(won[i].radius);
			won[i].area = won[i].getArea(won[i].radius);
		}
		
		for(int i = 0 ; i < won.length ; i++ ) {
			System.out.print((i + 1) + " ��° ���� ������ : " + won[i].radius);
			System.out.print(" | " + won[i].arround);
			System.out.print(" | " + won[i].area);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
