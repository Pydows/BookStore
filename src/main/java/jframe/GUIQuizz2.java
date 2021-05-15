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

public class GUIQuizz2 {

	private JFrame frmQuelLivreEst;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz2 window = new GUIQuizz2();
					window.frmQuelLivreEst.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIQuizz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuelLivreEst = new JFrame();
		frmQuelLivreEst.setTitle("Quel livre est fait pour vous ? (2/6)");
		frmQuelLivreEst.setBounds(100, 100, 426, 356);
		frmQuelLivreEst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuelLivreEst.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quel cadre convient le mieux \u00E0 votre humeur d'aujourd'hui ?");
		lblNewLabel.setBounds(43, 11, 351, 14);
		frmQuelLivreEst.getContentPane().add(lblNewLabel);
		
		JCheckBox btnNewButton = new JCheckBox("Maison");
		buttonGroup.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/image/home.png")));
		btnNewButton.setBounds(24, 28, 180, 124);
		frmQuelLivreEst.getContentPane().add(btnNewButton);
		btnNewButton.setActionCommand("Maison");
		
		JCheckBox btnNewButton_1 = new JCheckBox("Plage");
		buttonGroup.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/image/plage.png")));
		btnNewButton_1.setBounds(24, 153, 180, 124);
		frmQuelLivreEst.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setActionCommand("Plage");
		
		JCheckBox btnNewButton_2 = new JCheckBox("Etranger");
		buttonGroup.add(btnNewButton_2);
		btnNewButton_2.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/image/paysetranger.png")));
		btnNewButton_2.setBounds(214, 28, 180, 124);
		frmQuelLivreEst.getContentPane().add(btnNewButton_2);
		btnNewButton_2.setActionCommand("Etranger");
		
		JCheckBox btnNewButton_3 = new JCheckBox("Nuit");
		buttonGroup.add(btnNewButton_3);
		btnNewButton_3.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/image/nuit.png")));
		btnNewButton_3.setBounds(214, 153, 180, 124);
		frmQuelLivreEst.getContentPane().add(btnNewButton_3);
		btnNewButton_3.setActionCommand("Nuit");
		
		JButton btnNewButton_4 = new JButton("Valider");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Valider")) {
					System.out.println("vous avez choisi comme type de livre : " + 
							buttonGroup.getSelection().getActionCommand());
//					frame.dispose();
//					GUIQuizz2.main(null);
				}
				
			}
		});
		btnNewButton_4.setBounds(24, 288, 370, 23);
		frmQuelLivreEst.getContentPane().add(btnNewButton_4);
	}

}
