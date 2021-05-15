package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class GUIQuizz1 {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz1 window = new GUIQuizz1();
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
	public GUIQuizz1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Définissez le frame
		frame = new JFrame("Quel livre est fait pour vous ? (1/6) ");
		frame.setBounds(50, 50, 750, 271);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vous voulez une recommandations pour quel type de livre ?");
		lblNewLabel.setBounds(26, 33, 355, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Roman");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(54, 86, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setActionCommand("roman");
		
		JRadioButton rdbtnManga = new JRadioButton("Manga");
		buttonGroup.add(rdbtnManga);
		rdbtnManga.setBounds(54, 133, 109, 23);
		frame.getContentPane().add(rdbtnManga);
		rdbtnManga.setActionCommand("manga");
		
		JRadioButton rdbtnBd = new JRadioButton("BD");
		buttonGroup.add(rdbtnBd);
		rdbtnBd.setBounds(214, 86, 109, 23);
		frame.getContentPane().add(rdbtnBd);
		rdbtnBd.setActionCommand("bd");
		
		JRadioButton rdbtnRecueilDePosie = new JRadioButton("Recueil de poesie");
		buttonGroup.add(rdbtnRecueilDePosie);
		rdbtnRecueilDePosie.setBounds(214, 133, 143, 23);
		frame.getContentPane().add(rdbtnRecueilDePosie);
		rdbtnRecueilDePosie.setActionCommand("recueil de poesie");
		
		JRadioButton rdbtnPieceDeTheatre = new JRadioButton("piece de theatre");
		buttonGroup.add(rdbtnPieceDeTheatre);
		rdbtnPieceDeTheatre.setBounds(428, 106, 155, 23);
		frame.getContentPane().add(rdbtnPieceDeTheatre);
		rdbtnPieceDeTheatre.setActionCommand("piece de theatre");
		
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Valider")) {
					System.out.println("vous avez choisi comme type de livre : " + 
							buttonGroup.getSelection().getActionCommand());
//					frame.dispose();
//					GUIQuizz2.main(null);
				}
			}
		});
		
		btnNewButton.setBounds(245, 176, 155, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
}
