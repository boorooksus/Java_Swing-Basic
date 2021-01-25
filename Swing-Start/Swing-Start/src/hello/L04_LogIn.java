package hello;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class L04_LogIn extends JFrame {
	
	public L04_LogIn(){
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("Password : ");
		JTextField txtID = new JTextField(10); // �ִ� 10���� ���� ����
		// JPasswordField: ��й�ȣ �Է�â
		JPasswordField txtPass = new JPasswordField(10); // �ִ� 10���� ���� ����
		JButton logBtn = new JButton("Log In");
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		
		// �α��� ��ư ������ �� ���
		logBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "Boo";
				String pass = "1234";
				
				if(id.equals(txtID.getText())&&pass.equals(txtPass.getText())){
					JOptionPane.showMessageDialog(null, "You have logged in Successfully!");
					//JOptionPane.showMessageDialog(null, txtPass.getPassword());
				} else {
					JOptionPane.showMessageDialog(null, "Login Failed!");
				}
			}
			
		});
		
		add(panel);
		
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new L04_LogIn();
	}

}