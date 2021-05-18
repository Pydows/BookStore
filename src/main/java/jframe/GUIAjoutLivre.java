package jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.DAOLivre;
import metier.Livre;

public class GUIAjoutLivre {

	private JFrame frmAjoutDunLivre;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private DAOLivre daoLi = new DAOLivre();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAjoutLivre window = new GUIAjoutLivre();
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
	public GUIAjoutLivre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAjoutDunLivre = new JFrame();
		frmAjoutDunLivre.setTitle("Ajout d'un livre");
		frmAjoutDunLivre.setBounds(100, 100, 328, 256);
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

		JLabel error = new JLabel("");
		error.setForeground(Color.RED);
		error.setBounds(10, 193, 198, 14);
		panel.add(error);

		JButton btnNewButton = new JButton("Ajout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomLivre = textField.getText();
				String nomAuteur= textField_1.getText();
				LocalDate dateSortie = LocalDate.parse(textField_2.getText());
				double prixLivre = Double.parseDouble(textField_3.getText());
				Livre nouveauL = new Livre(nomLivre, nomAuteur, prixLivre, dateSortie);
				if(nomLivre.equals("") || nomAuteur.equals("") || dateSortie.equals("") || prixLivre<0)
				{
					error.setText("Veuillez remplir tous les champs !");
				}
				else {
					System.out.println(nomLivre +" "+ nomAuteur +" "+  dateSortie+ " "+prixLivre);
					frmAjoutDunLivre.dispose();
					GUIAjoutLivre.main(null);	
					daoLi.save(nouveauL);
				}
			}
		});
		btnNewButton.setBounds(22, 159, 256, 23);
		panel.add(btnNewButton);

		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAjoutDunLivre.dispose();
			}
		});
		btnFermer.setBounds(218, 183, 84, 23);
		panel.add(btnFermer);


	}
}
