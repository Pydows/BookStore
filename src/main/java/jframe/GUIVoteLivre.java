package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIVoteLivre {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIVoteLivre window = new GUIVoteLivre();
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
	public GUIVoteLivre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 444, 295);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(50, 42, 31, 21);
		rdbtnNewRadioButton.setHideActionText(true);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(83, 42, 31, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(116, 42, 31, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("4");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(149, 42, 31, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("5");
		buttonGroup.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(182, 42, 31, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("6");
		buttonGroup.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setBounds(215, 42, 31, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("7");
		buttonGroup.add(rdbtnNewRadioButton_6);
		rdbtnNewRadioButton_6.setBounds(248, 42, 31, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("8");
		buttonGroup.add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.setBounds(281, 42, 31, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("9");
		buttonGroup.add(rdbtnNewRadioButton_8);
		rdbtnNewRadioButton_8.setBounds(314, 42, 31, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("10");
		buttonGroup.add(rdbtnNewRadioButton_9);
		rdbtnNewRadioButton_9.setBounds(347, 42, 37, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_9);
		
		JLabel lblNewLabel = new JLabel("Quelle note attribuez-vous au livre ?");
		lblNewLabel.setBounds(63, 10, 302, 32);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(50, 93, 334, 117);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Exprimez-vous en quelques lignes");
		lblNewLabel_1.setBounds(60, 70, 302, 13);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_1);
		
		Button button = new Button("Valider");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBounds(193, 227, 66, 21);
		frame.getContentPane().add(button);
	}
}
