package my.day10;

import javax.swing.*;

//import java.awt.FlowLayout;
import java.awt.*;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		super("������ ������ 1"); // Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500); // ������ ����
		//setLayout(new FlowLayout()); // ��ġ�����ڸ� ���������������� ��ư�� ��ü ȭ���� �����ϰ� �ȴ�.
		//JButton button = new JButton("��ư");
		//add(button);
		//getContentPane().setBackground(Color.yellow); // ����
		//JButton button1 = new JButton("Ȯ��");
		//JButton button2 = new JButton("���");
		//this.add(button1);
		//this.add(button2);
		
		// BorderLayout �پ��� ��ġ ������
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
		setVisible(true); // â�����ִ� �޼ҵ�
	}
	
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		
		//mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �� �޼ҵ尡 ��� ���� â�� ������ ���α׷��� ���ᰡ �ȵ� 
		// ���α׷��� �����Ű�� ���ؼ� �� �޼ҵ带 ���
		//mf.setSize(500, 500); // ũ�⸦ ����
		
		//mf.setVisible(true); // â�� �����ִ� �޼ҵ� �Ⱦ��� �����ص� �ȶ�
	}
}
