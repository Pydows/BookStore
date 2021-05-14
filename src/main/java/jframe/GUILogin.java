package jframe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUILogin  implements ActionListener{

	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JFrame frame;
	private static JPanel panel;

	public static void main(String[] args) {

		panel = new JPanel();
		frame = new JFrame("Page de Login");
		frame.setSize(300, 175);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);


		// Espace user + mdp
		userLabel = new JLabel("user");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);

		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);

		passwordLabel = new JLabel("password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);

		//Le boutton
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUILogin());
		panel.add(button);

		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);


		frame.setVisible(true);


		//		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		
		if (user.equals("Fred")&& password.equals("test"))
		{
			success.setText("Bien ouej");
			// Le changement de page
			frame.dispose();
			GUIQuizz.main(null);
		}
		else
		{
			success.setText("Loupé escroc");
		}
	}


}

