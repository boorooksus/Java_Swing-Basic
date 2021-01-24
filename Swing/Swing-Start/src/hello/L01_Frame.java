package hello;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class L01_Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();  // ������ ����
		JPanel panel = new JPanel();  // �г� ����
		
		JLabel label = new JLabel("Some text");  // ���̺� ����
		JButton btn1 = new JButton("Click me!");  // ��ư ����
		
		// JTextArea: ���� ���� ���ڿ�. JTextField: �� ���� ���ڿ� ���� �� ���
		JTextArea txtArea = new JTextArea();
		
		// ��ȣ �ȿ� ���ڴ� ���� �� �ִ� ������ �ִ� ����
		//JTextField txtField = new JTextField(200);
		
		// setLayout: �г�, ���̺�... ���ϴ� ��ġ�� �ִ� ���
		// BorderLayout: ��� ��ġ�� ������ �˷��� �� ����.
		panel.setLayout(new BorderLayout());  
		
		// �гο� ������ �߰�
		panel.add(label, BorderLayout.NORTH);  // ���̺��� ���ʿ� ����
		panel.add(btn1, BorderLayout.WEST);  // ��ư�� ���ʿ� ����
		panel.add(txtArea, BorderLayout.CENTER);
		
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
