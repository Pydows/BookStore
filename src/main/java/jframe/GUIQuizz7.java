package jframe;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class GUIQuizz7 {

	private JFrame frameQ7;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz7 window = new GUIQuizz7();
					window.frameQ7.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIQuizz7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameQ7 = new JFrame();
		frameQ7.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIQuizz7.class.getResource("/image/livre.png")));
		frameQ7.setBounds(1, 1, 413, 258);
		frameQ7.setTitle("Quel livre est fait pour vous ? (7/10)");
		frameQ7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameQ7.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Si vous deviez choisir, o\u00F9 prefereriez-vous \u00EAtre t\u00E9l\u00E9port\u00E9(e) ?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(42, 10, 349, 15);
		frameQ7.getContentPane().add(lblNewLabel);

		//BOUTON SUIVANT
		JButton btnNewButton_6 = new JButton("Suivant");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Q7 = buttonGroup.getSelection().getActionCommand();
				GUIAffichageLivres.setRequete(GUIAffichageLivres.getRequete()+Q7);

				frameQ7.dispose();
				GUIQuizz8.main(null);
			}
		});
		btnNewButton_6.setBounds(306, 195, 85, 21);
		frameQ7.getContentPane().add(btnNewButton_6);


		//BOUTON 0 fiction		
		JCheckBox btnNewButton = new JCheckBox("");
		btnNewButton.setContentAreaFilled(false);
		buttonGroup.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(GUIQuizz7.class.getResource("/image/entete_img_nouvelle_zelande_waikato_matamata_hobbiton_sjp.28.jpg")));
		btnNewButton.setBounds(10, 126, 109, 53);
		frameQ7.getContentPane().add(btnNewButton);
		btnNewButton.setActionCommand("fiction+");

		//BOUTON 1 futuriste		
		JCheckBox btnNewButton_1 = new JCheckBox("");
		btnNewButton_1.setContentAreaFilled(false);
		buttonGroup.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon(GUIQuizz7.class.getResource("/image/default_2021-02-15_3cc32b4c-b598-4dcc-9abc-74945fa65b51.jpeg")));
		btnNewButton_1.setBounds(10, 35, 109, 77);
		frameQ7.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setActionCommand("futuriste+");

		//BOUTON 2 Peur		
		JCheckBox btnNewButton_2 = new JCheckBox("");
		btnNewButton_2.setContentAreaFilled(false);
		buttonGroup.add(btnNewButton_2);
		btnNewButton_2.setIcon(new ImageIcon(GUIQuizz7.class.getResource("/image/image-chateau.jpg")));
		btnNewButton_2.setBounds(284, 40, 94, 53);
		frameQ7.getContentPane().add(btnNewButton_2);
		btnNewButton_2.setActionCommand("peur+");

		//BOUTON 3 Bal		
		JCheckBox btnNewButton_3 = new JCheckBox("");
		btnNewButton_3.setContentAreaFilled(false);
		buttonGroup.add(btnNewButton_3);
		btnNewButton_3.setIcon(new ImageIcon(GUIQuizz7.class.getResource("/image/mid-danse.jpg")));
		btnNewButton_3.setBounds(147, 136, 104, 72);
		frameQ7.getContentPane().add(btnNewButton_3);
		btnNewButton_3.setActionCommand("bal+");

		//BOUTON 4 Sorcier		
		JCheckBox btnNewButton_4 = new JCheckBox("");
		btnNewButton_4.setContentAreaFilled(false);
		buttonGroup.add(btnNewButton_4);
		btnNewButton_4.setIcon(new ImageIcon(GUIQuizz7.class.getResource("/image/poudlard-france-une.jpg")));
		btnNewButton_4.setBounds(271, 136, 94, 53);
		frameQ7.getContentPane().add(btnNewButton_4);
		btnNewButton_4.setActionCommand("sorcier+");

		//BOUTON 5 Dragon		
		JCheckBox btnNewButton_5 = new JCheckBox("");
		btnNewButton_5.setContentAreaFilled(false);
		buttonGroup.add(btnNewButton_5);
		btnNewButton_5.setIcon(new ImageIcon(GUIQuizz7.class.getResource("/image/unnamed.jpg")));
		btnNewButton_5.setBounds(147, 40, 104, 72);
		frameQ7.getContentPane().add(btnNewButton_5);
		btnNewButton_5.setActionCommand("dragon+");


	}
}
