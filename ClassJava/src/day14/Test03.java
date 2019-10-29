package day14;
/*
	Set �迭
		�Է��� ������� �����ϰ� ���� ������ ����.
		(������ ��Ģ�� ���� ���������� ������ �ؼ� �����ϱ� ������...)
		
		�ߺ��Ǵ� �����ʹ� �ѹ��� ������ �Ѵ�.
		(���� �����Ͱ� �Է��� �Ǹ� �������� �Է��� �����͸� �����ϰ� ���ο� �����ͷ� ��ü�Ѵ�.)
		
		1. HashSet
			==> HashCode �� �̿��ؼ� �����ؼ� �����ϴ� ���
				�츮�� �˰��ִ� ������ �̷������ �ʴ´�.
				
				���� ���� ]
					HashSet(int initialCapacity, float loadFactor)
						loadFactor : 	�ؽ��ڵ尪�� ����� ��Ģ�� ����� ��� ���� 
										����ڰ� �����ϸ鼭 �ؽ����̺��� ���� ����Ѵ�.
										
			
			**
			����]
				Set �迭���� �����͸� �������� �Լ��� ���� �������� �ʴ´�.
				==> ��??
					�����ڰ� �����Ͱ� ����� �ּҸ� �� �� ���� ������...
					���� Ư�� ��ġ�� �����͸� ���� �� �ִ� ����� ����.
					
					���� Iterator�� ��ȯ�ؼ� ������� ������ ����ؾ� �Ѵ�.
 */

import java.util.*;

public class Test03 {

	public Test03() {
		HashSet set = new HashSet();
		
		for(int i = 0 ; i < 10 ; i++ ) {
			set.add(i+1);
		}
		
		System.out.println(set);
		
		// 1. Iterator �� ������ ���
		Iterator itor = set.iterator();
		System.out.print("| ");
		while(itor.hasNext()) {
			System.out.print((int) itor.next() + " | ");
		}
		System.out.println();
		
		
		// 2. ArrayList�� ��ȯ�ؼ� ������ ���
		ArrayList list = new ArrayList(set);
		System.out.print("* ");
		for(int i = 0 ; i < list.size() ; i++ ) {
			System.out.print(list.get(i) + " * ");
		}
		
		/*
			<== ����ȯ�� ���������� ����� �� �� ����. ��?? �ν��Ͻ��� ����� ���� ������...
		ArrayList list2 = (ArrayList) ((Collection)set);
		
		System.out.println(list2.get(3));
		*/
	}

	public static void main(String[] args) {
		new Test03();
	}

}
