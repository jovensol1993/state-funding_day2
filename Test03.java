package day02;

public class Test03 {
	public static void main(String[] args) {
		new Test02().toPrint(); //new: 객체를 만드는 명령어
		System.out.println(new day01.Test01());
		//. 은 소속을 밝혀줄 때 사용한다.
		Test03_01 t01 = new Test03_01(); //클래스의 변수에 클래스 함수 삽입 
		Test03_02 t02 = new Test03_02();
		System.out.println("Test03_01.no:" + new Test03_01().no); //클래스의 함수(no) 호출
		System.out.println("Test03_02.no:" + new Test03_02().no);
		System.out.println("Test03_01.no:" + t01.no); // 변수에 담긴 함수 호출
		System.out.println("Test03_02.no:" + t02.no); 
	}
}

class Test03_01 {
	int no = 10;
}

class Test03_02 {
	int no = 20;
}
//아무것도안나오는데 