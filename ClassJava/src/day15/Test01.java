package day15;

import java.util.*;

/*
	TreeSet
		==> ���������� TreeSort��� �˰����� �̿��ؼ� �����͸� �����ϴ� ����� ���� �÷���
			(<== �츮�� ����ϴ� ���� ���)
			
		�������]
			TreeSet(Comparator comparator)
				==> ���Ĺ���� �����ؼ� TreeSet�� �����.
			
			TreeSet(SortedSet<E> s)
				==> TreeSet�� �̿��ؼ� �ٽ� TreeSet�� �����.
			
		�����Լ�]
			
			subSet()
				==> �ϳ��� Set�� ��� �����߿��� Ư�� �κи� ��� 
					���ο� Set�� ����� �Լ�
			
			headSet(E toElement)
				==> ó������ ������ �κб��� ��� ���ο� Set�� �����.
			
			tailSet(E fromElement)
				==> ������ �κк��� ���������� ��� ���ο� Set�� �����.
 */

public class Test01 {
	TreeSet tree;
	public Test01() {
//		setNum();
		setName();
		System.out.println(tree);
	}
	
	// �����ϰ� ���ڸ� �߻��ؼ� �־��ִ� �Լ�
	public void setNum() {
		tree = new TreeSet();
		while(tree.size() < 10) {
			// �����ϰ� 1 ~ 20 ������ ���ڸ� �߻��ϰ�
			int no = (int) (Math.random()* 20 + 1);
			// TreeSet�� ���� �ְ�
			tree.add(no);
		}
	}
	
	// �̸��� �Է��ϴµ� ����Ʈ�� �ε����� �����ϰ� �߻��ؼ� ������ �Է����ִ� �Լ�
	public void setName() {
		// tree�ʱ�ȭ ���ְ�
		tree = new TreeSet();
		
		ArrayList list = new ArrayList();
		list.add("ȫ�浿");
		list.add("Ȳ����");
		list.add("�����");
		list.add("�ֿ켺");
		list.add("����");
		list.add("��ȣ��");
		list.add("�ڼ۸�");
		list.add("�����");
		list.add("������");
		list.add("������");
		
		// tree �� �����͸� 10���� ä���.
		
		while(tree.size() < 10) {
			// ���� �����ϰ� �ε����� �߻���Ű��
			int idx = (int)(Math.random()*10);
			tree.add(list.get(idx));
		}
	}
	
	
	public static void main(String[] args) {
		new Test01();
	}
	
	
}
