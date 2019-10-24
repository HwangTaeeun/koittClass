package day11;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Test01_01 {
	
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
	
	public Test01_01() {
		fr = new JFrame("Test");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("����");
		JButton cbtn = new JButton("���󺯰�");
		btn.addActionListener(new BtnEvent01());
		cbtn.addActionListener(new CHBtnEvent(this));
		
		pan = new JPanel();
		// pan ���� ����
		pan.setBackground(Color.BLUE);
		bpan = new JPanel();
		bpan.setBackground(Color.BLUE);
		
		bpan.add(cbtn);
		bpan.add(btn);
		
		fr.add(pan, "Center");
		fr.add(bpan, "South");
		
		fr.setSize(500, 500);
		fr.setVisible(true);
	}

	public static void main(String[] args) {
		new Test01_01();
	}

}

class BtnEvent01 implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

class CHBtnEvent implements ActionListener {
	// �����Ϸ��� JPanel���� ��� JFrame(fr)�� ���ԵǾ� �ְ�
	// fr ���� Test01_01 �� ����̹Ƿ�
	// ���� ����ǰ� �ִ� Test01_01 �� ��ü�� �ּҸ� ����ϰ� �ִٸ�
	// �� ��ü�� ��� ����� ������ ���� �� ���̴�.
	Test01_01 main;
	
	public CHBtnEvent(Test01_01 main) {
		this.main = main;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// Į�� �����
		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		// Į��ü�� �����
		Color bg = new Color(red, green, blue);
		
		// ���� �����Ѵ�.
		main.pan.setBackground(bg);
		main.bpan.setBackground(bg);
	}
	
}
