package day09;

public class Test03 {
/*
	Object Ŭ����
		: 	�ڹٷ� ������� Ŭ������ �ֻ��� super Ŭ����
			���� �ڹٷ� ������� ��� Ŭ������ Object �� ����� ������ �ְ�
			Object �� �����ϴ� ��� ���(��� : ����, �Լ� )��
			�ڵ������� ����� �� �ְ� �ȴ�.
			
		����]
			�ڹٷ� ���� ��� Ŭ������ �ݵ�� ���� Ŭ������ ������ �ִ�.
			�츮�� ����� ��� Ŭ�����鵵 ���� Ŭ������ �����ϰ�
			���� ������ ���� Ŭ������ �������� ������ ( ==> extends ���������� )
			���������� Object Ŭ������ ��� �޾Ƽ� ���������.
			
		***
		�ڹٷ� ���� ��� Ŭ������ Object Ŭ������ ����Ŭ�����̴�.
		
	-------------------------------------------------------------------------------
	
	***
	instanceof
		==> Ư�� Ŭ������ �ν��Ͻ��� ����� �ּҰ� ��������µ�
			�� �ּҰ� � Ŭ������ �Ҽ����� �˾Ƴ��� ������
			����� true �Ǵ� false �� ���´�.
			
			����]
				�ּ�	istanceof 	Ŭ�����̸�
				
			�ǹ�]
				�ּҰ� ����Ű�� �ִ� ���� ������
				������ Ŭ���� �Ҽ������� ����� ��
			
 */
	public Test03() {
		int no = 10;
		
		Object[] o = {1, "abcd", 'A', 3.14, true};
		
		Father1 f = new Father1();
		Grand1 g = new Grand1();
		System.out.println("1. : " + ("123" instanceof String));
		System.out.println("2. : " + (f instanceof Grand1));
		System.out.println("3. : " + (g instanceof Father1));
		
		
		for(int i = 0 ; i < o.length ; i++ ) {
			if(o[i] instanceof String) {
				// ���ڿ��� ��� ó���� ����
				System.out.println("���ڿ� : " + o[i]);
			} else if(o[i] instanceof Integer) {
				System.out.println("��  �� : " + o[i]);				
			} else if(o[i] instanceof Double) {
				System.out.println("��  �� : " + o[i]);				
			} else if(o[i] instanceof Character) {
				System.out.println("��  �� : " + o[i]);				
			} else if(o[i] instanceof Boolean) {
				System.out.println("��  �� : " + o[i]);				
			}
		}
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}


class Abc {
	
}

class Grand1 {
	
}
class Father1 extends Grand1 {
	
}