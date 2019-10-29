package day14;

/*
	
	TreeSet
		==> ���������� Tree Sort��� �˰����� �̿��ؼ� �����͸� �����ϴ� ����� ������ �ִ�.
			
		Ư¡]
			�츮�� ����ϴ� ���Ĺ���� �ƴϴ�.
			
		�������]
			TreeSet(Comparator comparator)
			==> ���� ����� �����ؼ� TreeSet�� �����.
			
			TreeSet(SortedSet<E> s)
			==> TreeSet�� �̿��ؼ� �ٽ� TreeSet�� �����.
			
		�����Լ�]
			subSet()
				==> �ϳ��� Set�� ��� ���� �� Ư���κи� ��� ���ο� Set�� ����� �Լ�
				
			headSet(E toElement)
				==> ó������ ������ �κб��� ��� ���ο� Set�� �����.
			
			tailSet(E fromElement)
				==> ������ �κк��� ���������� ��� ���ο� Set�� �����.
			
 */

import java.util.*;
public class Test04 {
	// HashSet�� �����ϰ� �߻��� 1 ~ 10 ������ ���� 5���� ��������.
	public Test04() {
		HashSet set = new HashSet();
		// HashSet�� Ư¡�� 1. ������ ��Ģ���� �����͸� �����ؼ� ���� 2. �ߺ������ʹ� ������� �ʴ´�.
		
		Random rnd = new Random();
		
		while(true) {
			// �ߺ��� �����Ͱ� �߻��ϸ� �ٽ� �߻����Ѿ��ϹǷ�
			// ��� �ݺ��ؾߵ��� �� �� ����.
			int num = rnd.nextInt(10) + 1;
			
			set.add(num);
			
			if(set.size() == 5) {
				break;
			}
		}
		
		System.out.println(set);
		
		System.out.println();
		// ���� 1] set�� �����͸� ���������� ������ ����ϼ���. (Iterator �� ��ȯ�ϴ� ���)
		
		// Iterator �� ��ȯ���ְ�
		Iterator itor = set.iterator();
		
		// �ݺ��ؼ� ���������� ������ ������
		System.out.print("# ");
		while(itor.hasNext()) {
			// ObjectŸ������ ����Ǿ����� ������ ���� �����ϰ�
			Object o = itor.next();
			// ���� Ÿ������ ���� ����ȯ ���ְ�
			int no = (int) o;
			// ������ְ�
			System.out.print(no + " # ");
		}
		
		System.out.println();
		// ���� 2] ArrayList �� ���� ó���ϴ� ���
		// ArrayList �� ��ȯ�ϰ�
		ArrayList list = new ArrayList(set);
		// �ݺ��ؼ� �ϳ��� ������
		System.out.print("$ ");
		for(int i = 0 ; i < list.size(); i++ ) {
			// list�� Object Ÿ������ ������ �Ǿ����� ������ ������ �����ϰ�
			Object o = list.get(i);
			// ����Ÿ������ ���� ����ȯ�ϰ�
			int no = (int) o;
			// ����ϰ�
			System.out.print(no + " $ ");
		}
		
		System.out.println();
		
		// ���� list�� �������� �����ϰ� �ʹ�.
		list.sort(new MySort01());
		
		System.out.println("MySort01 : " + list);
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}

class MySort01 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
//		int result = (int) o2 - (int) o1 ; //  == -(o1 - o2)
		// result �� + �� ���� ���������̰� - �� ���� �������� �����̴�.
		int result = 0 ; 
		if((int) o1 > (int) o2) {
			result = -1 ;
		} else {
			result = 1;
		}
		
		return result;
	}
	
}
