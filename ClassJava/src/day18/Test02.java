package day18;

/*
	�� Ŭ������ 
	emp ���̺��� ������ ��ȸ�� �����ؼ� ó����û�� �޴� Ŭ����...
		
		����
			1. ��ü ����� ��ȸ
			2. ����̸����� ������� ��ȸ
			3. �μ���ȣ�� �Է¹޾� �μ����� ������ ��ȸ
			
			���ʽ�
			4. �޿��� 1500 �̻��� ����� ������ ��ȸ
 */

import java.util.*;
import VO.*;

public class Test02 {
/*
	DB ó���� DAO Ŭ�������� �����ϱ�� �����Ƿ�
	DAOŬ������ ��ü�� ���� ����ؾ߰ڴ�.
	
 */
	public Test02() {
		EmpDAO dao = new EmpDAO();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�ѻ���� ��ȸ : 1\n���������ȸ : 2"+
								"\n�޿��� 1500 �̻��� ���������ȸ : 3" +
								"\n�� �μ��� ������� ��ȸ : 4" +
								"\n���� : 9"
					);
			int no = sc.nextInt();
			if(no == 9) {
				break;
			}
			
			switch(no) {
			case 1:
				int cnt = dao.getTotalCnt();
				System.out.println("�� ����� : " + cnt);
				break;
			case 2: // ��� �̸� �Է��ϸ� ���� ��ȸ
//				sc.close();
//				sc = new Scanner(System.in);
				System.out.println("��� �̸� : ");
				String sname = sc.next();
				System.out.println("$$$$$$$$$$$ " + sname);
				EmpVO vo1 = dao.getEname(sname);
				System.out.println("===============================================");
				System.out.println(vo1);
				break;
			case 3:
				ArrayList<EmpVO> list = dao.get1500Upper();
				for(EmpVO vo : list) {
					System.out.println(vo);
				}
				break;
			case 4:
				// �μ���ȣ �Է¹ް�
				System.out.println("�μ���ȣ�� �Է��ϼ���!");
				int dno = sc.nextInt();
				System.out.println("********** �μ���ȣ : " + dno);
				if(dno >= 40) break;
				
				ArrayList<EmpVO> list1 = dao.getDno(dno);
				System.out.println("===============================================");
				for(EmpVO vo2 : list1) {
					System.out.println(vo2);
				}
				break;
			}
		}
		
		int cnt = dao.getTotalCnt();
		
		System.out.println("�� ��� ��  : " + cnt);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
