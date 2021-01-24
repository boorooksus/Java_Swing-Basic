package hello;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class L02_JButton_JLabel_JTextArea {
	public static void main(String[] args) {
		JFrame frame = new JFrame();  // ������ ����
		JPanel panel = new JPanel();  // �г� ����
		
		panel.add(new JLabel("Welcome this lecture"));  // �гο� ������ �߰�
		
		frame.add(panel);  // �����ӿ� �г� �߰�
		
		frame.setResizable(false);  // ����ڰ� ���Ƿ� ������ ũ�� ���ٲٰ�
		frame.setVisible(true);  // ������ ��� â�� ���̰� ����
		
		// ������ ũ�� ����
		// Dimension�� �߰��ؼ� ũ�� ���������.
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		
		// ���α׷� ���� �� ����� ��Ÿ������.
		// default�� ���� ��ܿ��� ��Ÿ��.
		frame.setLocationRelativeTo(null);

		// ������ ���������� ��� ����
		// default�� ������ ���� ���α׷��� ��� ���ư�.
		// �Ʒ�ó�� �����ϸ� ������ ���� ���α׷� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

// ��Ŭ���� import ����Ű: ctrl + shift + o