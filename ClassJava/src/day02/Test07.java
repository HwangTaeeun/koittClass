package day02;



/*
	switch ~ case ���ǹ�
		����]
			switch(����){
				case ������1:
					���๮1;
					break;
				case ������2:
					���๮2;
					break;
				...
				default:
					���๮;
			}
 */
public class Test07 {
	
	private int num1 = 100;
	int num2 = 200;
	protected int num3 = 300;
	public int num4 = 400;
	
	public Test07() {
		System.out.println(num4);
		
	}

	public static void main(String[] args) {
		int no = 3;
		String str = "";
		switch(no) {
		case 1:
			str = "�ϳ�";
			break;
		case 2:
			str = "��";
			break;
		case 3:
			str = "��";
			break;
		case 4:
			str = "��";
			break;
		default:
			str = "�ټ��̻�";
		}
		
		System.out.println(no + " | " + str);
	}

}
