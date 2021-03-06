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
		JButton btn2 = new JButton("Exit");  // 종료 버튼 생성
		JTextArea txtArea = new JTextArea();
		JPanel btnPanel = new JPanel();  // 버튼 패널 생성
		panel.setLayout(new BorderLayout());
		
		// 패널에 버튼 추가
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		panel.add(label,BorderLayout.NORTH);
		panel.add(btnPanel,BorderLayout.WEST);
		panel.add(txtArea,BorderLayout.CENTER);
		
		// 버튼 눌렀을 때 액션
		btn1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// 메시지 추가
				//txtArea.append("Hello!!\n");
				
				// label을 txtArea레 작성한 글로 세팅
				label.setText(txtArea.getText());
			}
			
		});
		
		btn2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// 프로그램 종료
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
