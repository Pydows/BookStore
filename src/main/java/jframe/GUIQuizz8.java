package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIQuizz8 {

	private JFrame frameQ8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz8 window = new GUIQuizz8();
					window.frameQ8.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIQuizz8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameQ8 = new JFrame();
		frameQ8.setBounds(100, 100, 450, 300);
		frameQ8.setTitle("Quel livre est fait pour vous ? (8/10)");
		frameQ8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameQ8.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Un vol a \u00E9t\u00E9 commis et un coupable d\u00E9sign\u00E9 sans preuve :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(0, 0, 436, 25);
		frameQ8.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Vous menez l'enqu\u00EAte pour vous assurer que le veritable coupable soit retrouv\u00E9 et jug\u00E9");
		rdbtnNewRadioButton.setBounds(10, 31, 426, 21);
		frameQ8.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Vous en profitez pour ressortir toutes les casseroles de cette personne");
		rdbtnNewRadioButton_1.setBounds(10, 67, 430, 21);
		frameQ8.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Vous d\u00E9fendez le pauvre bougre ");
		rdbtnNewRadioButton_2.setBounds(10, 103, 426, 21);
		frameQ8.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Vous criez au scandale et demandez une sanction imm\u00E9diate");
		rdbtnNewRadioButton_3.setBounds(10, 138, 426, 21);
		frameQ8.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Vous vous rendez imm\u00E9diatement chez l'accus\u00E9 pour lui voler tous ses biens");
		rdbtnNewRadioButton_4.setBounds(10, 172, 407, 21);
		frameQ8.getContentPane().add(rdbtnNewRadioButton_4);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameQ8.dispose();
				GUIQuizz9.main(null);
			}
		});
		btnNewButton.setBounds(188, 232, 85, 21);
		frameQ8.getContentPane().add(btnNewButton);
	}
}
