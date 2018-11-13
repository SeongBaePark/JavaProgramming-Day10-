package my.day10;

import java.util.*;

public class Ex02_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 0부터 100사이의 난수를 하나 생성하고, 그 값을 출력하여 보자.
		Random random = new Random();
		System.out.println(random.nextInt(100)+1);
		System.out.println("====================");
		//2. 국제 전화번호 "082-2-777-5566"에서 국가 번호, 도서 식별 번호, 가입자 번호를 추출하여 보자
		//StringTokenizer 클래스를 사용
		StringTokenizer st = new StringTokenizer("082-2-777-5566", "-"); // 이렇게 사용 문자열, 구분할 값
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("====================");
		
		//2-1/ String 클래스의 Split() 메소드 이용
		String[] tokens = "082-2-777-5566".split("-");
		for (String token : tokens) {
			System.out.println(token);
		}
		System.out.println("====================");
		//3. 오늘 날짜를 화면에 출력하여 보자.
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println("====================");
		//3.1 년, 월, 일 만 추출하여 보자/
		System.out.print(c.get(Calendar.YEAR)+ "년 ");
		System.out.print(c.get(Calendar.MONTH)+1 +"월 ");
		System.out.print(c.get(Calendar.DATE)+ "일");
		//4. Ex02_Test 클래스의 객체를 생성하고 이 객체를 통하여 객체를 생성한 클래스의 이름을 출력하여 보자
		Ex02_Test t = new Ex02_Test();
		System.out.println(t.getClass());
	}

}
