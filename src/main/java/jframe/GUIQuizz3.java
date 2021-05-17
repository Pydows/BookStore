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

public class GUIQuizz3 {

	private JFrame frameQ3;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz3 window = new GUIQuizz3();
					window.frameQ3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIQuizz3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Définissez le frame
		frameQ3 = new JFrame("Quel livre est fait pour vous ? (3/10) ");
		frameQ3.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIQuizz3.class.getResource("/image/livre.png")));
		frameQ3.setTitle("Quel livre est fait pour vous ? (3/10) ");
		frameQ3.setBounds(50, 50, 462, 223);
		frameQ3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameQ3.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Comment vous sentez-vous ? ");
		lblNewLabel.setBounds(103, 11, 355, 32);
		frameQ3.getContentPane().add(lblNewLabel);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Heureux, plein de ressources et curieux du monde qui vous entoure");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 37, 456, 23);
		frameQ3.getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setActionCommand("heureux");

		JRadioButton rdbtnManga = new JRadioButton("Melancolique/songeur");
		buttonGroup.add(rdbtnManga);
		rdbtnManga.setBounds(10, 63, 355, 23);
		frameQ3.getContentPane().add(rdbtnManga);
		rdbtnManga.setActionCommand("melancolique");

		JRadioButton rdbtnBd = new JRadioButton("Content/normal");
		buttonGroup.add(rdbtnBd);
		rdbtnBd.setBounds(10, 89, 355, 23);
		frameQ3.getContentPane().add(rdbtnBd);
		rdbtnBd.setActionCommand("normal");

		JRadioButton rdbtnRecueilDePosie = new JRadioButton("Ennuye / en manque d'extraordinaire");
		buttonGroup.add(rdbtnRecueilDePosie);
		rdbtnRecueilDePosie.setBounds(10, 115, 359, 23);
		frameQ3.getContentPane().add(rdbtnRecueilDePosie);
		rdbtnRecueilDePosie.setActionCommand("ennuye");


		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Valider")) {
					String Q3 = buttonGroup.getSelection().getActionCommand();
					System.out.println("Aujourd'hui vous etes plutôt " + 
							Q3);
					frameQ3.dispose();
					GUIQuizz4.main(null);
				}
			}
		});

		btnNewButton.setBounds(10, 150, 355, 23);
		frameQ3.getContentPane().add(btnNewButton);

	}
}
