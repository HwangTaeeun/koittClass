package day16;

import java.io.*;

/*
	PrintStream
		==> ���Ͱ迭�� ��Ʈ���̴�.
			������Ʈ���̴�.
			
			������� ���Ǽ� + ��� ����� ���ÿ� ����� ���� ���� ��Ʈ���̴�.
			
			���]
				1. ���������� Buffered�� ������ ���Ҵ�.
				2. ����� ���Ǹ� ���ؼ� �ڹ��� ���������¸� �׷��� ����ϵ��� �� ���Ҵ�.
				3. ���ϰ� ���� ������ �� �ֵ��� �� ���Ҵ�.
					( �ٸ� �ܺ���ġ�͵� ������ �����ϴ�. )
					
			���� ]
				�� ���� �̷�� InputStream �� �������� �ʴ´�.
 */

/*
	���� 2]
		PrintStream �� ����ؼ� 
		�ø� ���Ϸ� ������ ����.

 */
public class Test11 {

	public Test11() {
		// ��Ʈ���� �غ��ϰ�
		PrintStream ps = null;
		// ���� ���Ͽ� ����� ��Ʈ���� ����� ������Ʈ��...
		
		try {
			// ��Ʈ���� �����
			ps = new PrintStream("src/day16/poem.txt");
			
			ps.println("*** ���� ***");
			ps.println("\t\t\t\t������");
			ps.println();
			ps.println("�״� ������ �ϴ��� �츣��");
			ps.println("���� �β����� ���⸦,");
			ps.println("�ٻ��� �̴� �ٶ�����");
			ps.println("���� ���ο��ߴ�.");
			ps.println("���� �뷡�ϴ� ��������");
			ps.println("��� �׾�°��� ����ؾ���");
			ps.println("�׸��� ������ �־��� ����");
			ps.println("�ŷ����߰ڴ�.");
			ps.println();
			ps.println("���ù㿡�� ���� �ٶ��� ��ġ���.");
			
			ps.flush();
			// ���������� BufferStream�� ����� ������ �����Ƿ�
			// �ݵ�� �������Ⱑ ������ ���۸� ����� �Ѵ�.
			System.out.println("***** ���� �Ϸ� *****");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
