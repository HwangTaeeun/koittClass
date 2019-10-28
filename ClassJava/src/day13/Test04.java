package day13;

/*
		Quiz 1]
			
			<input type="text" id="id" name="id">
			<input type="password" id="pw" name="pw" >
			
			<div class="d1" id="d1"><p></p></div>
			
	----------------------------------------------------------------------------------------
	�� �ڵ忡�� �ԷµǴ� ���̵� �о p �±׿� ����Ϸ��� �Ѵ�.
		a) �ڹٽ�ũ��Ʈ�� ó��
			==> �ڹٽ�ũ��Ʈ������ ��� �͵��� ��κ� property �� ������ �ȴ�.
				���� property�� �����ؼ� �����;� �Ѵ�.
				
				var str = document.getElementById('id').value;
				
				document.getElelemtById('d1').innerHTML = '<p>' + str + '</p>';
				
				
				
		b) jQuery �� ó��
			
			==> ��κ��� �͵��� �Լ��� ó���� �Ǿ� �־
				�Լ��� �����ϰ� ��ȯ�Ǵ� ��ü�� �޾Ƽ� ó���ؾ� �Ѵ�.
				
				$(document).ready(function(){
					var str = $('#id').val();
					
					$('#d1 < p').text(str);
				});
			
	Quiz 2]
		
		innerHTMl�� textContent �Ǵ� innerText�� ������... ==> �±��� ����� ����δ��� ������..
		
		html() text()
		
 */

import java.text.*;
import java.util.*;

public class Test04 {
/*
	ChoiceFormat
		==> switch ~ case �� ���� �̿��ؾ� �ϴ� ��쿡 �װ��� ����ȭ �س��� Ŭ����
			��, Ư�� ������ ���� Ư�� ���ڿ��� ��ü�ؼ� ����ϴ� ����� ���� Ŭ����
			
		�������]
			
			ChoiceFormat(double[] limits, String[] format)
				
				limits[] 	-	ġȯ�� ����
				format[]	- 	ġȯ�� ����
 */
	public Test04() {
		double[] limits = {0, 60, 70, 80, 90};
		/*
			==> limits ���鶧 ���� ����
					1. �ݵ�� ������������ ���ĵǾ�� �Ѵ�.
						60 ~69 ���̴� �ϳ��� ���ڷ� �ٲٰ�
						70~ 79 ���̴� �ϳ��� ���ڷ� �ٲٰ�
						....
		 */
		
		String[] format = {"F", "D", "C", "B", "A"};
		/*
			==> format �� ���鶧 ���ǻ���
				�ݵ�� limits�� ������ ��ġ���Ѿ� �Ѵ�.
		 */
		
		ChoiceFormat form = new ChoiceFormat(limits, format);
		// Ư�� ������ �Է��ؼ� ������ ���غ���.
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// �����Է¹ް�
			System.out.println("������ �Է��ϼ���! : ");
			String str = sc.nextLine();
			
			// "quit" �̶�� ���ڿ��� �ԷµǸ� �ݺ����� ���� �����Ѵ�.
			if(str.equals("quit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			// ���� ������ ���� �����
			int score ;
			try {
				// ���ڿ��� ������ ��ȯ�� �� ���ܰ� �߻��� �� �����Ƿ� ����ó�� ���ش�.
				score = Integer.parseInt(str);
				
				// ������ �������� ������ ��� ������ ���ܸ� �߻����Ѽ� ó���Ѵ�.
				if(score > 100 || score < 0) {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("�߸��� ���� �����Դϴ�.");
				continue;
			}
			
			// ����ϱ�
			System.out.println(form.format(score));
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
