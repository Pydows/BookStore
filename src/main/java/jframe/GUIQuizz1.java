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
import java.awt.Toolkit;

public class GUIQuizz1 {

	private JFrame frameQ1;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz1 window = new GUIQuizz1();
					window.frameQ1.setVisible(true);
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
		// D�finissez le frame
		frameQ1 = new JFrame("Quel livre est fait pour vous ? (1/6) ");
		frameQ1.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIQuizz1.class.getResource("/image/livre.png")));
		frameQ1.setTitle("Quel livre est fait pour vous ? (1/10) ");
		frameQ1.setBounds(50, 50, 750, 271);
		frameQ1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameQ1.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Vous voulez une recommandations pour quel type de livre ?");
		lblNewLabel.setBounds(26, 33, 355, 32);
		frameQ1.getContentPane().add(lblNewLabel);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Roman");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(54, 86, 109, 23);
		frameQ1.getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setActionCommand("roman+");

		JRadioButton rdbtnManga = new JRadioButton("Manga");
		buttonGroup.add(rdbtnManga);
		rdbtnManga.setBounds(54, 133, 109, 23);
		frameQ1.getContentPane().add(rdbtnManga);
		rdbtnManga.setActionCommand("manga+");

		JRadioButton rdbtnBd = new JRadioButton("BD");
		buttonGroup.add(rdbtnBd);
		rdbtnBd.setBounds(214, 86, 109, 23);
		frameQ1.getContentPane().add(rdbtnBd);
		rdbtnBd.setActionCommand("bd+bande+dessinee+");

		JRadioButton rdbtnRecueilDePosie = new JRadioButton("Recueil de poesie");
		buttonGroup.add(rdbtnRecueilDePosie);
		rdbtnRecueilDePosie.setBounds(214, 133, 143, 23);
		frameQ1.getContentPane().add(rdbtnRecueilDePosie);
		rdbtnRecueilDePosie.setActionCommand("recueil+poesie+");

		JRadioButton rdbtnPieceDeTheatre = new JRadioButton("piece de theatre");
		buttonGroup.add(rdbtnPieceDeTheatre);
		rdbtnPieceDeTheatre.setBounds(428, 106, 155, 23);
		frameQ1.getContentPane().add(rdbtnPieceDeTheatre);
		rdbtnPieceDeTheatre.setActionCommand("piece+theatre+");


		JButton btnNewButton = new JButton("Suivant");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Q1 = buttonGroup.getSelection().getActionCommand();
				//System.out.println("Vous voulez une recommandation pour un " + Q1);
				GUIAffichageLivres.setRequete(/*GUIAffichageLivres.getRequete()+*/Q1);
				
				frameQ1.dispose();
				GUIQuizz2.main(null);

				
			}
		});

		btnNewButton.setBounds(245, 176, 155, 23);
		frameQ1.getContentPane().add(btnNewButton);

	}
}
