package day02;
/*
 	밑변이 10 이고 높이가 5인 삼각형의 넓이를 구하시오
 */
public class Test07 {
	public static void main(String[] args) {
		int width = 5;
		int height = 5;
//		nob = 10; // 상수라 에러가 뜬다.
//		mit = 20; // 변수라 값이 변해도 에러
//		double area = width * height * 0.5; //12.5
//		double area = width * height * 1/2; //12.0
//		double area = width * height * (1/2); //0.0
		double area = width * height * (1./2); //12.5
		System.out.println(area);
		
	}
}
