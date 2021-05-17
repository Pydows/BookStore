package jframe;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class GUIQuizz10 {

	private JFrame frameQ10;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz10 window = new GUIQuizz10();
					window.frameQ10.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIQuizz10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameQ10 = new JFrame();
		frameQ10.setBounds(100, 100, 450, 300);
		frameQ10.setTitle("Quel livre est fait pour vous ? (10/10)");
		frameQ10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameQ10.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selon vous, quel est le trait le plus important chez le personnage principal ?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 436, 21);
		frameQ10.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Son humour");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 37, 103, 21);
		frameQ10.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Son courage");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(10, 78, 103, 21);
		frameQ10.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Sa sensibilit\u00E9");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(10, 121, 103, 21);
		frameQ10.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Son charisme");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(10, 166, 103, 21);
		frameQ10.getContentPane().add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameQ10.dispose();
				GUILogin.main(null);
			}
		});
		btnNewButton.setBounds(341, 232, 85, 21);
		frameQ10.getContentPane().add(btnNewButton);
	}

}
