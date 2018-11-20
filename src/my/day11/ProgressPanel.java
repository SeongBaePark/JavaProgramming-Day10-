package my.day11;

import javax.swing.*;

public class ProgressPanel extends JPanel {
	private int count, len; // ���� ����, ���� ����
	private JLabel lb_count, lb_len;

	public ProgressPanel() {
		add(new JLabel("Progress: "));
		add(lb_count = new JLabel());
		add(new JLabel("/"));
		add(lb_len = new JLabel());
	} // ������..
	// �ܾ� ���� �ʱ�ȭ

	public void setLength(int len) {
		this.len = len;
		count = 0;
		lb_count.setText(String.valueOf(count));
		lb_len.setText(String.valueOf(len));
	}

	public void increment() {
		// ī��Ʈ �� ���� �� ���� ���̺� ���
		lb_count.setText(String.valueOf(++count));
	}

	public boolean exceedLimet() {
		// ī��Ʈ���� ���ڱ��̸� �ʰ��ߴ��� üũ
		if (count >= len)
			return true;
		else
			return false;
	}
}
