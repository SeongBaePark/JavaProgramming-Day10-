package my.day10;

import java.util.ArrayList;
import java.util.Calendar;

public class HeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hero hero1 = new Hero(); // �߻�Ŭ������ ������ ��
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
				System.out.print(c.get(Calendar.YEAR)+"�� ");
				System.out.print(c.get(Calendar.MONTH)+1 +"�� ");
				System.out.println(c.get(Calendar.DATE)+"��");
				// System.out.println(c.get(Calendar.DAY_OF_MONTH)); �̷��Ե� �� ǥ�� ����
				long time = System.currentTimeMillis(); // ���� �ð� �ҷ����� �� , long���� ����
				System.out.println(time);
			}else if(h instanceof Wizard) {
				Wizard t = (Wizard) h;
				t.freezing();
			}
		}
	}

}
