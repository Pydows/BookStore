package jframe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIQuizz5 {

	private JFrame frameQ5;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz5 window = new GUIQuizz5();
					window.frameQ5.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIQuizz5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameQ5 = new JFrame();
		frameQ5.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIQuizz2.class.getResource("/image/livre.png")));
		frameQ5.setTitle("Quel livre est fait pour vous ? (5/10)");
		frameQ5.setBounds(100, 100, 904, 611);
		frameQ5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameQ5.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quelle est l'image de couverture qui te donne le plus envie de lire ?");
		lblNewLabel.setBounds(290, 24, 671, 14);
		frameQ5.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("Valider");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Q5 = buttonGroup.getSelection().getActionCommand();
				if (e.getActionCommand().equals("Valider")) {
					System.out.println("Vous preferez plus un livre qui parle d'" + 
							Q5);
					frameQ5.dispose();
//					GUIQuizz6.main(null);
				}
				
			}
		});
		btnNewButton_4.setBounds(10, 540, 840, 23);
		frameQ5.getContentPane().add(btnNewButton_4);
		
		JCheckBox btnChill = new JCheckBox("Chill");
		btnChill.setContentAreaFilled(false);
		buttonGroup.add(btnChill);
		btnChill.setIcon(new ImageIcon(GUIQuizz5.class.getResource("/image/image1.png")));
		btnChill.setBounds(97, 60, 164, 124);
		frameQ5.getContentPane().add(btnChill);
		btnChill.setActionCommand("histoire chill");
		
		JCheckBox btnamitie = new JCheckBox("Amitie");
		btnamitie.setContentAreaFilled(false);
		buttonGroup.add(btnamitie);
		btnamitie.setIcon(new ImageIcon(GUIQuizz5.class.getResource("/image/image3.png")));
		btnamitie.setBounds(655, 77, 195, 433);
		frameQ5.getContentPane().add(btnamitie);
		btnamitie.setActionCommand("amitié");
		
		JCheckBox btnguerre = new JCheckBox("flingue");
		btnguerre.setContentAreaFilled(false);
		buttonGroup.add(btnguerre);
		btnguerre.setIcon(new ImageIcon(GUIQuizz5.class.getResource("/image/image4.png")));
		btnguerre.setBounds(97, 249, 200, 178);
		frameQ5.getContentPane().add(btnguerre);
		btnguerre.setActionCommand("histoire de guerre");
		
		JCheckBox btnAventure = new JCheckBox("Aventure");
		btnAventure.setContentAreaFilled(false);
		buttonGroup.add(btnAventure);
		btnAventure.setIcon(new ImageIcon(GUIQuizz5.class.getResource("/image/image5.png")));
		btnAventure.setBounds(397, 226, 180, 281);
		frameQ5.getContentPane().add(btnAventure);
		btnAventure.setActionCommand("aventure");
		
		JCheckBox btnFantastique = new JCheckBox("Fantastique");
		btnFantastique.setContentAreaFilled(false);
		buttonGroup.add(btnFantastique);
		btnFantastique.setIcon(new ImageIcon(GUIQuizz5.class.getResource("/image/image2.png")));
		btnFantastique.setBounds(397, 77, 180, 124);
		frameQ5.getContentPane().add(btnFantastique);
		btnFantastique.setActionCommand("histoire fantastique");
	}
}
