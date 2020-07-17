package day02;

import java.util.Scanner;

//2. 하나의 숫자(반지름)를 입력 받은 후 
	//그 숫자를 이용해서 원의 넓이와 둘레를 구해서 출력해주는 프로그램을 작성하세요.
public class Test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자(반지름)를 입력하세요. : ");
		float no1 = sc.nextFloat();
		float PI = 3.14F;
		System.out.println("원의 넓이는 : " + PI * no1 * no1 + "\n원의 둘레는" + 2 * PI * no1);
	}
}		
