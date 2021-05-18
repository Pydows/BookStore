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
import java.awt.Color;
import java.awt.Toolkit;

public class GUIQuizz2 {

	private JFrame frameQ2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz2 window = new GUIQuizz2();
					window.frameQ2.setVisible(true);
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
		frameQ2 = new JFrame();
		frameQ2.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIQuizz2.class.getResource("/image/livre.png")));
		frameQ2.setTitle("Quel livre est fait pour vous ? (2/10)");
		frameQ2.setBounds(100, 100, 426, 356);
		frameQ2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameQ2.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quel cadre convient le mieux \u00E0 votre humeur d'aujourd'hui ?");
		lblNewLabel.setBounds(43, 11, 351, 14);
		frameQ2.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("Suivant");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Q2 = buttonGroup.getSelection().getActionCommand();
					//System.out.println("Aujourd'hui, vous vous sentez plus d'humeur " + Q2);
				GUIAffichageLivres.setRequete(GUIAffichageLivres.getRequete()+Q2);
				
					frameQ2.dispose();
					GUIQuizz3.main(null);
	
				
			}
		});
		btnNewButton_4.setBounds(24, 288, 370, 23);
		frameQ2.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("A la maison");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(70, 136, 96, 14);
		frameQ2.getContentPane().add(lblNewLabel_1);
		
		JCheckBox btnNewButton = new JCheckBox("Maison");
		btnNewButton.setContentAreaFilled(false);
		buttonGroup.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/image/home.png")));
		btnNewButton.setBounds(24, 26, 180, 124);
		frameQ2.getContentPane().add(btnNewButton);
		btnNewButton.setActionCommand("calme+");
		
		JLabel lblNewLabel_1_1 = new JLabel("A l'etranger");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1_1.setBounds(267, 136, 96, 14);
		frameQ2.getContentPane().add(lblNewLabel_1_1);
		
		JCheckBox btnNewButton_2 = new JCheckBox("Etranger");
		btnNewButton_2.setContentAreaFilled(false);
		buttonGroup.add(btnNewButton_2);
		btnNewButton_2.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/image/paysetranger.png")));
		btnNewButton_2.setBounds(214, 28, 180, 124);
		frameQ2.getContentPane().add(btnNewButton_2);
		btnNewButton_2.setActionCommand("voyage+");
		
		JLabel lblNewLabel_1_2 = new JLabel("A la Plage");
		lblNewLabel_1_2.setForeground(Color.BLUE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1_2.setBounds(70, 263, 96, 14);
		frameQ2.getContentPane().add(lblNewLabel_1_2);
		
		JCheckBox btnNewButton_1 = new JCheckBox("Plage");
		btnNewButton_1.setContentAreaFilled(false);
		buttonGroup.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/image/plage.png")));
		btnNewButton_1.setBounds(24, 153, 180, 124);
		frameQ2.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setActionCommand("plage+");
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Dans la nature la nuit");
		lblNewLabel_1_2_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1_2_1.setBounds(230, 263, 164, 14);
		frameQ2.getContentPane().add(lblNewLabel_1_2_1);
		
		JCheckBox btnNewButton_3 = new JCheckBox("Nuit");
		btnNewButton_3.setContentAreaFilled(false);
		buttonGroup.add(btnNewButton_3);
		btnNewButton_3.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/image/nuit.png")));
		btnNewButton_3.setBounds(214, 153, 180, 124);
		frameQ2.getContentPane().add(btnNewButton_3);
		btnNewButton_3.setActionCommand("nuit+");
	}
}
