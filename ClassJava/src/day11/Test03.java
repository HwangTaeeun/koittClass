package day11;


import java.util.*;

public class Test03 {
/*
	예외처리
	==> 예외 처리의 목적은 프로그램의 정상적인 종료에 있다.
	
		:	프로그램적으로는 문제가 없으나
			(문법상 전혀 오류가 없으나)
			데이터의 문제나 장비의 문제 등에 의해서 
			프로그램을 실행하는 도중 발생하는 에러를
				실행에러(Run Time Error)
			라고 부른다.
			이것을 프로그래밍 용어로 "예외(Exception)"이라고 말한다.
			
			문제는
			이런 예외는 개발자가 예측해서
			이런 문제가 발생했을 경우 대처하는 방식으로 프로그램을 만들어야 하고
			이처럼 예외가 발생했을 경우 
			대처하는 방식의 프로그램을 "예외처리"다 라 부른다.
			
			
		자바에서는 이런 문제점(예외 발생 원인을 개발자가 알고 있어야 한다.)
		을 해결하기 위해서 예외처리 문법을 만들어 놓았다.
		
			형식]
				
				1)
					(1)
					try{
						(2)
						...
						(3)
					} catch(예외클래스이름 변수이름) {
						(4)
					}
						(5)
					실행순서]
						
						예외가 발생했을 경우 		: (1) --> (2) --> (4) --> (5)
						예외가 발생하지 않을 경우 	: (1) --> (2) --> (3) --> (5)
						
						
			문제점
				(3) 이 문제인데
				이 부분의 내용은 예외가 발생하면 실행되지 않는다.
				==> 따라서 try{}의 범위에 따라서 
					실행될 수도 있고
					실행 안될 수도 있다.
					
				
		자바의 예외처리의 원리
			예외가 발생하면 JVM은 발생한 예외의 종류를 분석을 해서
			예외에 대한 정보를 자바스럽게 클래스로 만들어서 
			catch부분에 그 클래스의 주소를 전달한다.
			
		catch 의 의미
			==> 	예외가 발생하면 그 예외의 정보를 받아서
					개발자가 그 정보를 이용해서 원하는 처리를 해 줘야 한다.
					
					
		catch는 다중으로 기술 할 수 있다.
		
			try{
			} catch(???){
			} catch(???){
			} catch(???){
			}
			...
			
		문제점]
			다중 catch를 사용하는 경우
			반드시 실행될 수 있는 상태로 만들어야 한다.
			==> 
			
				
 */
	public Test03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요! : ");
		int no = 0;
		String str ="";
		while(true) {
			try{
				System.out.println("*** 코드 실행 전");
				System.out.println("*********" + sc.hasNext());
				
				if(sc.hasNext()) {
					sc.nextLine();
				}
				no = sc.nextInt();
//				str = sc.nextLine();
//				no = Integer.parseInt(str);
				System.out.println("*** 코드 실행 후");
				/* */
			} catch(NumberFormatException e) {
				System.out.println("1. 숫자형식이 아닙니다.");
				continue;
			} catch(InputMismatchException e) {
				System.out.println("2. 숫자형식이 아닙니다.");
				continue;
				 /* */
			} catch(Exception e) {
				System.out.println("예외 발생");
				e.printStackTrace();
//				break;
				continue;
			}
			
			break;
		}
		System.out.println("입력된 정수 : " + no);
		
		System.out.println("########## END ############");
	}

	public static void main(String[] args) {
		new Test03();
	}

}
