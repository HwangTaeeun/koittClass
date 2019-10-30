package day15;

import java.util.*;

public class Test05 {
	Hashtable table ;
	public Test05() {
		initTable();
		
		System.out.println(table);
		System.out.println(table.size());
		System.out.println("table.get(\"�̸�\") : " + table.get("�̸�"));
		
		System.out.println();
		
		testKeys();
		System.out.println("############################################################");
		testKeySet();
	}
	
	// �ؽ����̺� �ʱ�ȭ �Լ�
	public void initTable() {
		// �ؽ����̺� �����
		table = new Hashtable();
		
		// ������ �Է��ϰ�
		table.put("�̸�", "��浿");
		table.put("����", 34);
		table.put("����", "�Ѹ��ӽ�");
		table.put("�ڳ�", 2);
	}
	
	// key �� �̾Ƴ��� �Լ�
	public void testKeys() {
		// Ű�� �̾Ƴ���
		Enumeration en = table.keys();
		// �ϳ��� ������ ����ϰ�
		while(en.hasMoreElements()) {
			// �ϳ��� ������
			Object o = en.nextElement();
			// ����ȯ ���ְ�
			String key = (String) o;
			// ����ϰ�
			//System.out.println("key : " + key);
			// Ű�� ������ ��� ����ϱ�
			System.out.println(key + " | " + table.get(o));
		}
	}

	// keySet() �׽�Ʈ �Լ�
	public void testKeySet() {
		// Ű�� ������ ���ÿ� �̾Ƽ� �����Ѵ�.
		Set set = table.entrySet();
		
		// set �� ��� �����͸� �ϳ��� �̾Ƴ���.
		Iterator itor = set.iterator();
		
		// itor �� ��� ������ �ϳ��� ���������� ������.
		while(itor.hasNext()) {
			Object o = itor.next();
			Map.Entry entry = (Map.Entry) o;
			
			// Map.Entry���� Ű�� ������ �������·� ������ �Ǿ��ְ� 
			// ������ ����ȭ ���� �س��Ҵ�.
			// ���� ������ ����� �Լ��� ȣ���ϴ� ������� ������ �Ѵ�.
			String key = (String) entry.getKey();
			String val = "";
			Object tmp = entry.getValue();
			
			if(tmp instanceof Integer) {
				val += (int) tmp;
			} else if(tmp instanceof String) {
				val += (String) tmp;
			}
			
			// ����ϱ� - Ű�� : ����
			System.out.println(key + " : " + val);
		}
	}
	
	public static void main(String[] args) {
		new Test05();
	}

}
