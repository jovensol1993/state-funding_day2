package day02;
//	4. 1년은 365.2426일이다. 이 날짜는 몇일, 몇분, 몇시간, 
//	몇초인지 계산해서 출력하시오
//		힌트[0.5일은 12시간이다., <== 24 * 0.5]
public class Test16 {
	public static void main(String[] args) {
		float year = 365.2426f;
		int day = 365;
		int hours = 24;
		int minute = 60;
		int second = 60;
		
		
		System.out.println(year+ "일");
		System.out.println((int)year * hours+ "시간");
		System.out.println((int)(year * (hours * minute  ))+ "분");
		System.out.println((int)year * (hours*minute*second) + "초");
	}
}
