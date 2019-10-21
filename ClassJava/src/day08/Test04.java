package day08;

public class Test04 {
/*
	��� ]
		:	�̹� ������� Ŭ������ ����� 
			�״�� �����޾Ƽ�(������ �Լ��� ����� �״�� ���� �޾Ƽ�)
			���ο� Ŭ������ ����� ���
			
			�� ������ ��Ÿ���Ե� ����?
			<== ����Ʈ������ ���� �ӵ��� ������ �ϱ� ���ؼ�....
			
			��, ����� ��ü���� ����� �ٽ��̰� �ſ� �߿��� ������ �Ѵ�.
			
			��ü ������� ��ǰ ������(Ŭ����������) ���α׷��� ������
			�� ��ǰ�� �����ؼ� ���ϴ� ����� ���� ��....
			
		��� ��ǰ�� ���ߴµ�
		�� ����� ������Ǹ����� �� ���� ���� �� �ִ�.
		�׷� ó������ �ٽ� ������ �ұ��??
		==> �ذ��� : ���
		
		
		����� �ڽ��� ������� �ϴ� ��ǰ�� ���� ������ ��ǰ�� ������ �ͼ�
		���� �� ����� ������ ��
			1. ���� ����� �� ���̰�
			2. �ִ� ����� �ٲ� ������ �ٲٰ�...
		
		
		
		����� �ϴ� ����]
			
			[����������] [�Ӽ�] class ����Ŭ�����̸� 	extends ����Ŭ�����̸� {
				����Ŭ������ ���� ��� ����� �� �ȿ� ��� ����Ǿ� �ִ�.
				�Ͻ��ϱ�???
			 }
			 
		����]
			�ڹٿ����� ���� ���� ��Ӹ� �����ϴ�.
			��, ����� ���� Ŭ������ �Ѱ��� �����ϴ�.(����Ŭ������ �ϳ��� ����� �� �ִ�.)
			
			��]
				public class Abc extends Xyz, Ddd {
				}  ==> �̷��Դ� ���� �ȵȴ�.
				
				
		�������]
			
			����� ���� Ŭ���� - super class, ����Ŭ����, �θ�Ŭ����
			
			����� ���� Ŭ���� - sub class, ����Ŭ����, �ڽ�Ŭ����
			
			
			is a		- ��� ���迡 �ִ� Ŭ������ �θ��� ��� 
				
				class Father {}
				
				class Son extends Father {}
				
				==> Son is a Father
			
			has a		- � Ŭ���� �ȿ� �ٸ� Ŭ������ ����� ������ �ִ� ����
				
				class Father{}
				
				class Son{
					Father f = new Father();
				}
				
				==> Son has a Father �� �����ȴ�.

	===============================================================================
	
	***
	�Լ��� �������̵�( Overriding : �Լ��� ������ )
		==> ��Ӱ��迡 �ִ� ���� Ŭ��������
			���� Ŭ������ ���� �Լ��� ����� �����ϴ� ����
			
		��Ģ]
			0. ������������ ����� �޾ƾ� �Ѵ�.
			1. ���� Ŭ������ ���� �Լ��� ������ �����ؾ� �Ѵ�.
				�Լ��� ���� : ��ȯ�� + �Լ��̸� + �Ű���������Ʈ
			2. ���������ڴ� ���ų� ���� ��������...
			3. ����ó���� ���ų� ���� ��������...
 */
	public Test04() {
		Grand g = new Father();
//		System.out.println(g.money); // Grand �� ����� ���� ����� ��� �Ұ�
		
//	***	String str = (String) new Object();
		
//		Father f1 = new Grand();	// Grand�� �ν��Ͻ����� Father�� ����� �����ϴ�.
//	***	Father f = (Father) new Grand();
		// ������ ����� ��� ���� ����ȯ ���ָ� �ȴ�.
		// �� ��� ���迡 �ִ� ��쿡 ���ؼ� ������ �̾߱��̴�.
		
		
		Grand g2 = new Son();
		System.out.println("g2 tlnee : " + g2.tlnee);
		System.out.println("g2 tlnee : " + ((Son)g2).money);
		System.out.println("g2 age : " + g2.age);
//		System.out.print("g2 abc overloading : " + g2.abc("")); // ==> Grand�� �����ε��� �Լ��� ����� ���� �����Ƿ� ȣ�� �Ұ�... 
		System.out.print("g2 abc : "); 
		g2.abc();
		
	}
	
	public static void main(String[] args) {
		new Test04();
	}
}

class Grand {
	int age = 80;
	boolean tlnee = true;
	public void abc() {
		System.out.println("����� Grand");
	}
}

class Father extends Grand {
	int age = 50;
	int money = 1000;
	public void abc() {
		System.out.println("����� Father");
	}
}

class Son extends Father {
	int age = 20;
	
	String talmo = "�ȵ�";
	public String abc(String s) { // ==> �̰��� ���ڿ� Ÿ���� �Է��ؼ� ȣ���ϴ� ����� �߰��� �����ε��̴�.
	
			return "Overloading";
	}
	public void abc() {
		System.out.println("����� Son");
	}
}


