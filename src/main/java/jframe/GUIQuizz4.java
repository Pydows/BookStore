package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class GUIQuizz4 {

	private JFrame frameQ4;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz4 window = new GUIQuizz4();
					window.frameQ4.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIQuizz4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Définissez le frame
				frameQ4 = new JFrame("Quel livre est fait pour vous ? (4/10) ");
				frameQ4.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIQuizz3.class.getResource("/image/livre.png")));
				frameQ4.setBounds(50, 50, 462, 223);
				frameQ4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frameQ4.getContentPane().setLayout(null);

				JLabel lblNewLabel = new JLabel("Quel programme télé vous plaît le plus ? ");
				lblNewLabel.setBounds(103, 11, 355, 32);
				frameQ4.getContentPane().add(lblNewLabel);

				JRadioButton rdbtnchtis = new JRadioButton("Les Marseillais et le CHt'is");
				buttonGroup.add(rdbtnchtis);
				rdbtnchtis.setBounds(10, 37, 456, 23);
				frameQ4.getContentPane().add(rdbtnchtis);
				rdbtnchtis.setActionCommand("marseillais");

				JRadioButton rdbtnamourpre = new JRadioButton("L'amour est dans le pre");
				buttonGroup.add(rdbtnamourpre);
				rdbtnamourpre.setBounds(10, 63, 355, 23);
				frameQ4.getContentPane().add(rdbtnamourpre);
				rdbtnamourpre.setActionCommand("l'amour est dans le pre");

				JRadioButton rdbtnenquete = new JRadioButton("Enquetes criminelles");
				buttonGroup.add(rdbtnenquete);
				rdbtnenquete.setBounds(10, 89, 355, 23);
				frameQ4.getContentPane().add(rdbtnenquete);
				rdbtnenquete.setActionCommand("Enquetes criminelles");

				JRadioButton rdbtnhistoire = new JRadioButton("Secrets d'histoire");
				buttonGroup.add(rdbtnhistoire);
				rdbtnhistoire.setBounds(10, 115, 359, 23);
				frameQ4.getContentPane().add(rdbtnhistoire);
				rdbtnhistoire.setActionCommand("Secrets d'histoire");


				JButton btnNewButton = new JButton("Valider");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (e.getActionCommand().equals("Valider")) {
							String Q4 = buttonGroup.getSelection().getActionCommand();
							if(Q4 == "marseillais") {
								System.out.println("Tu aimes vraiment les "+ Q4 + " ?!? No Jugement'");
							}
								
							else {
								System.out.println("Vous préferez " + Q4);
							}
							
							frameQ4.dispose();
							GUIQuizz5.main(null);
						}
					}
				});

				btnNewButton.setBounds(10, 150, 355, 23);
				frameQ4.getContentPane().add(btnNewButton);

			}
}
