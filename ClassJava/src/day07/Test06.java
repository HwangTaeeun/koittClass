package day07;

public class Test06 {

	/*
		String Ŭ����
			: �⺻ ������ Ÿ���� �ƴ����� ���󵵰� ���� Ŭ���� Ÿ���̴�. ������ Ÿ��
			
			���ڿ��� ����� ���]
				1. 
					String str = "abcd";
				2. 
					String str1 = new String("abcd");
					
		���� ����ϴ� �Լ�
			
			1. length() : ���ڿ��� ���̸� ��ȯ���ִ� �Լ�
			2. charAt(��ġ) : ���ڿ��� �ش� ��ġ�� ���ڸ� ��ȯ���ִ� �Լ�
			3. equals(���ڿ�) : ���ڿ��� ��������ü�� ���ϴ� �Լ�
			4. 
				4.1 indexOf( ����  || ���ڿ�  )
					- �Է��ִ� ���ڿ� �Ǵ� ���ڰ� ó�� ��Ÿ���� ��ġ�� ��ȯ���ش�.
					
				4.2 indexOf( ���� || ���ڿ� , ������ġ )
					- ������ġ ���Ŀ��� ���� �Ǵ� ���ڿ��� ��Ÿ���� ��ġ�� ��ȯ���ش�.
					
				4.3 lastIndexOf(���� �Ǵ� ���ڿ�) 
					- ���ڿ� �� �ں��� ���� �Ǵ� ���ڿ��� ��Ÿ�� ��ġ�� ��ȯ
					
			5. ���ڿ��� �Ϻθ� �����ؼ� ��ȯ���ִ� �Լ�
				
				5.1 
					substring(������ġ) - ������ġ�������� ������ �������ִ� �Լ�
					
				5.2
					substring(������ġ, ������ġ)
						- ������ġ���� ���� ������ġ ������ ���ڿ� �����ؼ� ��ȯ���ش�.
				
		
	 */
	public Test06() {
		String str1 = "abcd bcd ebeb";
		
		System.out.printf("%25s - %c\n" , "str1.charAt()",  str1.charAt(3));
		System.out.printf("%25s - %d\n" , "str1.indexOf('b')",  str1.indexOf('b'));
		System.out.printf("%25s - %d\n" , "str1.indexOf('b', 3)",  str1.indexOf('b', 3));
		System.out.printf("%25s - %d\n" , "str1.indexOf(\"beb\")",  str1.indexOf("beb"));
		System.out.printf("%25s - %d\n" , "str1.lastIndexOf(\"bcd\")",  str1.lastIndexOf("bcd"));
		System.out.printf("%25s - %s\n" , "str1.substring(2)",  str1.substring(2));
		System.out.printf("%25s - %s\n" , "str1.substring(2, 6)",  str1.substring(2, 6));
	}

	public static void main(String[] args) {
		new Test06();
	}

}
