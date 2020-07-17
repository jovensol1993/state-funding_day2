package day02;

import java.util.Scanner;

public class Test15_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("지불할 금액을 입력해라 5초안에..");
		int no = sc.nextInt();
//		int no2 = no1 % 50000;
		
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
		
	}
}