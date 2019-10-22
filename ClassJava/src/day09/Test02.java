package day09;

public class Test02 {
/*
	super
		: 	this�� �������� �ڽ��� �ּҸ� ����ϴ� ����� �����̵���
			super ���� ����� ���� �� �ϳ�
			�ڽ��� ���� Ŭ������ �ּҰ� ���� ����
			
			������]
				�ݵ�� �Ҽ��� ������ �ϴ� ��쿡 ����Ѵ�.
				
			
 */
	public Test02() {
		Father f = new Father();
		f.call();
		
		Son s = new Son();
		s.call();
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}

class Grand {
	public void abc() {
		System.out.println("����� Grand");
	}
}

class Father extends Grand {
	public void abc() {
		System.out.println("����� Father");
	}
	
	public void call() {
		super.abc();
	}
}

class Son extends Father {
	public void call() {
/*
		super.super.abc();
		
		==> super �� ���� ����Ǵ� ��ü�� �������� �ּҸ� ����ϴ� �����̹Ƿ�
			Father Ŭ������ ���� ����Ǵ� Ŭ������ �ƴϹǷ� .super �� ����� �� ����.
 */
		super.call();
	}
}
