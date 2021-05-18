package jframe;

import java.awt.Button;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import dao.DAOAvis;
import metier.Avis;
import metier.Compte;
import metier.Lecteur;
import metier.Livre;

public class GUIVoteLivre {

	private JFrame frmEvaluationDunLivre;
	private JTextField textField;
	private final ButtonGroup buttonNoteLivre = new ButtonGroup();
	private DAOAvis daoA = new DAOAvis();
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(Compte c) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIVoteLivre window = new GUIVoteLivre(c);
					window.frmEvaluationDunLivre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIVoteLivre(Compte c) {
		initialize(c);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Compte c) {
		frmEvaluationDunLivre = new JFrame();
		frmEvaluationDunLivre.setTitle("Evaluation d'un livre");
		frmEvaluationDunLivre.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIVoteLivre.class.getResource("/image/livre.png")));
		frmEvaluationDunLivre.setBounds(100, 100, 497, 372);
		frmEvaluationDunLivre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEvaluationDunLivre.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		buttonNoteLivre.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(50, 42, 37, 21);
		rdbtnNewRadioButton.setHideActionText(true);
		frmEvaluationDunLivre.getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setActionCommand("1");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2");
		buttonNoteLivre.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(83, 42, 37, 21);
		frmEvaluationDunLivre.getContentPane().add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setActionCommand("2");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3");
		buttonNoteLivre.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(122, 42, 37, 21);
		frmEvaluationDunLivre.getContentPane().add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setActionCommand("3");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("4");
		buttonNoteLivre.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(161, 42, 37, 21);
		frmEvaluationDunLivre.getContentPane().add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setActionCommand("4");
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("5");
		buttonNoteLivre.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(200, 42, 37, 21);
		frmEvaluationDunLivre.getContentPane().add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setActionCommand("5");
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("6");
		buttonNoteLivre.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setBounds(239, 42, 37, 21);
		frmEvaluationDunLivre.getContentPane().add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setActionCommand("6");
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("7");
		buttonNoteLivre.add(rdbtnNewRadioButton_6);
		rdbtnNewRadioButton_6.setBounds(278, 42, 37, 21);
		frmEvaluationDunLivre.getContentPane().add(rdbtnNewRadioButton_6);
		rdbtnNewRadioButton_6.setActionCommand("7");
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("8");
		buttonNoteLivre.add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.setBounds(317, 42, 37, 21);
		frmEvaluationDunLivre.getContentPane().add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.setActionCommand("8");
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("9");
		buttonNoteLivre.add(rdbtnNewRadioButton_8);
		rdbtnNewRadioButton_8.setBounds(356, 42, 37, 21);
		frmEvaluationDunLivre.getContentPane().add(rdbtnNewRadioButton_8);
		rdbtnNewRadioButton_8.setActionCommand("9");
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("10");
		buttonNoteLivre.add(rdbtnNewRadioButton_9);
		rdbtnNewRadioButton_9.setBounds(393, 42, 46, 21);
		frmEvaluationDunLivre.getContentPane().add(rdbtnNewRadioButton_9);
		rdbtnNewRadioButton_9.setActionCommand("10");
		
		
		JLabel lblNewLabel = new JLabel("Quelle note attribuez-vous au livre ?");
		lblNewLabel.setBounds(93, 11, 302, 32);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmEvaluationDunLivre.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(50, 93, 389, 117);
		frmEvaluationDunLivre.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Exprimez-vous en quelques lignes (commentaire)");
		lblNewLabel_1.setBounds(93, 69, 302, 13);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frmEvaluationDunLivre.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Titre du livre ?");
		lblNewLabel_2.setBounds(80, 239, 302, 13);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		frmEvaluationDunLivre.getContentPane().add(lblNewLabel_2);


		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(50, 262, 389, 32);
		frmEvaluationDunLivre.getContentPane().add(textField_1);
		
		Button button = new Button("Valider");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String AvisLivre = textField.getText();
				Integer NoteLivre = Integer.parseInt(buttonNoteLivre.getSelection().getActionCommand());
				String titreLivre = textField_1.getText();
				Avis nouvelA = new Avis(NoteLivre, AvisLivre, new Livre(titreLivre), new Lecteur(c.getLogin(), c.getPassword()));
				if(e.getActionCommand().equals("Valider") && NoteLivre != null) {
					System.out.println(NoteLivre + "\n " + AvisLivre);
					daoA.save(nouvelA);
					frmEvaluationDunLivre.dispose();
					GUIMenuLecteur.main(null);
				}
				else {
					System.out.println("Veuillez attribuer une note svp");
				}
				
			}
		});
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBounds(198, 310, 66, 21);
		frmEvaluationDunLivre.getContentPane().add(button);
		
	}
}
