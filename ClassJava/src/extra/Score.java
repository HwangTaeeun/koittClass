package extra;

/*
	이 클래스처럼 
	데이터를 저장하고 
	그 저장된 데이터를 전송해줄 목적으로 만든 클래스를
		
		VO(Value Object) 클래스
		DTO(Data Transfer Object) 클래스
 */
public class Score {
	private int kor;
	private int eng;
	private int math;
	private int sci;
	private int prog;
	private int total;
	private double avg;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getProg() {
		return prog;
	}
	public void setProg(int prog) {
		this.prog = prog;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = kor + eng + math + sci + prog;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = total / 5.;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	/*
	// 변수에 데이터를 입력하는 기능을 가진 함수
	public void setKor(int kor) {
		this.kor = kor;
	}
	// 변수의 데이터를 읽어오는 기능을 가진 함수
	public int getKor() {
		return this.kor;
	}
	*/
	
}
