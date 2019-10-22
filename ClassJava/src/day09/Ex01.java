package day09;


/*
	���� Ŭ������ ��ӹ޾Ƽ�
	�簢��, �ﰢ��, �� Ŭ������ �ۼ��ϰ�
	
	�迭�� 10���� �����͸� �����ϴµ� ����Ÿ������ ������ �ϴµ�
	�����ϰ� 0, 1, 2 �� �߻��ؼ�
	0 - ��
	1 - �ﰢ��
	2 - �簢��
	�� ����� �����ϰ�
	
	�� �������� ������ ������ִ� ����� ���� toPrint()�� �������ϰ�
	�����ϼ���.
	
 */
public class Ex01 {
	
	public Ex01() {
		// ����
		// ������ 10�� ���� �� �ִ� �迭�� �����
		Dohyung[] d1 = new Dohyung[10];
		
		// �ݺ��ؼ� �����ϰ� ������ ���� �־��ְ�
		for(int i = 0 ; i < d1.length ; i++ ) {
			// �����ϰ� ���ڸ� 0 ~ 2 �̾Ƽ�
			int proto = (int)(Math.random() * 3);
			
			switch(proto) {
			case 0:
				d1[i] = new Circle((int)(Math.random() * 26) + 5);
				break;
			case 1:
				d1[i] = new Semo((int)(Math.random() * 6) + 3, (int)(Math.random() * 6) + 3);
				break;
			case 2:
				d1[i] = new Nemo((int)(Math.random()*11 + 10), (int)(Math.random()*11 + 10));
				break;
			}
		}
		
		// ����Ѵ�.
		for(int i = 0 ; i < d1.length ; i++ ) {
			d1[i].toPrint();
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}

class Dohyung {
	double area;
	
	public void setArea() {
		this.area = 0;
	}
	
	public void toPrint() {
		System.out.println("����� ����Ŭ����");
	}
}

// �� Ŭ������ �����.
class Circle extends Dohyung {
	int rad;
	
	public Circle() {
		// �⺻ ������ �Լ�
		// �����͸� �Է����� �ʴ� ��쿡�� �������� [ 1 ]�� ������ �ǵ��� �غ���.
		// �׷��� �������� �ʱ�ȭ�� �Ʒ� �����Ͱ� �ԷµǼ� ����Ǵ�
		// �������Լ��� ����� �������Ƿ� �� �Լ��� ȣ�����ָ�
		// ������ ���� + ������� ���� �ذ��� �ȴ�.
		this(1);
	} 
	
	public Circle(int rad) {
		// �������� �Է��ؼ� ���� ��ü�� ����� ������ �Լ�
		this.rad = rad;
		// �������� �Է��� �Ǹ� ������ ����� �ȴ�.
		// �� ����� �Ʒ� setArea()�� �������̵�(�Լ��� ������)�� ó���� �������Ƿ�
		// �Լ��� ȣ�⸸ ���ָ� �ȴ�.
		setArea();
	}
	
	public void setArea() {
		this.area = this.rad * this.rad * Math.PI;
	}
	
	public void toPrint() {
		System.out.println("�� : ������ - " + rad + " | ���� - " + area);
	}
}

// �ﰢ�� Ŭ������ �����.
class Semo extends Dohyung {
	int width;
	int height;
	
	// �⺻ �������Լ�
	public Semo() {
		this(1, 2);
	}
	// �������Է��ϴ� ������ �Լ�
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public void setArea() {
		this.area = width * height / 2d;
	}
	
	public void toPrint() {
		System.out.println("���� : �غ� - " + width + " | ���� - " + height + " | ���� - " + area);
	}
	
}

// �簢�� Ŭ������ �����.
class Nemo extends Dohyung {
	// ���� ����
	int width;
	int height;
	
	// ������ �Լ�
	public Nemo() {
		this(1, 1);
	}
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	
	public void setArea() {
		this.area = this.width * this.height;
	}
	
	public void toPrint() {
		System.out.println("�׸� : ���� - " + width + " | ���� - " + height + " | ���� - " + area);
	}
}