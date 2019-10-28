package day13;

import java.util.*;

public class Test08 {
/*
	�÷���( Collection )
		==> ���� ���� �����͸� �ս��� ������ �� �ִ� Ŭ�������� ����
			
			�迭�� �̿��ؼ��� ���� ���� �����͸� ������ �� �־�����...
			���� ������ ���� �־���.
				1. ���鶧 �ԷµǴ� Ÿ���� ���ؾ� ���
				2. ���̵� ���ؼ� ����� ��� �ϰ�
				3. ���� ������ �ȵȴ�.
				
		�迭�� ������ �����ؼ� ����� ���� �͵�...
		
	����]
		
		1. List �迭
			Ư¡]
				1) �Է��� ������ ����(ó���ӵ��� ������.)
				2) �ߺ������͵� ����Ѵ�.
				
		2. Set �迭
			Ư¡]
				1) 	�Է��� ������ �������� �ʴ´�.
					(������ ��Ģ�� ������ �����͸� �����ؼ� �����Ѵ�.)
					(ó���ӵ��� ������.)
				2) �ߺ������Ͱ� �Է��̵Ǹ� ������ �����ʹ� ������ ��
					�����Ѵ�. ==> �ߺ������ʹ� �ѹ��� �����Ѵ�.
		3. Map �迭
			Ư¡]
				1) �����͸� ������ �� �� �����͸� ������ Ű���� ���� �̷Ｍ ������ �Ѵ�.
				2) �Է¼����� ������� �ʴ´�.
				3) ���� Ű������ �����Ͱ� �Է��� �Ǹ�
					������ �����ʹ� �����ϰ� ���߿� �Էµ� �����ͷ� ��ü�Ѵ�.
					(�����ʹ� ���Ƶ� ��� ������ Ű���� ������ ������ �ȴ�.)
		
		����]
			List�迭�� Set�迭�� ���� Ŭ������ ������
			Map�迭�� ���� �ٸ� ���� Ŭ������ ������ �ִ�.
			
			==> AbstractCollection col = new ArrayList();
				
				Set set = (Set) col;
				
			���� List�� Set�� ������ ó���� ����������(���� ��ȯ�� ����������)
			Map�� ������ ������ ������ ������ ó���� �ȵȴ�.
			
=============================================================================================
	
	List �迭
		
		1.	Vector
			==> ���������� �迭 ���¸� ���� �����͸� �����ϴ� �÷����� �� ����
				����
					�Է¼ӵ��� �˻� �ӵ��� ������.
				����
					�߰��� �����͸� �����ϰų�,
					�����͸� �����ϴ� �ӵ��� ������.
			���]
				�������� ��ȭ�� ���� ���α׷����� ���� ���
				
			�������]
				1) 
					Vector()
						==> �⺻ ����� 10���� �����̵Ǽ� ���������.
							�����Ͱ� �߰��� �Ǹ� 
								���������� * 2
							�� ����� �ڵ� ������ �ȴ�.
					Vector(Collection c)
						==> �ٸ� �÷��� �����͸� �Է��ϸ� �����͸� �����ؼ� ���͸� ����� �ش�.
					Vector(int initialCapacity)
						==> ���鶧 ���� ����� ���ؼ� ���͸� �����.
							*
							�� ����� �����Ѵ�.
					*
					Vector(int initialCapacity, int capacityIncrement)
						==> ���� �� ����� ���� ���ϰ� �߰��Ǵ� ����� ���� �����ؼ� �����.
						
						����]
							�÷����� �������� �翡 ������� �׻� �����͸� �Է¹��� �� �ִ�.
							�̶� �����͸� �Է� ���� ������ Ȯ���ؾ� �ϴµ�...
							���� Ȯ�� ��Ģ]
								��������� * 2
								�� ������� �þ��.
								
					�ֿ��Լ�]
						
						1. ������ �Է��Լ�
							add(Object e)
							add(int index, Object element)
							addAll(Collection c)
							addAll(int index, Collection c)
							addElement(Object obj)
							insertElementAt(Object obj, int index)
							
						2. ������ ����Լ�
							get(int index)
							elementAt(int index)
							firstElement()
							lastElement()
							elements()
							
						3. ������ �����Լ�
							set(int index, Object element)
							setElementAt(Object obj, int index)
				
 */
	// ģ������ �̸��� ����� ���͸� ���� �����Ѵ�.
	public Test08() {
		// ���͸� �����.
//		Vector vec = new Vector();
		Vector vec = new Vector(5, 5);
		
		Vector vec2 = new Vector(5, 5);
		vec2.add("����");
		vec2.add("������");
		vec2.add("�ǰ��");
		
		// ������ �Է��ϰ�
		vec.add("�����");
		vec.add("�����");
		vec.add("�ڼ۸�");
		vec.add("������");
		vec.add("�ֿ켺");
		vec.add("�����");
		vec.add("�����");
		vec.add("�ڼ۸�");
		vec.add("������");
		vec.add("�ֿ켺");
		vec.add("�����");
		vec.add("�����");
		vec.add("�ڼ۸�");
		vec.add("������");
		vec.add("�ֿ켺");
		vec.add("�����");
		vec.add("�����");
		vec.add("�ڼ۸�");
		vec.add("������");
		vec.add("�ֿ켺");
//		vec.add("�����");
		
		vec.add(13, "�����");
		
//		vec.addAll(vec2); // ==> ������ �� �ڿ� ������ ������ �߰��ϱ�
//		vec.addAll(7, vec2);	// ==> �߰��� ��ġ�� ���ؼ� �߰��ϴ� ���
//		vec.addElement(vec2);	// ==> ������ �ǵڿ� Object �� ������ �߰��ϴ� ���
		vec.insertElementAt(vec2, 7);	// ��ġ�� �����ؼ� ��ü �߰��ϴ� ���
		
		
		// ���� �����ϱ�
		vec.set(5, "��ȣ��");
		
		// �ϳ��� ������ ����ϰ�
		int k = 0 ; 
		for(Object o : vec) {
			if(o instanceof Vector) {
				System.out.println(k++ + " - " + ((Vector)o).toString());
			} else {
				System.out.println(k++ + " - " + (String) o);
			}
		}
		
		System.out.println("capacity() : " + vec.capacity());
		System.out.println("size() : " + vec.size());
		
		// Enumeration �� ����ؼ� ������ ���
		Enumeration en = vec.elements();
		System.out.println();
		System.out.println("###########################################");
		System.out.println();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement()); 
			// nextElement() �� ��ȯ���� Object �̹Ƿ� ����� �� ��������ȯ�ؼ� ����ؾ� �Ѵ�.
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
