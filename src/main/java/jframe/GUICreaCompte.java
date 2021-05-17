package jframe;

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
import dao.DAOLecteur;
import metier.Compte;
import metier.Lecteur;

public class GUICreaCompte {

	private JFrame frmCrationDeCompte;
	private JPanel panel;
	private JLabel userLabel;
	private JLabel passwordLabel;
	private JTextField userText;
	private JTextField passwordText;
	private JButton btnCrationDeCompte;
	private JLabel success;
	private JButton btnFermer;
	private DAOLecteur DAOl = new DAOLecteur();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICreaCompte window = new GUICreaCompte();
					window.frmCrationDeCompte.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUICreaCompte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		panel = new JPanel();
		frmCrationDeCompte = new JFrame("Création de compte");
		frmCrationDeCompte.setSize(365, 182);
		frmCrationDeCompte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrationDeCompte.getContentPane().add(panel);
		panel.setLayout(null);

		// Espace user + mdp
		userLabel = new JLabel("user");
		userLabel.setBounds(29, 33, 33, 14);
		panel.add(userLabel);

		userText = new JTextField();
		userText.setBounds(159, 30, 141, 20);
		panel.add(userText);

		passwordLabel = new JLabel("password");
		passwordLabel.setBounds(29, 58, 79, 14);
		panel.add(passwordLabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(159, 55, 141, 20);
		panel.add(passwordText);
		
		btnCrationDeCompte = new JButton("Creation de Compte");
		btnCrationDeCompte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String user = userText.getText();
				String password = passwordText.getText();
				Lecteur nouveauC = new Lecteur(user, password);
				
				if (user.equals("") || password.equals(""))
				{
					success.setText("Veuillez remplir les champs");
				}
				else
				{
					System.out.println("Création de Compte confirmé");
					DAOl.save(nouveauC);
					frmCrationDeCompte.dispose();
					GUILogin.main(null);
				}
			}
		});
		btnCrationDeCompte.setBounds(29, 83, 210, 23);
		panel.add(btnCrationDeCompte);
		
		success = new JLabel("");
		success.setBounds(29, 117, 210, 14);
		panel.add(success);
		
		btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCrationDeCompte.dispose();
			}
		});
		btnFermer.setBounds(248, 106, 79, 23);
		panel.add(btnFermer);
	}
}
