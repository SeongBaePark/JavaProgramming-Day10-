package my.day11;

import javax.swing.*;

public class WordPanel extends JPanel {
	private JTextField tf;
	private String word;

	public WordPanel() {
		add(new JLabel("Word : "));
		add(tf = new JTextField(12));
		tf.setEditable(false); // �������� �ʰڴ�
		tf.setHorizontalAlignment(JTextField.CENTER);// �߾�����
	}// ������....
		// ���� �ܾ� ���� �޼ҵ�

	public void setWord(String word) {
		tf.setText(this.word = word);
	}

	// ��c�� ���ڿ� ������ ���ڰ� * ���ڷ� �ٲٰ�, �ؽ�Ʈ�ʵ忡 ��� // �̶�, String Ŭ������ replace()�� ����Ѵ�.
	public void match(char c) {
		word = word.replace(c, '*');
		tf.setText(word);
	}

	// ��� * ���ڷ� ���߾����� üũ�ϴ� �޼ҵ� (��� ���߸� true, �׷��� ������ false �ι�ȯ)
	public boolean isAllMatched() {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != '*')
				return false;
		}
		return true;
	}

}
