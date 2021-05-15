package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIAdmin {

	private JFrame frmAjoutDunLivre;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAdmin window = new GUIAdmin();
					window.frmAjoutDunLivre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAjoutDunLivre = new JFrame();
		frmAjoutDunLivre.setTitle("Ajout d'un livre");
		frmAjoutDunLivre.setBounds(100, 100, 328, 236);
		frmAjoutDunLivre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmAjoutDunLivre.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titre du livre");
		lblNewLabel.setBounds(22, 30, 75, 22);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(142, 31, 136, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNomDeLauteur = new JLabel("Nom de l'auteur");
		lblNomDeLauteur.setBounds(22, 63, 75, 22);
		panel.add(lblNomDeLauteur);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 64, 136, 20);
		panel.add(textField_1);
		
		JLabel lblDateDeSortie = new JLabel("Date de sortie");
		lblDateDeSortie.setBounds(22, 95, 75, 22);
		panel.add(lblDateDeSortie);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(142, 96, 136, 20);
		panel.add(textField_2);
		
		JLabel lblPrix = new JLabel("Prix");
		lblPrix.setBounds(22, 128, 75, 22);
		panel.add(lblPrix);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(142, 129, 136, 20);
		panel.add(textField_3);
		
		JButton btnNewButton = new JButton("Ajout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(22, 161, 256, 23);
		panel.add(btnNewButton);
	}
}
