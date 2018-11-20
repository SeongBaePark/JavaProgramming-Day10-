package my.day11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	WordPanel wp;
	ProgressPanel pp;
	Words words;
	String WORD = "Programming";
	JTextField tf;
	JButton jbtn;

	public MyFrame() {
		setTitle("MyFrame: WordTest");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		makeUI(); // 모든 컴포넌트를 초기화하는 메소드
		setVisible(true);
	} // 생성자

	private void makeUI() {
		add(wp = new WordPanel(), BorderLayout.NORTH);
		add(pp = new ProgressPanel(), BorderLayout.SOUTH);
		reset();
		JPanel p = new JPanel();
		p.add(new JLabel("Guess: "));
		p.add(tf = new JTextField(1));
		p.add(jbtn = new JButton("Enter"));
		add(p, BorderLayout.CENTER);
		tf.addActionListener(this);
		jbtn.addActionListener(this);
	} // 초기화 메소드

	// 처음상태로 돌리기(단어 설정)
	private void reset() {
		words = new Words();
		WORD = words.getWords();
		wp.setWord(WORD);
		pp.setLength(WORD.length());
	}

	// 버튼 이벤트 처리
	public void actionPerformed(ActionEvent arg0) {
		char c = tf.getText().charAt(0); // 입력한 첫 글자 갖고 오기
		tf.setText("");
		wp.match(c);
		pp.increment();

		if (wp.isAllMatched()) {
			JOptionPane.showMessageDialog(this, "Mission Sucess");
			reset();
		} else if (pp.exceedLimet()) {
			JOptionPane.showMessageDialog(this, "Mission Faile");
			reset();
		}
	}
}
