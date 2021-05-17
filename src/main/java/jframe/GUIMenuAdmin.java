package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIMenuAdmin {

	private JFrame frmAjoutAdministrateur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMenuAdmin window = new GUIMenuAdmin();
					window.frmAjoutAdministrateur.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIMenuAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAjoutAdministrateur = new JFrame();
		frmAjoutAdministrateur.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIMenuAdmin.class.getResource("/image/livre.png")));
		frmAjoutAdministrateur.setTitle("Menu Administrateur");
		frmAjoutAdministrateur.setBounds(100, 100, 450, 143);
		frmAjoutAdministrateur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAjoutAdministrateur.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Ajout Administrateur");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAjoutAdministrateur.dispose();
				GUIAjoutAdmin.main(null);
			}
		});
		btnNewButton.setBounds(10, 23, 188, 59);
		frmAjoutAdministrateur.getContentPane().add(btnNewButton);
		
		JButton btnAjoutLivre = new JButton("Ajout Livre");
		btnAjoutLivre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAjoutAdministrateur.dispose();
				GUIAjoutLivre.main(null);
			}
		});
		btnAjoutLivre.setBounds(208, 23, 216, 59);
		frmAjoutAdministrateur.getContentPane().add(btnAjoutLivre);
	}

}
