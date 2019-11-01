package day15;

import java.util.*;

/*
	Generic
		==> �÷����� ��� ������ �����͸� �� �Է� ���� �� �ִ�.
			(<== Object Ÿ������ �����ϴϱ�...)
			������ �ǹ������� �Ѱ��� ���·� �Է¹޴� ���� ��Ģ���� �Ѵ�.
			�׷��� �������� �׻� ����ȯ�� �ؼ� ������ �Ѵ�.
			��, �Ѱ��� ���·� �����ؼ� �����͸� �Է��� ���Ҵµ�
			�������� �ڵ� ����ȯ�� ���� �ʱ� ������
			�׻� ��������ȯ�� ����� �Ѵ�.
			
		���ʸ�����???
			==> �÷��ǿ� �ԷµǴ� �������� ���¸� �̸� �˷��ְ�
				���߿� ������ ����� �� ���ϰ� ���� �� �ֵ��� ���ִ� ��.
				
			����]
				ArrayList<String> list = new ArrayList<String>();
				
			����]
				�ݵ�� �÷��Ǹ��� ��� ���ʸ��� ������ ����� �Ѵ�.
				
			����]
				���ʸ����� ���ĵ��� �ʴ´�.
				�ϳ��� �÷��ǿ� ���ʸ��� ������ �Ǿ�����
				�� �÷����� �̿��ϴ� �ٸ� �÷����� ���ʸ����� ���ֹ����� �ȴ�.
				
				���]
					���ο� �÷��ǵ� �ٽ� ���ʸ��� ������ ����� �Ѵ�.
					
			
			����]
				Ư���� ���ʸ���
					==> ���ʸ����� �� ������ Ư�� Ÿ�Ը� �Է¹��� �������� ����Ѵ�.
					
					����]
						
						<? super Ŭ�����̸�>
							==> Ŭ�����̸� ���� ����Ŭ�������� ���
						
						<? extends Ŭ�����̸�>
							==> Ŭ�����̸� ���� ����Ŭ������ ���
							
						�� ����� ���ʸ� ������ ���� �ʴ� �Ͱ� ����� ȿ���� �ִ�.
						�ֳ��ϸ� ����ȯ �ؾ� �ϴϱ�.....
						
	==================================================================================================
	
		Annotation ( ������̼� )
			==> ���������� ��ӵ��� ������ �ڵ����� ó���ϵ��� �ϴ� ������ �����̴�.
				
				�ַ�
					ȭ�鿡 ���� ���̴� ������ �ƴϰ�
					����(�׽�Ʈ)�� �ϴ���
					�������� ����(�� Ŭ������ �̷��̷� ������� �����ϼ���...)
					�� �ǹ̸� ���� ������ ���Ѵ�.
					
				����]
					
					@����
				
 */

public class Test11 {

	public Test11() {
		HashSet<String> set = new HashSet<String>();
		
		set.add("�Ѹ�");
		set.add("����");
		set.add("��ġ");
		set.add("�����");
		set.add("������");
		set.add("���浿");
//		set.add(123); 
		// ==> �� �÷��ǿ� �ԷµǴ� �����͸� ���ڿ��� ������ �س��� ������ 
		//		���ڿ� �̿��� �����ʹ� �Է��� �� ����.
		
		// ������ ���
		// Iterator �� ��ȯ�ϰ�
		Iterator<String> itor = set.iterator(); // ���ʸ��� ���ĵ��� �ʴ´�. ���� �ٽ� ����...
		// �ϳ��� ������ ����Ѵ�.
		while(itor.hasNext()) {
			String str = itor.next();
			System.out.println(str);
		}
		
//		ArrayList<Object> list = new ArrayList<Object>(); //==> ���ʸ� ������ �ǹ̰� ����.
	}

	public static void main(String[] args) {
		new Test11();
	}

}