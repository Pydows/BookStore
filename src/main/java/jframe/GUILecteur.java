package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUILecteur {

	private JFrame frmInscriptionDunLecteur;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		JLabel lblNewLabel_1 = new JLabel("Nom (*)");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		frmInscriptionDunLecteur.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prenom (*)");
		lblNewLabel_2.setBounds(10, 72, 146, 14);
		frmInscriptionDunLecteur.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date de Naissance (DD/MM/YYYY)");
		lblNewLabel_3.setBounds(10, 108, 252, 14);
		frmInscriptionDunLecteur.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(207, 36, 174, 20);
		frmInscriptionDunLecteur.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(207, 69, 174, 20);
		frmInscriptionDunLecteur.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(207, 105, 174, 20);
		frmInscriptionDunLecteur.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmInscriptionDunLecteur.dispose();
				GUIMenuLecteur.main(null);
			}
		});
		btnNewButton.setBounds(10, 137, 371, 23);
		frmInscriptionDunLecteur.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("* : Obligatoire");
		lblNewLabel_4.setBounds(10, 171, 167, 14);
		frmInscriptionDunLecteur.getContentPane().add(lblNewLabel_4);
	}

}
