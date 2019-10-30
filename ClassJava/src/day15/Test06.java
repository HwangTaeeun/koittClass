package day15;

import java.util.*;

/*
		TreeMap
			==> TreeSet�� ����������
				���ο��� �����ϸ鼭 �����͸� ����ϴ� Map�̴�.
				*
				�̶� ������ �ϰ� �Ǵ� ������ Ű���� ������ ������ �Ѵ�.
				
				���� 
					Ű���� ������ ���� �ʴ� Ŭ������ ����� �� ����
					�ʿ��ϴٸ� ���� ����� ���ؼ� ����ؾ� �Ѵ�.
					
		����]
			�÷��� �ȿ��� �ٽ� �÷����� �Է��� �� �ִ�.
			��??
				�÷��ǿ� �Է��� �� �ִ� �����ʹ� Object Ÿ���̰�
				�츮�� ����ϴ� �÷��ǵ� Object Ŭ������ ���� Ŭ���� �̱� ������...
 */

public class Test06 {
	// �� �����ϰ�
	TreeMap map;
	
	public Test06() {
		// �� �����ϰ�
//		setMap();
		lowSort();
		
		// �� ����ϰ�
		System.out.println(map);
	}
	
	// map �ʱ�ȭ �Լ�
	public void setMap() {
		// map �ʱ�ȭ �ϰ�
		map = new TreeMap();
		
		// ������ �Է��ϰ�
		map.put("��ũ����", 1000);
		map.put("������", 1500);
		map.put("�������", 800);
		map.put("���Ѹ�", 2500);
		map.put("�ϰմ���", 3000);	
	}
	
	// �������� ���� �Լ�
	public void lowSort() {
		// map �ʱ�ȭ �ϰ�
		// TreeMap�� ���Ĺ���� ���� �� Comparator.compare(Object o1, Object o2)�� 
		// �������̵� �ؾ��ϴµ�
		// �̶� o1, o2 �� Ű���� �̾߱��ϸ�
		// ������ �Լ����� Ű���� �̾Ƽ� ������ �ϰ� �ǹǷ�
		// o1, o2�� Ű������ ��ȯ�����Ŀ� ���Ĺ���� �����ָ� �ȴ�.
		
		map = new TreeMap(new Comparator() {
			
			@Override
			public int compare(Object o1, Object o2) {
				int result= 0;
				
				String k1 = (String) o1;
				String k2 = (String) o2;
				int tmp = 0;
				if(k1.length() < k2.length()) {
					tmp = k1.length();
				} else {
					tmp = k2.length();
				}
				// ���� �ϳ��� ������ ���Ѵ�.
				for(int i = 0 ; i < tmp ; i++ ) {
					
					if(k1.charAt(i) < k2.charAt(i)) {
						result = 1;
						break;
					} else if(k1.charAt(i) > k2.charAt(i)){
						result = -1;
						break;
					} else {
						continue;
					}
				}
				
				return result;
			}
		});
		
		// ������ �Է��ϰ�
		map.put("��ũ����", 1000);
		map.put("������", 1500);
		map.put("�������", 800);
		map.put("���Ѹ�", 2500);
		map.put("�ϰմ���", 3000);
	}
	public static void main(String[] args) {
		new Test06();
	}

}
