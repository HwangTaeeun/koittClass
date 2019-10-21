package day08;

/*
	Factorial : 1 ���� ���� n ������ ��
				���� ��ȣ�� n! �� ǥ���Ѵ�.
	
	���� 1]
	1 ~ 20 ������ ���� ���ϼ���.
		�ذ��� ]
			1. �ݺ������� ó���ϴ� ���
			
			2. �Լ��� ���� ó���ϴ� ���
				==> ���ȣ���Լ�
 */
public class Ex01 {

	public Ex01() {
		useFor(20);	// �ݺ������� ó���ϴ� �Լ�
		
		// ���ȣ���Լ��� ó���ϴ� ���
		System.out.println("calc(20) : " + calc(20));
	}

	public static void main(String[] args) {
		new Ex01();
	}
	
	// �ݺ������� ó���ϴ� ���
	public void useFor(int no) {
		// ����
		// 		������ ���� ������ ������ �����
		long result = 1;
		
		// �ݺ��ؼ� �����ش�.
		for(int i = 1; i < no + 1 ; i++ ) {
			result *= i; // ==> result = result * i;
		}
		System.out.println("useFor(20) : " + result);
	}
	
	// ���ȣ���Լ��� ó���ϴ� ���
	/*
		���ȣ���Լ� : ���� ����Ǵ� �Լ��� �� �Լ��� �������� 
						�ڱ��ڽ�(���Լ�)�� ȣ���ϴ� �Լ�
						==> ������ ���������ϰ� ª������.	
	 */
	public long calc(int no) {
		// no�� 1�� �ԷµǴ� ���� ���ȣ���� ����� �Ѵ�.
		if(no == 1) return 1;
		return (long)no * calc(no - 1);
	}
}
