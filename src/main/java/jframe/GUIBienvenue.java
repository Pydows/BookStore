package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIBienvenue {

	private JFrame frmBienvenueSurLa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIBienvenue window = new GUIBienvenue();
					window.frmBienvenueSurLa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIBienvenue() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBienvenueSurLa = new JFrame();
		frmBienvenueSurLa.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIBienvenue.class.getResource("/image/livre.png")));
		frmBienvenueSurLa.setTitle("Bienvenue sur le BookStore");
		frmBienvenueSurLa.setBounds(100, 100, 807, 568);
		frmBienvenueSurLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBienvenueSurLa.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Connection ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBienvenueSurLa.dispose();
				GUILogin.main(null);
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton_1.setBounds(262, 35, 266, 109);
		frmBienvenueSurLa.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Pas encore de compte ? Creez-en 1 ici :");
		lblNewLabel.setBounds(262, 155, 237, 14);
		frmBienvenueSurLa.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Creation de Compte");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBienvenueSurLa.dispose();
				GUICreaCompte.main(null);
			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setBounds(521, 151, 164, 23);
		frmBienvenueSurLa.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setIcon(new ImageIcon(GUIBienvenue.class.getResource("/image/livre.png")));
		btnNewButton.setBounds(0, 0, 794, 536);
		frmBienvenueSurLa.getContentPane().add(btnNewButton);
	}

}
