package day09;

/*
	���� 4]
		�ڵ����� ��ȭ��ȣ�� ������ ���α׷��� ���� �����̴�.
		
		ģ�� Ŭ������ �ۼ��ϰ� (�̸�, ��ȭ��ȣ)
		ģ���� �߰�(10��)�ؼ�(�̸��� ��ȭ��ȣ�� ���Ƿ� �Է��ϰ� ��ġ�� �ʵ����Ѵ�.) 
		
		�̸� �˻��ϸ� ������ �˷��ִ� ���α׷��� �ۼ��ϼ���.
		
		
 */

import java.util.*;

public class Ex04 {

	public Ex04() {
		// Ʋ�� ����� ������
		// ģ������ ������ �迭��(����� 10��) �����
		Person[] buddy = new Person[10];
		// �迭�� �����͸� �Է��ؼ� �� ģ������ ����ϰ�
		// ģ���̸��� ������ �迭�� �����
		String[] irum = {
							"�ڼ۸�", "����", "�����", "�����", "�����",
							"������", "��ȣ��", "������", "�ֿ켺", "Ȳ����"
						};
		// ģ����ȭ��ȣ�� ������ �迭�� �����
		String[] junbun = {
				"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", 
				"010-5555-5555", "010-6666-6666", "010-7777-7777", "010-8888-8888",
				"010-9999-9999", "010-1234-5678"
		};
		
		// ģ�� ������ �Է��ؼ� ��������.
		for(int i = 0 ; i < buddy.length ; i++ ) {
			buddy[i] = new Person(irum[i], junbun[i]);
		}
		
		
		// �̸��� �ԷµǸ� �̸��� ���� ����� ������ ����ϰ�
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			// �޼��� ����ϰ� �Է¹ް�
			System.out.print("�˻��� �̸��� �Է��ϼ���!(���� - exit) : ");
			String tmp = sc.nextLine();
			if(tmp.equals("exit")) {
				break;
			}
			
			boolean bool = true;
			for(int i = 0 ; i < buddy.length ; i++ ) {
				
				if((buddy[i].name).equals(tmp)) {
					bool = false;
					System.out.println(buddy[i]);
					break;
				}
			}
			
			if(bool) {
				System.out.println("��ϵ��� ���� ģ���Դϴ�.");
			}
		}
	}

	public static void main(String[] args) {
		new Ex04();
	}

}

class Person {
	String name;
	String tel;
	
	public Person() {}
	
	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String toString() {
		return  "### " + name + " - " + tel;
	}
	
}
