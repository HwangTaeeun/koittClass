package day15;

import java.util.*;
/*
	Map
		==> �ϳ��� �����͸� �� �����͸� ������ Ű���� �ѽ��� ����
			�����͸� ����ϴ� �÷���
			���� �����͸� ���� ���� Ű���� �̿��ؼ� ������ �Ѵ�.
			
			Map �迭�� ���� ���� �����͸� �����ϴ� �뵵 ���ٴ�
			�����͸� �����ϴ� �뵵������ �� ���� ����Ѵ�.
			
		HashMap / HashTable
			
			HashTable �� ���� �����̰� HashMap �� �Ź����̴�.
			���� HashMap ����� ������ �ϰ� �ִ�.
			
			���������δ� Ű���� �ؽ����̺��� �̿��ؼ� �����ؼ� �����Ѵ�.
			
			�ֿ��Լ� ] 
				put(Object key, Object value)
					==> �����͸� �Է��ϴ� �Լ�
				get(Object key)
					==> �����͸� ������ �Լ�
					
			�����Լ�]
				values()
					==> �����͸� ������ Collection ���� ��ȯ���ִ� �Լ�
				keys()	: HashTable �Ҽ��Լ�
					==> Ű���� ������ Enumeration ���� ��ȯ���ִ� �Լ�
						
						����]
							Enumeration 
								==> Iterator �� ������
									�����͸� ���������� ������ ���
				keySet() : HashMap �Ҽ� �Լ�
					==> Ű���� ������ Set ���� ��ȯ���ִ� �Լ�
					
				entrySet()
					==> Map �� �ݵ�� Ű���� �˾ƾ� ���� �� �ִ�.
						���� �����͵鸸 ���� ���� ���� ������ �װ�� �������� "�ǹ�" �� �������.
					==> Ű���� �����͸� Set���� �����ִ� �Լ�
					
					������]
						Map�� �׻� Ű�� ���� �ΰ��� �־�� ������ �ȴ�.
						Set�� ���� �Ѱ��� �����Ѵ�.
						��� �ؼ����� Ű�� �����͸� �ϳ��� ����� Set�� ������ �ȴ�.
						
						�̰��� �ذ��ϱ� ���ؼ� Ŭ����(VO)�� �����Ѵ�.
						�� Ŭ������ �ٷ� 
							Map.Entry
						==> �� Ŭ���� �ȿ��� Ű�� �������� ������ ����ȭ �Ǿ� �ְ�
							�� ������ ����� �� �ִ� �Լ��� �����ϰ� �ִ�.
							�Ѹ���� �ΰ��� ������ �ϳ��� Ŭ������ ��Ƴ��� Ŭ����.
 */
public class Test04 {
	HashMap map;
	
	public Test04() {
		initMap();
		// ����ϰ�
		System.out.println(map);
		
		testItor();
		
		testKeySet();
		
	}
	
	// �� �ʱ�ȭ �Լ�
	public void initMap() {
		// ���� �����
		map = new HashMap();
		// Ű�� �����͸� �ְ�
		map.put("�Ѹ�", 70);
		map.put("����", 95);
		map.put("��浿", 45);
	}
	
	// Iterator ó���Լ�
	public void testItor() {
		// �����͸� ������ ArrayList �� ���
		Iterator itor = map.values().iterator();
		// �ϳ��� ������ ����ϰ�
		System.out.print("| ");
		while(itor.hasNext()) {
			Object o = itor.next();
			System.out.print((int) o + " | ");
		}
		System.out.println();
	}
	
	// keySet() �׽�Ʈ �Լ�
	public void testKeySet() {
		Set set = map.keySet();
		System.out.println(set);
		for(Object o : set) {
			
			String key = (String) o;
			System.out.println(key +" : " + map.get(key));
		}
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}
