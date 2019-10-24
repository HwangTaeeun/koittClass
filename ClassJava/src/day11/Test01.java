package day11;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Test01 {
	
/*
	����Ŭ����(Inner Class)
		==> Ŭ���� ���ο� �ٽ� Ŭ������ ���� �� �ִ�.
		
		
		����]
			
			1. Top Level Inner Class
				==>  ��� ������ ���� Ŭ���������� 
					���������� Ȱ���ϴ� Ŭ����
					
				����]
					
					static class Ŭ�����̸� {
					}
					
				��, ����Ŭ������ static �Ӽ��� ������ Top Level Inner Ŭ���� �ȴ�.
				
				����
					
					Ŭ�����̸�
						�Ϲ�Ŭ�����ʹ� �޸� ���� Ŭ���� �̸���
						
							�ٱ�Ŭ�����̸�.����Ŭ�����̸� 
						�� �������� �����ؾ� �ȴ�.
			
			***
			2. ���� Inner Class
				==> �Ϲ� Ŭ������ ����Ŭ������ ���� ��
					(�Ϲ������� �� Ŭ������ ����Ŭ������ �ҷ�����. 90% )
					
				����]
						class Ŭ�����̸� {}
						
				Ư¡]
					1. �ٱ� Ŭ������ ��� �����
						������ �ڱ�� ó�� ����� �� �ִ�.
						
					2. �ݵ�� �ٱ� Ŭ������ new �� ���Ŀ� ���� Ŭ������ ������ �� �ִ�.
						����]
							�ٱ�Ŭ�����ּ�.new ����Ŭ�����̸�();
							
					3. �ٱ� Ŭ������ ���� Ŭ������ ����� ����� �� ����
						����ϱ� ���ؼ��� �ݵ�� new ���Ѽ� ����ؾ� �Ѵ�.
						(��ü�� �����Ŀ� ����� �� �ִ�.)
				
				�ַ� �ٱ� Ŭ������ ������ ����� ���� Ŭ������ ����� ���� �� ���� ����ϴ� ���
				
						
			3. ���� Inner Class
				==> ���� Ŭ������ ����� ��ġ�� �ٱ� Ŭ������ �Լ� �ȿ��� ��������� ��.
					
					class Test{
						
						int a ;
						
						class Inner {} ==> ���� Inner Class 
						
						void abc(){
							int b;
							
							class Inner2 { } ==> ���� Inner Class
						}
					}
					
				Ư¡]
					
					1. 	���� Inner Class�� �����ϰ� �ٱ� Ŭ������ ����� ����� �� �ִ�.
					2.	�� Ŭ������ �ٸ� �������� new ��ų �� ����.
						���� �ش� �Լ� �������� new ��ų �� �ִ�.
						
		4. ���� Inner Class(�͸���Ŭ����)
			==> �� �״�� �̸��� ���� Ŭ������ �̾߱��Ѵ�.
			
				�츮�� ���α׷��� ����� ����
				Ŭ������ ��� ������ ���ؼ� �������̵带 �ؾ� �ϴ� ��찡 �߻��Ѵ�.
				(��¿ �� ���� �������̵� �ؾ� �ϴ� ��쵵 �ְ�,
				�������̽��� �߻�Ŭ������ ����ؾ� �� ���..)
				
				�� �� ��Ģ���� ��Ģ�� ���ؼ�
				�ٸ� Ŭ������ �����
				�� Ŭ������ �ʿ��� Ŭ������ ����� �� ��
				�������̵带 �ؾ� �Ѵ�.
				
				�̶�
				�ʿ��� ��� �ϳ������� ����� �޾� Ŭ������ �����
				�������̵带 �ؾ� �Ѵٸ�
				���ŷο��� �߻��Ѵ�.
				
				==>
				�̷� ���
				����� �޾� Ŭ������ ����� �������̵��ؼ� ������� �ʰ�
				�ذ��� �� �ִ� �������
				�͸� ���� Ŭ������ ����Ѵ�.
				
				����]
					new Ŭ�����̸�(){}
					
 */
	JFrame fr;
	JPanel pan, bpan;
	
	public Test01() {
		fr = new JFrame("Test");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(new BorderLayout());
		pan = new JPanel();
		bpan = new JPanel();
		
		JButton btn = new JButton("����");
		JButton cbtn = new JButton("��溯��");
//		btn.addActionListener(new BtnEvent());
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		bpan.add(cbtn);
		bpan.add(btn);
		pan.setBackground(Color.BLUE);
		System.out.println(pan.getHeight());
		
		fr.add(pan, "Center");
		fr.add(bpan, "South");
//		fr.add(btn, "SOUTH");
		
		fr.setSize(500, 500);
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		new Test01();
	}

}

class BtnEvent implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
