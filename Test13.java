package day02;
//1. 두개의 숫자를 입력받은 후
//	두 수를 이용해서 사각형, 삼각형의 넓이를 구해서 출력해주는 프로그램을 작성하세요.

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요. : ");
		float no1 = sc.nextFloat();
		
		System.out.println("두번째 숫자를 입력하세요. : ");
		float no2 = sc.nextFloat();
		
		System.out.println("사각형의 넓이는 : " + (no1 * no2));
		System.out.println("삼각형의 넓이는 : " + (no1 * no2)*0.5);
	}
}
