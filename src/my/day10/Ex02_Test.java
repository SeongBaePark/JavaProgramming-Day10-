package my.day10;

import java.util.*;

public class Ex02_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 0���� 100������ ������ �ϳ� �����ϰ�, �� ���� ����Ͽ� ����.
		Random random = new Random();
		System.out.println(random.nextInt(100)+1);
		System.out.println("====================");
		//2. ���� ��ȭ��ȣ "082-2-777-5566"���� ���� ��ȣ, ���� �ĺ� ��ȣ, ������ ��ȣ�� �����Ͽ� ����
		//StringTokenizer Ŭ������ ���
		StringTokenizer st = new StringTokenizer("082-2-777-5566", "-"); // �̷��� ��� ���ڿ�, ������ ��
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("====================");
		
		//2-1/ String Ŭ������ Split() �޼ҵ� �̿�
		String[] tokens = "082-2-777-5566".split("-");
		for (String token : tokens) {
			System.out.println(token);
		}
		System.out.println("====================");
		//3. ���� ��¥�� ȭ�鿡 ����Ͽ� ����.
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println("====================");
		//3.1 ��, ��, �� �� �����Ͽ� ����/
		System.out.print(c.get(Calendar.YEAR)+ "�� ");
		System.out.print(c.get(Calendar.MONTH)+1 +"�� ");
		System.out.print(c.get(Calendar.DATE)+ "��");
		//4. Ex02_Test Ŭ������ ��ü�� �����ϰ� �� ��ü�� ���Ͽ� ��ü�� ������ Ŭ������ �̸��� ����Ͽ� ����
		Ex02_Test t = new Ex02_Test();
		System.out.println(t.getClass());
	}

}
