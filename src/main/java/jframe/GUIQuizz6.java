package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Font;

public class GUIQuizz6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz6 window = new GUIQuizz6();
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
	public GUIQuizz6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tu pref\u00E8res une histoire :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(0, 0, 436, 13);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Courte et assez rapide \u00E0 lire");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton.setBounds(6, 37, 203, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Plut\u00F4t longue qui te tiendra sur de nombreuses pages");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton_1.setBounds(211, 38, 203, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Style saga, qui t'accompagnera sur plusieurs tomes");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton_2.setBounds(6, 83, 203, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Que tu pourras suivre sur de nombreux tomes et de nombreuses ann\u00E9es");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton_3.setBounds(211, 83, 203, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
	}

}
