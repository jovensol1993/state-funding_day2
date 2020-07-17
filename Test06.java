package day02;
/*
 	반지름을 기억할 변수를 만들어서 초기화하고
 	초기화된 반지름을 가지는 원의 넓이와 둘레를 기억할 변수를 만들어서 초기화하세요.
 */
public class Test06 {
	public static void main(String[] args) {
		int r = 10;
		//상수 파이 선언
		final float PI = 3.14F; //F,f 상관없음 리터럴 형변환 <모르겠음 double float 차이>
		
		
		// 원의 넓이 기억할 변수 선언 및 초기화
		// 공식 반지름 x 반지름 x 3.14 ==> 실수 값 도출
		float area = r * r * PI;
		
		// 원의 둘레를 기억할 변수 선언 및 초기화
		// 공식 ] 2 * 반지름 * PI
		float arround = 2 * r * PI;
		System.out.println("원의 반지름 :" + r + "\n원의 넓이 :" + area + "\n원의 둘레 :" + arround);
		
	}
}
