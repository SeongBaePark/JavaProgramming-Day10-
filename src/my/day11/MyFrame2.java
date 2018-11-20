package my.day11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame2 extends JFrame {
	private JButton button;
	private JLabel label;
	int counter = 0;
	
	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout fa = new BorderLayout();
		// setLayout(new FlowLayout());
		setLayout(fa); // 위에 FlowLayout을 선언하고 만들어줘서 fa을 넣어줄수잇음
		button = new JButton("확인");
		// 이벤트 처리 객체 등록
		MyListener my = new MyListener();
		button.addActionListener(my);
		label = new JLabel("현재의 카운터값:  " + counter);
		add(label, "Center");
		add(button, "East");
		setTitle("현재 카운터 값 출력");
		setVisible(true);
	}
	
	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//Object obj = (JButton)e.getSource();
			counter++;
			label.setText("현재의 카운터값:  " + counter);
		}
	}
	public static void main(String[] args) {
		new MyFrame2();
	}
}
