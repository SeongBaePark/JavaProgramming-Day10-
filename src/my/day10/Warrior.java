package my.day10;

public class Warrior extends Hero{
	String name;
	
	public void groundCutting() {
		System.out.println("대지자르기");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("대지자르기");
	}
}
