package jframe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dao.DAOCompte;
import metier.Compte;

public class GUILogin {

	private JFrame frame;
	private JPanel panel;
	private JLabel userLabel;
	private JLabel passwordLabel;
	private JTextField userText;
	private JTextField passwordText;
	private JButton button;
	private JLabel success;
	private JButton btnFermer;
	private DAOCompte daoC = new DAOCompte();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILogin window = new GUILogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUILogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		panel = new JPanel();
		frame = new JFrame("Page de Login");
		frame.setSize(320, 175);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		// Espace user + mdp
		userLabel = new JLabel("user");
		userLabel.setBounds(29, 24, 33, 14);
		panel.add(userLabel);

		userText = new JTextField();
		userText.setBounds(98, 21, 141, 20);
		panel.add(userText);

		passwordLabel = new JLabel("password");
		passwordLabel.setBounds(29, 46, 79, 14);
		panel.add(passwordLabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(98, 46, 141, 20);
		panel.add(passwordText);
		
		
		button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String user = userText.getText();
				String password = passwordText.getText();
				
				
				
				if (user.equals("adm")&& password.equals("adm"))
				{
					// Le changement de page
					frame.dispose();
					GUIAjoutLivre.main(null);
					daoC.findById(user);
				}
				else if (user.equals("lec")&& password.equals("lec"))
				{
					frame.dispose();
					GUILecteur.main(null);
				}
				else
				{
					success.setText("Loupé escroc");
				}
			}
		});
		button.setBounds(29, 83, 210, 23);
		panel.add(button);
		
		success = new JLabel("");
		success.setForeground(Color.RED);
		success.setBounds(29, 117, 210, 14);
		panel.add(success);
		
		btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnFermer.setBounds(221, 108, 79, 23);
		panel.add(btnFermer);
	}

}
