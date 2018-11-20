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
		makeUI(); // ��� ������Ʈ�� �ʱ�ȭ�ϴ� �޼ҵ�
		setVisible(true);
	} // ������

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
	} // �ʱ�ȭ �޼ҵ�

	// ó�����·� ������(�ܾ� ����)
	private void reset() {
		words = new Words();
		WORD = words.getWords();
		wp.setWord(WORD);
		pp.setLength(WORD.length());
	}

	// ��ư �̺�Ʈ ó��
	public void actionPerformed(ActionEvent arg0) {
		char c = tf.getText().charAt(0); // �Է��� ù ���� ���� ����
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
