package my.day11;

import javax.swing.*;

public class ProgressPanel extends JPanel {
	private int count, len; // 맞춘 개수, 글자 길이
	private JLabel lb_count, lb_len;

	public ProgressPanel() {
		add(new JLabel("Progress: "));
		add(lb_count = new JLabel());
		add(new JLabel("/"));
		add(lb_len = new JLabel());
	} // 생성자..
	// 단어 길이 초기화

	public void setLength(int len) {
		this.len = len;
		count = 0;
		lb_count.setText(String.valueOf(count));
		lb_len.setText(String.valueOf(len));
	}

	public void increment() {
		// 카운트 값 증가 한 것을 레이블에 출력
		lb_count.setText(String.valueOf(++count));
	}

	public boolean exceedLimet() {
		// 카운트값이 문자길이를 초과했는지 체크
		if (count >= len)
			return true;
		else
			return false;
	}
}
