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
		setLayout(fa); // ���� FlowLayout�� �����ϰ� ������༭ fa�� �־��ټ�����
		button = new JButton("Ȯ��");
		// �̺�Ʈ ó�� ��ü ���
		MyListener my = new MyListener();
		button.addActionListener(my);
		label = new JLabel("������ ī���Ͱ�:  " + counter);
		add(label, "Center");
		add(button, "East");
		setTitle("���� ī���� �� ���");
		setVisible(true);
	}
	
	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//Object obj = (JButton)e.getSource();
			counter++;
			label.setText("������ ī���Ͱ�:  " + counter);
		}
	}
	public static void main(String[] args) {
		new MyFrame2();
	}
}
