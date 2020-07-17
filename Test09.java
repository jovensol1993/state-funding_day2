package day02;

public class Test09 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 11;
		
//		++no1; // no1에 +1을 해준다. 11로 변환됨
//		no2--; // 다음에 오는  no2에 -1을 해준다. 아직까지는 11임
//		System.out.println("no1:"+ no1); //no1: 11
//		System.out.println("no2:"+ no2); //no2: 10
//		
		if ( (no1++ > no2) && (++no1> --no2) ) { //앞에거가 false임으로 뒤에껀 읽지않음(절삭연산)
		//10 > 11 --> false
		}

			System.out.println("no1 : " + no1);
			System.out.println("no2 : " + no2);
	
	}
}
