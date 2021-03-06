package day05;

public class Test02 {

	public Test02() {
		/*
		int no = (int)(Math.random() * 201 - 100);
		*/
		/*
			함수 || Method
				함수 : 클래스의 속해있지 않은 기능을 구현한 것.
				Method : 클래스내에 만들어지고(클래스에 속해있고) 기능을 구현한 것.
				
				== 기능
					: 한가지 작업을 실행하기 위해 만들어진 가장 작은 단위의 프로그램이다.
					
					참고 ] 
						프로그램 - 함수들과 변수들이 모여서 원하는 목적을 이루도록 구성하는 것.
						
				예]
					println() - 어떤 데이터를 문자열로 콘솔에 출력해주고 
								줄바꿈해주는 기능을 가진 함수
					
					charAt() 	-  문자열에서 입력되는 위치값에 해당하는 문자를 반환해주는 기능을 가진 함수
					random()	- 0 ~ 1 사이의 난수 하나를 발생해서 반환해주는 기능을 가진 함수
					
					
			*****
			참고]
				1. 함수는 누군가 호출을 해야 실행된다.
					main() 경우도 함수 스스로 실행되는 것이 아니고 자바가상머신이 찾아서 호출을 해주는 것이다.
					
				2. 함수는 실행이 완료되면 자신을 호출한 곳으로 실행 순서를 넘긴다.
				
					
					class Test {
					
						public static void abc(){
							(1)
						}
						
						public static void main(String[] args){
							(2)
							
							abc();
							
							(3)
						}
						
					}
					
					(2) -> (1) -> (3)
		 */
		System.out.println("0. 생성자 함수내 처음 실행 부분");
		
		abc();
		
		System.out.println("2 - 함수 실행 후");
	}

	public static void main(String[] args) {
		System.out.println("#### 여기는 main() 함수 실행 첫 문장");
		
		new Test02();
		
		System.out.println("***** 여기는 생성자 호출 후");
	}
	
	// 이 함수는 "1 - abc"를 콘솔에 출력해주는 기능을 가진 함수
	public void abc() {
		System.out.println("1 - abc");
	}

}


/*
	함수 만드는 방법
		
		형식]
			
			[접근지정자]	[속성]	반환값타입	함수이름([매개변수리스트]){
				이 함수가 해야될 일을 작성하는 부분....
			}
			
			1. 함수이름은 식별자 만드는 규칙에 의해서 작성한다.
			
			2. 매개변수 리스트
				==> 변수 선언 형태로 만드는 것
					함수를 실행할 때 반드시 필요한 데이터가 있는 경우
					그 데이터를 입력해줘야 함수가 제 기능을 발휘할 것이다.
					이때 입력해주는 데이터를 변수 선언형태로 기술해놓고
					함수 실행부 내에서 그 변수를 받아서 사용하는 것.
					필요한 데이터의 갯수는 함수를 작성할 때마다 다를 것이고
					여러개의 표현은 [ , ] 를 구분자로 기술한다.
					갯수의 한계는 없다.
					
			3. 반환값타입
				==> 함수는 한가지 목적을 달성하기 위한 가장 작은 단위의 프로그램이다.
					==> 함수를 실행한다는 것은 그 목적이 달성 되어야 한다는 이야기이다.
						그러면 그 달성된 목적이 경우에 따라서 결과 존재해야 한다.
						
					반환값 타입이란?
						함수가 실행되었을 때 그 함수의 연산 결과를 알려주는 것
						==> 그 결과가 함수의 기능에 따라서 달라질 것이고
							경우에 따라서는 생겨나는 데이터가 없는 경우도 있을 것이다.
							
						이때 결과에 해당하는 데이터의 타입을 반환값 타입이라 한다.
						
				참고]
					함수실행의 결과가 반드시 있는것은 아니다.
					예를 들자면
						뭔가를 출력해는 기능을 가진 함수는 
						출력을 해주고 난 이후에는 이미 목적을 달성을 한 상태이다.
						따라서 결과물은 없을 것이다.
						
					이런경우에는 반환값 유형에 아무것도 안쓰면 편할것 같지만 그러면 안되고
					반드시 " void " 라고 반환값이 없다고 표현해야 한다.
					
				참고]
					함수는 한가지 목적을 달성하기 위한 가장 작은 단위의 프로그램이다.
					그러므로 반환값은
						*****
						" 한개이거나 없을 수 있다. "
						
					*****
					반환값이 2개 이상인 함수는 자바에서는 존재하지 않는다.
					
					틀린예]
						
						public char, int complx(){
						
						}
						
					틀린예수정]
						
						public int[] complx(){
							int[] arr = new int[2]
							
							return arr;
						}
						
				4. 함수의 기능의 결과를 반환 시켜주는 방법
					
					return[ 데이터 ];
					
					반환값이 없는 경우는 데이터를 생략해도 된다.
					
		return 의 의미
			
			return - 함수 내부에서 사용하는 명령
			
			의미]
				1. 함수의 실행을 종료하세요.
					(return 명령을 만나는 순간 함수의 실행을 멈추고 해당 함수를 종료하세요.)
					
				2. 함수의 결과는 무엇인가요???
					==> 반환값이 있으면 내보내주고 함수를 종료하세요.
					
				참고]
					
					반환값이 없는 경우 return 명령은 생략 될 수도 있다.
					
============================================================================================

	함수의 사용법
		
		==> 함수는 스스로 실행되는 경우는 절대로 없으므로
			어디선가 반드시 실행을 시켜줘야 한다.
			(함수는 호출되어야 한다.)
			
			형식]
				
				함수이름([매개변수리스트]);
				
					매개변수 : Parameter
					
			함수 호출할 때 매개변수는 반드시 작성된데로 함수를 호출해야 한다.
			
				원칙적으로 함수의 이름을 동일하게 만드면 안된다.
				경우에 따라서 같은 함수를 입력해주는 데이터의 형태에 따라서
				다양하게 호출할 수 있도록 하는 것 - 오버로딩(Overloading) 또는 함수의중첩
				
				void abc(){
				}
				
				==> abc(); 		- o
					abc(10);	- x
					
				해결방법은 함수를 실행할 때 매개변수로 정수를 입력해주고 실행시키는 함수를 추가해주면 된다.
					
					void abc(int no){
					}
					
				- 이 것을 함수의 중첩 또는 Overloading 이라 한다.
				
				*****
				Overloading 규칙
					1. 함수의 이름을 같게 한다.
					2. 매개변수리스트를 다르게 한다.
					3. 반환값하고는 전혀 상관없다.
					
	반환값 사용방법
		
		==> 함수의 실행이 종료되면 함수실행의 결과가 있을 것이고
			이 결과를 받아서 사용할 수 도 있을 것이다.
			
			그런데 자바에서는 메모리의 주소에 직접 접근이 안되므로
			이 결과값의 주소도 따로 기억해 놓지 않는다면 사용할 수 없다.
			따라서 실행결과를 재사용할 것이라면
			자바에서 데이터를 기억하는 방법(변수에 주소를 기억시키는 방법)을
			사용해서 처리하면 된다.
			
			예]
				char ch = "abcd".charAt(1);
				
			변수에 주소를 기억시키지 않고 사용하는 경우는
			실행결과를 바로 사용하는 경우
				
				System.out.println("abcd".charAt(0));
				
	참고 ]
		반환값이 있는 함수의 경우라도
		따로 그 반환값을 사용하지 않을 경우에는 변수에 기억시키지 않아도 된다.
		
*/