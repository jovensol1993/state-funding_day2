package day02;

import java.util.Scanner;

//	3. 74,232원을 지불해야하는데 우리나라 화폐 단위로 각 화폐단위가 몇개가 필요한지 계산해서 
//		출력하세요. 단, 화폐는 5만~십원의 단위만 계산하기로 한다.
//		
//		산술 연산자를 사용해서 해결하십쇼.
public class Test15 {
	public static void main(String[] args) {
		int no1 = 74232/50000; //1
		int no1_1 = 74232%50000; 
		
		int no2 = no1_1 / 10000; //2
		int no2_1 = no1_1 % 10000; //나머지
		
		int no3 = no2_1 / 5000; //1
		int no3_1 =  no2_1 % 5000; //나머지
		
		int no4 = no3_1 / 1000;
		int no4_1 =  no3_1 % 1000;
		
		int no5 = no4_1 / 500;
		int no5_1 =  no4_1 % 500;
		
		int no6 = no5_1 / 100;
		int no6_1 =  no5_1 % 100;
		
		int no7 = no6_1 / 10;
		int no7_1 =  no6_1 % 10;
		System.out.println("50,000원" + no1 + "개"+
		   "\n10,000원" + no2 + "개"+
		   "\n5,000원" + no3 + "개"+
		   "\n1,000원" + no4 + "개"+
		   "\n500원" + no5 + "개"+
		   "\n100원" + no6 + "개"+
		   "\n10원" + no7 + "개");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("지불금액을 입력하시오.");
//		int no1 = sc.nextInt();
//		
//		System.out.println("50,000원" + + "개"+
//						   "10,000원" + + "개"+
//						   "5,000원" + + "개"+
//						   "1,000원" + + "개"+
//						   "100원" + + "개"+
//						   "10원" + + "개");
	}
}
