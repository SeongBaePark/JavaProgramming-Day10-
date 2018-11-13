package my.day10;

import javax.swing.*;

//import java.awt.FlowLayout;
import java.awt.*;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		super("나만의 프레임 1"); // 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500); // 사이즈 설정
		//setLayout(new FlowLayout()); // 배치관리자를 선언해주지않으면 버튼이 전체 화면을 차지하게 된다.
		//JButton button = new JButton("버튼");
		//add(button);
		//getContentPane().setBackground(Color.yellow); // 배경색
		//JButton button1 = new JButton("확인");
		//JButton button2 = new JButton("취소");
		//this.add(button1);
		//this.add(button2);
		
		// BorderLayout 다양한 배치 관리자
		setLayout(new BorderLayout());
		JButton b1 = new JButton("NORTH");
		JButton b2 = new JButton("SOUTH");
		JButton b3 = new JButton("EAST");
		JButton b4 = new JButton("WEST");
		JButton b5 = new JButton("CENTER");
		
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
		setVisible(true); // 창보여주는 메소드
	}
	
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		
		//mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 이 메소드가 없어도 실행 창은 닫히나 프로그램이 종료가 안됨 
		// 프로그램을 종료시키기 위해서 이 메소드를 사용
		//mf.setSize(500, 500); // 크기를 설정
		
		//mf.setVisible(true); // 창을 보여주는 메소드 안쓰면 실행해도 안뜸
	}
}
