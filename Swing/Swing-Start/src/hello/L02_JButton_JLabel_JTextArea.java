package hello;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class L02_JButton_JLabel_JTextArea {
	public static void main(String[] args) {
		JFrame frame = new JFrame();  // 프레임 생성
		JPanel panel = new JPanel();  // 패널 생성
		
		panel.add(new JLabel("Welcome this lecture"));  // 패널에 컨텐츠 추가
		
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

// 이클립스 import 단축키: ctrl + shift + o