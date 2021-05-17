package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frameQ7.setBounds(100, 100, 450, 300);
		frameQ7.setTitle("Quel livre est fait pour vous ? (7/10)");
		frameQ7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameQ7.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Si vous deviez choisir, o\u00F9 prefereriez-vous \u00EAtre t\u00E9l\u00E9port\u00E9(e) ?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(42, 10, 349, 15);
		frameQ7.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		buttonGroup.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(GUIQuizz7.class.getResource("/image/entete_img_nouvelle_zelande_waikato_matamata_hobbiton_sjp.28.jpg")));
		btnNewButton.setBounds(10, 145, 302, 110);
		frameQ7.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		buttonGroup.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon(GUIQuizz7.class.getResource("/image/default_2021-02-15_3cc32b4c-b598-4dcc-9abc-74945fa65b51.jpeg")));
		btnNewButton_1.setBounds(10, 35, 187, 100);
		frameQ7.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		buttonGroup.add(btnNewButton_2);
		btnNewButton_2.setIcon(new ImageIcon(GUIQuizz7.class.getResource("/image/image-chateau.jpg")));
		btnNewButton_2.setBounds(332, 111, 94, 53);
		frameQ7.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		buttonGroup.add(btnNewButton_3);
		btnNewButton_3.setIcon(new ImageIcon(GUIQuizz7.class.getResource("/image/mid-danse.jpg")));
		btnNewButton_3.setBounds(322, 35, 104, 72);
		frameQ7.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		buttonGroup.add(btnNewButton_4);
		btnNewButton_4.setIcon(new ImageIcon(GUIQuizz7.class.getResource("/image/poudlard-france-une.jpg")));
		btnNewButton_4.setBounds(332, 174, 94, 53);
		frameQ7.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		buttonGroup.add(btnNewButton_5);
		btnNewButton_5.setIcon(new ImageIcon(GUIQuizz7.class.getResource("/image/unnamed.jpg")));
		btnNewButton_5.setBounds(208, 35, 104, 72);
		frameQ7.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Valider");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameQ7.dispose();
				GUIQuizz8.main(null);
			}
		});
		btnNewButton_6.setBounds(341, 237, 85, 21);
		frameQ7.getContentPane().add(btnNewButton_6);
	}
}
