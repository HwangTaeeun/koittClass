package day10;

import static java.lang.Math.*;

public class Test05 {

	public Test05() {
		Dohyung[] d1 = new Dohyung[10];
		
		// 도형 만들어서 배열에 넣기
		for(int i = 0 ; i < d1.length ; i++ ) {
			int tmp = (int)(random() * 3);
			
			if(tmp == 0) {
				d1[i] = new Circle((int)(random() * 11) + 10);
			} else if(tmp == 1) {
				d1[i] = new Semo((int)(random() * 11) + 10, (int)(random() * 11) + 10);
			} else if(tmp == 2) {
				d1[i] = new Nemo((int)(random() * 11) + 10, (int)(random() * 11) + 10);
			}
		}
		
		// 도형 꺼내서 출력하기
		for(int i = 0 ; i < d1.length ; i++ ) {
			d1[i].toPrint();
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
