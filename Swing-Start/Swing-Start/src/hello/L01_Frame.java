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
		JFrame frame = new JFrame();  // 프레임 생성
		JPanel panel = new JPanel();  // 패널 생성
		
		JLabel label = new JLabel("Some text");  // 레이블 생성
		JButton btn1 = new JButton("Click me!");  // 버튼 생성
		
		// JTextArea: 여러 줄의 문자열. JTextField: 한 줄의 문자열 넣을 때 사용
		JTextArea txtArea = new JTextArea();
		
		// 괄호 안에 숫자는 넣을 수 있는 글자의 최대 개수
		//JTextField txtField = new JTextField(200);
		
		// setLayout: 패널, 레이블... 원하는 위치에 넣는 기능
		// BorderLayout: 어느 위치에 넣을지 알려줄 수 있음.
		panel.setLayout(new BorderLayout());  
		
		// 패널에 컨텐츠 추가
		panel.add(label, BorderLayout.NORTH);  // 레이블을 위쪽에 넣음
		panel.add(btn1, BorderLayout.WEST);  // 버튼을 왼쪽에 넣음
		panel.add(txtArea, BorderLayout.CENTER);
		
		frame.add(panel);  // 프레임에 패널 추가
		
		frame.setResizable(false);  // 사용자가 임의로 프레임 크기 못바꾸게
		frame.setVisible(true);  // 프레임 상단 창이 보이게 설정
		
		// 프레임 크기 설정
		// Dimension을 추가해서 크기 정해줘야함.
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		
		// 프로그램 실행 시 가운데서 나타나도록.
		// default는 왼쪽 상단에서 나타남.
		frame.setLocationRelativeTo(null);

		// 프레임 종료했을때 어떻게 할지
		// default는 프레임 꺼도 프로그램은 계속 돌아감.
		// 아래처럼 설정하면 프레임 끄면 프로그램 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
