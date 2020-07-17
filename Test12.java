package day02;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner 클래스에 sc객체 생성, 입력받은 
											 //데이터 system.in -> 바이트코트로 읽어라
		System.out.println("첫숫자입력가즈아!: ");
		int no1 = sc.nextInt(); // 입력받은 데이터 정수형으로 반환(nextint 함수)
		
		System.out.println("두번째숫자입력가즈아!: ");
		int no2 = sc.nextInt(); // 입력받은 데이터 정수형으로 반환(nextint 함수)
		
//		System.out.println("입력된 숫자: " + no1);
		
		// no1을 변의 길이로 가지는 정사각형 넓이를 구해서 출력하세요.
		int area = no1 * no2;
		System.out.println("한 변의 길이가 " + no1 + "한 변의 길이가" + no2 +" 인 정사각형의 넓이는 " + area + "입니다.");
	}
}

