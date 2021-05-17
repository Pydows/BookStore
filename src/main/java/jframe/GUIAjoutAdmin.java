package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIAjoutAdmin {

	private JFrame frmAjoutAdministrateur;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAjoutAdmin window = new GUIAjoutAdmin();
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
	public GUIAjoutAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAjoutAdministrateur = new JFrame();
		frmAjoutAdministrateur.setTitle("Ajout Administrateur");
		frmAjoutAdministrateur.setBounds(100, 100, 344, 200);
		frmAjoutAdministrateur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAjoutAdministrateur.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User");
		lblNewLabel.setBounds(31, 35, 80, 14);
		frmAjoutAdministrateur.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(31, 74, 80, 14);
		frmAjoutAdministrateur.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(121, 32, 162, 20);
		frmAjoutAdministrateur.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(121, 71, 162, 20);
		frmAjoutAdministrateur.getContentPane().add(passwordField);
		
		JLabel error = new JLabel("");
		error.setForeground(Color.RED);
		error.setBounds(51, 136, 267, 14);
		frmAjoutAdministrateur.getContentPane().add(error);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NvUserAdmin = textField.getText();
				String NvPasswordAdmin = passwordField.getText();
				
				if (NvUserAdmin.equals("")||NvPasswordAdmin.equals(""))
				{
					error.setText("Veuillez remplir tous les champs svp");					
				}
				else
				{
					frmAjoutAdministrateur.dispose();
					GUILogin.main(null);
					
				}
				
				
				
			}
		});
		btnNewButton.setBounds(41, 102, 155, 35);
		frmAjoutAdministrateur.getContentPane().add(btnNewButton);
		
	}
}
