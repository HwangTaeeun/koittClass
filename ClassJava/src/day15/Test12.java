package day15;

import java.util.*;


public class Test12 {
	HashMap<String, Integer> map;
	public Test12() {
		map = new HashMap<String, Integer>();
		
		map.put("�Ѹ�", 100000000);
		map.put("����", 4);
		map.put("��浿", 34);
		map.put("��ġ", 3);
		map.put("�����", 5);
		
		
		// ������ ������ ����ϱ�
		getItor();
		
		System.out.println("#######################################");
		System.out.println();
		

		// ���� for ������� ó���ϱ�
		getForeach();
		
		for(String s : map.keySet()) {
			
		}
	}
	
	public void getForeach() {
		Set<String> set = map.keySet();
		
		for(String key : set) {
			System.out.println(key + " - " + map.get(key));
		}
	}
	
	public void getItor() {
		// 	1. Ű�� �̾Ƴ���
		Set<String> set = map.keySet();
		
		// ���������� �ϳ��� �������� �ε����� ����...
		// �׷��� Iterator �� ��ȯ���ְ�
		Iterator<String> itor = set.iterator();
		// ���������� ������ ����ϰ�
		while(itor.hasNext()) {
			String key = itor.next();
			System.out.println(key + " : " + map.get(key));
		}
		
	}
	public static void main(String[] args) {
		new Test12();
	}

}
