package jframe;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

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
import util.Context;

import java.awt.Color;

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
	private JTextField textField_nomLecteur;
	private JTextField textField_prenomLecteur;
	private JTextField textField_DNLecteur;
	
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
		frmCrationDeCompte = new JFrame("Cr�ation de compte");
		frmCrationDeCompte.setTitle("Creation de compte");
		frmCrationDeCompte.setSize(437, 271);
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
		
		JLabel lblNewLabel_nomLecteur = new JLabel("Nom");
		lblNewLabel_nomLecteur.setBounds(29, 88, 46, 14);
		panel.add(lblNewLabel_nomLecteur);
		
		JLabel lblNewLabel_prenomLecteur = new JLabel("Prenom");
		lblNewLabel_prenomLecteur.setBounds(29, 114, 146, 14);
		panel.add(lblNewLabel_prenomLecteur);
		
		JLabel lblNewLabel_DNLecteur = new JLabel("Date de Naissance (YYYY-MM-DD)");
		lblNewLabel_DNLecteur.setBounds(29, 139, 252, 14);
		panel.add(lblNewLabel_DNLecteur);
		
		textField_nomLecteur = new JTextField();
		textField_nomLecteur.setBounds(159, 85, 141, 20);
		panel.add(textField_nomLecteur);
		
		textField_prenomLecteur = new JTextField();
		textField_prenomLecteur.setBounds(159, 111, 141, 20);
		panel.add(textField_prenomLecteur);
		
		textField_DNLecteur = new JTextField();
		textField_DNLecteur.setBounds(226, 136, 141, 20);
		panel.add(textField_DNLecteur);
		
		btnCrationDeCompte = new JButton("Creation de Compte");
		btnCrationDeCompte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String user = userText.getText();
				String password = passwordText.getText();
				String nomLec=textField_nomLecteur.getText();
				String prenomLec=textField_prenomLecteur.getText();
				LocalDate dateNaissanceLec=LocalDate.parse(textField_DNLecteur.getText());
				Lecteur nouveauC = new Lecteur(user, password, nomLec,prenomLec,dateNaissanceLec );
//				Lecteur nvLecteur = (Lecteur) Context.getInstance().getConnected();
				
				if (user.equals("") || password.equals("") || nomLec.equals("") || prenomLec.equals("") || dateNaissanceLec.equals(""))
				{
					success.setText("Veuillez remplir les champs");
				}
				else
				{
					System.out.println("Creation de Compte confirme");
					DAOl.save(nouveauC);
//					DAOl.save(nvLecteur);
					frmCrationDeCompte.dispose();
					GUILogin.main(null);
				}
			}
		});
		btnCrationDeCompte.setBounds(29, 173, 210, 23);
		panel.add(btnCrationDeCompte);
		
		success = new JLabel("");
		success.setForeground(Color.RED);
		success.setBounds(29, 207, 210, 14);
		panel.add(success);
		
		btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCrationDeCompte.dispose();
			}
		});
		btnFermer.setBounds(270, 198, 111, 23);
		panel.add(btnFermer);
		
		
		
		
		

	}
}
