package my.day11;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class SimpleGame extends JFrame {
	int n1, n2, n3;
	JButton button1, button2, button3;

	public SimpleGame() {
		setTitle("Simple Game Machine");
		setSize(300, 150);
		JPanel panel = new JPanel();
		button1 = new JButton("" + n1);
		panel.add(button1);
		button2 = new JButton("" + n2);
		panel.add(button2);
		button3 = new JButton("" + n3);
		panel.add(button3);
		panel.requestFocus();
		panel.setFocusable(true);
		add(panel);
		setVisible(true);
		
		panel.addKeyListener(new MyKeyListener());
	}
		
			// inner 클래스 정의
			class MyKeyListener implements KeyListener{

				@Override
				public void keyPressed(KeyEvent e) {
					int keycode = e.getKeyCode(); // getSource 냐 getKeyCode 냐 뭘 사용하는지 시험에 나옴
					if (keycode == KeyEvent.VK_ENTER) {
						n1 = (int) (Math.random() * 10);
						n2 = (int) (Math.random() * 10);
						n3 = (int) (Math.random() * 10);
						button1.setText("" + n1);
						button2.setText("" + n2);
						button3.setText("" + n3);
					}
				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}	
			}
			public void keyReleased(KeyEvent e) {
			}

			public void keyTyped(KeyEvent e) {
			}	
	public static void main(String[] args) {
		SimpleGame f = new SimpleGame();
	}

}
