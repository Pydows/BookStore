package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class GUIDebutQuizz {

	private JFrame frmExplicationDuQuizz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIDebutQuizz window = new GUIDebutQuizz();
					window.frmExplicationDuQuizz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIDebutQuizz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExplicationDuQuizz = new JFrame();
		frmExplicationDuQuizz.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIDebutQuizz.class.getResource("/image/livre.png")));
		frmExplicationDuQuizz.setTitle("Explication du Quizz");
		frmExplicationDuQuizz.setBounds(100, 100, 510, 183);
		frmExplicationDuQuizz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExplicationDuQuizz.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ce Quizz de 10 questions va permettre de vous proposer un livre en fonction");
		lblNewLabel.setBounds(20, 23, 482, 28);
		frmExplicationDuQuizz.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("de vos envies du moment. Vous ne pourrez r\u00E9pondre qu'\u00E0 1 r\u00E9ponse par question.");
		lblNewLabel_1.setBounds(20, 47, 482, 14);
		frmExplicationDuQuizz.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Enjoy");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmExplicationDuQuizz.dispose();
				GUIQuizz1.main(null);
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(48, 72, 162, 61);
		frmExplicationDuQuizz.getContentPane().add(btnNewButton);
		
		JButton btnRetourAuMenu = new JButton("Retour au Menu");
		btnRetourAuMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmExplicationDuQuizz.dispose();
				GUIMenuLecteur.main(null);
			}
		});
		btnRetourAuMenu.setForeground(Color.BLACK);
		btnRetourAuMenu.setBackground(Color.RED);
		btnRetourAuMenu.setBounds(269, 72, 162, 61);
		frmExplicationDuQuizz.getContentPane().add(btnRetourAuMenu);
	}

}
