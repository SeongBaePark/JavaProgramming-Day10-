package my.day10;

import java.util.ArrayList;
import java.util.Calendar;

public class HeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hero hero1 = new Hero(); // 추상클래스라 에러가 뜸
		Warrior wr = new Warrior();
		Wizard wz = new Wizard();
		
		Hero hero2 = new Warrior();
		
		ArrayList<Hero> list = new ArrayList();
		
		list.add(wz);
		list.add(wr);
		//list.add(hero1);
		//list.add(hero2);
		
		for(Hero h : list) {
			h.attack();
			
			if(h instanceof Warrior) {
				Warrior t = (Warrior) h;
				t.groundCutting();
				System.out.println(t.getClass());
				Calendar c = Calendar.getInstance();
				System.out.println(c);
				System.out.print(c.get(Calendar.YEAR)+"년 ");
				System.out.print(c.get(Calendar.MONTH)+1 +"월 ");
				System.out.println(c.get(Calendar.DATE)+"일");
				// System.out.println(c.get(Calendar.DAY_OF_MONTH)); 이렇게도 일 표현 가능
				long time = System.currentTimeMillis(); // 현재 시간 불러오는 것 , long으로 세팅
				System.out.println(time);
			}else if(h instanceof Wizard) {
				Wizard t = (Wizard) h;
				t.freezing();
			}
		}
	}

}
