package day02;

public class Test05 {
	public static void main(String[] args) {
		// 논리값 참을 저장할 변수를 선언하고 초기화하세요.
		boolean bool = true;
		boolean bool1;
		bool1 = false; //같은이름 변수 선언 x
		
		bool = bool1; // bool1의 false에 대한 주소를 기억하고 그걸 bool에게 알려줌
		// ==> bool: false
		System.out.println(bool);
		
//		2. A를 기억할 변수 만들고 초기화 하시오.
		char ch = 'A';
		System.out.println("ch:" + ch);
		char ch1 = (char) 65; //char강제형변환 --> 문자로기억됨
		System.out.println("ch:" + ch1);
		
		char ch2 = (char)(ch1 + 5);
		System.out.println("ch2:" + ch2);
		
		System.out.println((char)('C'-'A')); // 아스키코드 "2"읨 문자
		
		// 3.14를 기억할 float타입의 변수 num을 선언하고 초기화하세요.
		float num = 3.14F; //리터럴 형변환
		float num1 = (float)3.14; //강제 형변환
		
		
		// 참고
		// 정수데이터에 .을 붙이면 실수가 된다.
		// 예] 10. -> double 형 데이터
		
		//"홍길동" 이라는 문자열을 기억할 변수를 선언하고 초기화하시오
		String name;
		name = "홍길동"; //리터럴 풀에 저장
		
		String irum = new String("홍길동"); //new라는 명령을 사용함으로 heap에 다가 만든 객체에 대한 주소를 이름이라는 변수가 참조 <모르겠음>
		
		System.out.println(name); //홍길동 , 리터럴 풀 영역에저장된 주소를 참조 
		System.out.println(irum); // 홍길동, 힙 영역에 저장된 객체를 참조
		System.out.println(irum==name);
		// 문자열의 비교는 equals() 함수를 사용해서 데이터를 비교해야함
		System.out.println(name.equals(irum));
		System.out.println("\"홍길동\".equals(name): " + "홍길동".equals(name)); // \-이스케이프 문자 안에 ""를표시하기위해 사용
			
		/*
		  줄바꿈 기호 \n
		  백스페이스 \b
		  탭키 \t
		 */
		System.out.print("abcd\n");
		System.out.println("\befgh"); //출력후 줄바꿈
	}
}
