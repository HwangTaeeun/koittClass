package day11;


import java.util.*;

public class Test03 {
/*
	����ó��
	==> ���� ó���� ������ ���α׷��� �������� ���ῡ �ִ�.
	
		:	���α׷������δ� ������ ������
			(������ ���� ������ ������)
			�������� ������ ����� ���� � ���ؼ� 
			���α׷��� �����ϴ� ���� �߻��ϴ� ������
				���࿡��(Run Time Error)
			��� �θ���.
			�̰��� ���α׷��� ���� "����(Exception)"�̶�� ���Ѵ�.
			
			������
			�̷� ���ܴ� �����ڰ� �����ؼ�
			�̷� ������ �߻����� ��� ��ó�ϴ� ������� ���α׷��� ������ �ϰ�
			��ó�� ���ܰ� �߻����� ��� 
			��ó�ϴ� ����� ���α׷��� "����ó��"�� �� �θ���.
			
			
		�ڹٿ����� �̷� ������(���� �߻� ������ �����ڰ� �˰� �־�� �Ѵ�.)
		�� �ذ��ϱ� ���ؼ� ����ó�� ������ ����� ���Ҵ�.
		
			����]
				
				1)
					(1)
					try{
						(2)
						...
						(3)
					} catch(����Ŭ�����̸� �����̸�) {
						(4)
					}
						(5)
					�������]
						
						���ܰ� �߻����� ��� 		: (1) --> (2) --> (4) --> (5)
						���ܰ� �߻����� ���� ��� 	: (1) --> (2) --> (3) --> (5)
						
						
			������
				(3) �� �����ε�
				�� �κ��� ������ ���ܰ� �߻��ϸ� ������� �ʴ´�.
				==> ���� try{}�� ������ ���� 
					����� ���� �ְ�
					���� �ȵ� ���� �ִ�.
					
				
		�ڹ��� ����ó���� ����
			���ܰ� �߻��ϸ� JVM�� �߻��� ������ ������ �м��� �ؼ�
			���ܿ� ���� ������ �ڹٽ����� Ŭ������ ���� 
			catch�κп� �� Ŭ������ �ּҸ� �����Ѵ�.
			
		catch �� �ǹ�
			==> 	���ܰ� �߻��ϸ� �� ������ ������ �޾Ƽ�
					�����ڰ� �� ������ �̿��ؼ� ���ϴ� ó���� �� ��� �Ѵ�.
					
					
		catch�� �������� ��� �� �� �ִ�.
		
			try{
			} catch(???){
			} catch(???){
			} catch(???){
			}
			...
			
		������]
			���� catch�� ����ϴ� ���
			�ݵ�� ����� �� �ִ� ���·� ������ �Ѵ�.
			==> 
			
				
 */
	public Test03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���! : ");
		int no = 0;
		String str ="";
		while(true) {
			try{
				System.out.println("*** �ڵ� ���� ��");
				System.out.println("*********" + sc.hasNext());
				
				if(sc.hasNext()) {
					sc.nextLine();
				}
				no = sc.nextInt();
//				str = sc.nextLine();
//				no = Integer.parseInt(str);
				System.out.println("*** �ڵ� ���� ��");
				/* */
			} catch(NumberFormatException e) {
				System.out.println("1. ���������� �ƴմϴ�.");
				continue;
			} catch(InputMismatchException e) {
				System.out.println("2. ���������� �ƴմϴ�.");
				continue;
				 /* */
			} catch(Exception e) {
				System.out.println("���� �߻�");
				e.printStackTrace();
//				break;
				continue;
			}
			
			break;
		}
		System.out.println("�Էµ� ���� : " + no);
		
		System.out.println("########## END ############");
	}

	public static void main(String[] args) {
		new Test03();
	}

}
