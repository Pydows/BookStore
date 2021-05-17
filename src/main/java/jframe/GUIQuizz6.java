package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class GUIQuizz6 {

	private JFrame frameQ6;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz6 window = new GUIQuizz6();
					window.frameQ6.setVisible(true);
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
		frameQ6 = new JFrame();
		frameQ6.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIQuizz6.class.getResource("/image/livre.png")));
		frameQ6.setBounds(100, 100, 450, 300);
		frameQ6.setTitle("Quel livre est fait pour vous ? (6/10)");
		frameQ6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameQ6.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vous pr\u00E9f\u00E9rez une histoire :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(0, 10, 436, 29);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frameQ6.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Courte et assez rapide \u00E0 lire");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton.setBounds(16, 52, 203, 29);
		frameQ6.getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setActionCommand("histoire rapide à lire");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Plut\u00F4t longue qui te tiendra sur de nombreuses pages");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton_1.setBounds(16, 83, 410, 44);
		frameQ6.getContentPane().add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setActionCommand("histoire longue");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Style saga, qui t'accompagnera sur 3-5 tomes");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton_2.setBounds(16, 129, 410, 44);
		frameQ6.getContentPane().add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setActionCommand("histoire style saga");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Que tu pourras suivre sur de nombreux tomes et de nombreuses ann\u00E9es");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnNewRadioButton_3.setBounds(16, 175, 410, 44);
		frameQ6.getContentPane().add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setActionCommand("histoire sur plusieurs tomes");
		
		JButton btnNewButton = new JButton("Suivant");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Q6 = buttonGroup.getSelection().getActionCommand();
				System.out.println(Q6);
				frameQ6.dispose();
				GUIQuizz7.main(null);
			}
		});
		btnNewButton.setBounds(175, 232, 85, 21);
		frameQ6.getContentPane().add(btnNewButton);
		
	}
}
