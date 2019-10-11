package day02;

public class Test08 {
	int no;
	float fl;
	String str;
	public Test08() {
		Test07 t1 = new Test07();
		System.out.println(t1.num4);
	}
	
	public static void main(String[] args) {
		Test08 t1 = new Test08();
		System.out.println("no : " + t1.no);
		System.out.println("fl : " + t1.fl);
		System.out.println("str : " + t1.str);
	}

}
