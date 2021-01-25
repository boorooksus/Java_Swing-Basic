package hello;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class L03_Functions {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some Text");
		JButton btn1 = new JButton("Click me!");
		JButton btn2 = new JButton("Exit");  // ���� ��ư ����
		JTextArea txtArea = new JTextArea();
		JPanel btnPanel = new JPanel();  // ��ư �г� ����
		panel.setLayout(new BorderLayout());
		
		// �гο� ��ư �߰�
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		panel.add(label,BorderLayout.NORTH);
		panel.add(btnPanel,BorderLayout.WEST);
		panel.add(txtArea,BorderLayout.CENTER);
		
		// ��ư ������ �� �׼�
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// �޽��� �߰�
				//txtArea.append("Hello!!\n");
				
				// label�� txtArea�� �ۼ��� �۷� ����
				label.setText(txtArea.getText());
			}
			
		});
		
		btn2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// ���α׷� ����
				System.exit(0);
			}
			
		});
		
		frame.add(panel);
		
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}