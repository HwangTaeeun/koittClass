package day08;

public class Test03 {
/*
	��� ������ �ʱ�ȭ
		==> ��� ������ �ڵ� �ʱ�ȭ�� �ȴ�.
			(�� �⺻ ������ Ÿ�Կ� ���ؼ� �⺻���� ������ �ȴ�.)
			
	�ʱ�ȭ ���]
		1. ����� �ʱ�ȭ
			������ �����ϸ鼭 ���� �ʱ�ȭ�ϴ� ���
			: ���� ���� ����Ǵ� ���
		
		2. �ʱ�ȭ ���� �̿��� �ʱ�ȭ
			==> �ν��Ͻ� ������ ���ؼ��� ������ ������
				�ι�° ����Ǵ� ���
				
		
		3. static ���� �̿��� �ʱ�ȭ
			==> 2���� ����ϳ� ��� static ������ ���ؼ��� ������ ���
				�ι�° ����Ǵ� ���
				����]
					public static Ÿ�� ����;
					
					static {
						���� = ������;
					}
		
		4. �������Լ��� �̿��� �ʱ�ȭ
			==> ���� �������� ����Ǵ� ���
				: ������ �Լ� �ȿ��� �ʱ�ȭ ���ش�.
		
		
 */
	int tmp = 10; // ����� �ʱ�ȭ - ��� ������ ����� ���ÿ� �ʱ�ȭ�ϴ� ���
	
	
	int no;
	{
		no = 100;
	}
	
	public static int num;
	
	static {
		num = 999;
	}
	
	String str;
	public Test03() {
//		this("ȫ�浿");
		this.str = "ȫ�浿";
		System.out.println("no : " + no + " | str : " + str );
		System.out.println("num : " + num);
	}
	
	public Test03(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		new Test03();
	}

}
