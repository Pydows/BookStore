package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIMenuLecteur {

	private JFrame frmMenuLecteur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMenuLecteur window = new GUIMenuLecteur();
					window.frmMenuLecteur.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIMenuLecteur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuLecteur = new JFrame();
		frmMenuLecteur.setTitle("Menu Lecteur");
		frmMenuLecteur.setBounds(100, 100, 450, 300);
		frmMenuLecteur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuLecteur.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Voter pour un livre");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuLecteur.dispose();
				GUIVoteLivre.main(null);
			}
		});
		btnNewButton.setBounds(71, 45, 273, 59);
		frmMenuLecteur.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Répondre au Quizz");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuLecteur.dispose();
				GUIDebutQuizz.main(null);
			}
		});
		btnNewButton_1.setBounds(71, 136, 273, 59);
		frmMenuLecteur.getContentPane().add(btnNewButton_1);
		
		JButton btnSeDconnecter = new JButton("Se d\u00E9connecter");
		btnSeDconnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuLecteur.dispose();
				GUILogin.main(null);

			}
		});
		btnSeDconnecter.setBounds(286, 206, 138, 44);
		frmMenuLecteur.getContentPane().add(btnSeDconnecter);
	}
}
