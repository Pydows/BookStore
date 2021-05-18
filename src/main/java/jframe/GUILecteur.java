package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dao.DAOLecteur;
import metier.Lecteur;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class GUILecteur {

	private JFrame frmInscriptionDunLecteur;
	private JTextField textField_nomLecteur;
	private JTextField textField_prenomLecteur;
	private JTextField textField_DNLecteur;
	private DAOLecteur DAOlect = new DAOLecteur();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILecteur window = new GUILecteur();
					window.frmInscriptionDunLecteur.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUILecteur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInscriptionDunLecteur = new JFrame();
		frmInscriptionDunLecteur.setTitle("Inscription d'un lecteur");
		frmInscriptionDunLecteur.setBounds(100, 100, 450, 234);
		frmInscriptionDunLecteur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInscriptionDunLecteur.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Veuillez remplir les champs ci dessous : ");
		lblNewLabel.setBounds(92, 11, 246, 14);
		frmInscriptionDunLecteur.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_nomLecteur = new JLabel("Nom (*)");
		lblNewLabel_nomLecteur.setBounds(10, 36, 46, 14);
		frmInscriptionDunLecteur.getContentPane().add(lblNewLabel_nomLecteur);
		
		JLabel lblNewLabel_prenomLecteur = new JLabel("Prenom (*)");
		lblNewLabel_prenomLecteur.setBounds(10, 72, 146, 14);
		frmInscriptionDunLecteur.getContentPane().add(lblNewLabel_prenomLecteur);
		
		JLabel lblNewLabel_DNLecteur = new JLabel("Date de Naissance (DD/MM/YYYY)");
		lblNewLabel_DNLecteur.setBounds(10, 108, 252, 14);
		frmInscriptionDunLecteur.getContentPane().add(lblNewLabel_DNLecteur);
		
		textField_nomLecteur = new JTextField();
		textField_nomLecteur.setBounds(207, 36, 174, 20);
		frmInscriptionDunLecteur.getContentPane().add(textField_nomLecteur);
		textField_nomLecteur.setColumns(10);
		
		textField_prenomLecteur = new JTextField();
		textField_prenomLecteur.setColumns(10);
		textField_prenomLecteur.setBounds(207, 69, 174, 20);
		frmInscriptionDunLecteur.getContentPane().add(textField_prenomLecteur);
		
		textField_DNLecteur = new JTextField();
		textField_DNLecteur.setColumns(10);
		textField_DNLecteur.setBounds(207, 105, 174, 20);
		frmInscriptionDunLecteur.getContentPane().add(textField_DNLecteur);
		
		JLabel error = new JLabel("");
		error.setBounds(153, 171, 228, 14);
		frmInscriptionDunLecteur.getContentPane().add(error);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomLec=textField_nomLecteur.getText();
				String prenomLec=textField_prenomLecteur.getText();
				LocalDate dateNaissanceLec=LocalDate.parse(textField_DNLecteur.getText());
				Lecteur nvLecteur = new Lecteur(nomLec, prenomLec, dateNaissanceLec);
				if(nomLec.equals("") || prenomLec.equals(""))
				{
					error.setText("Veuillez rentrer un nom et prénom !");
				}
				else {
					DAOlect.save(nvLecteur);
					System.out.println(nomLec +" "+ prenomLec +" "+  dateNaissanceLec);
					frmInscriptionDunLecteur.dispose();
					GUIMenuLecteur.main(null);				
				}
			}
		});
		btnNewButton.setBounds(10, 137, 371, 23);
		frmInscriptionDunLecteur.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("* : Obligatoire");
		lblNewLabel_4.setBounds(10, 171, 167, 14);
		frmInscriptionDunLecteur.getContentPane().add(lblNewLabel_4);
		
		
	}

}
