package my.day11;

import javax.swing.*;

public class WordPanel extends JPanel {
	private JTextField tf;
	private String word;

	public WordPanel() {
		add(new JLabel("Word : "));
		add(tf = new JTextField(12));
		tf.setEditable(false); // 편집하지 않겠다
		tf.setHorizontalAlignment(JTextField.CENTER);// 중앙정렬
	}// 생성자....
		// 맞출 단어 설정 메소드

	public void setWord(String word) {
		tf.setText(this.word = word);
	}

	// ‘c’ 글자와 같으면 글자가 * 글자로 바꾸고, 텍스트필드에 출력 // 이때, String 클래스의 replace()를 사용한다.
	public void match(char c) {
		word = word.replace(c, '*');
		tf.setText(word);
	}

	// 모두 * 글자로 맞추었는지 체크하는 메소드 (모두 맞추면 true, 그렇지 않으면 false 로반환)
	public boolean isAllMatched() {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != '*')
				return false;
		}
		return true;
	}

}
