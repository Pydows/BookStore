package jframe;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import metier.Livre2;

import java.awt.BorderLayout;
import java.awt.Color;

public class GUIAffichageResume {

	private JFrame frmRsumDuLivre;

	/**
	 * Launch the application.
	 */
	public static void main(Livre2 l) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAffichageResume window = new GUIAffichageResume(l);
					window.frmRsumDuLivre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIAffichageResume(Livre2 l) {
		initialize(l);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Livre2 l) {
		frmRsumDuLivre = new JFrame();
		frmRsumDuLivre.setTitle("Résumé du livre");
		frmRsumDuLivre.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIAffichageResume.class.getResource("/image/livre.png")));
		frmRsumDuLivre.setBounds(100, 100, 805, 483);
		frmRsumDuLivre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextArea txt = new JTextArea();
		String resume = l.getVolumeInfo().getDescription();
		if (resume.length() < 1)
		{
			txt.setText("pas de resume disponible");
		}
		else if (resume.length() < 100)
		{
			txt.setText(resume.substring(0,resume.length()));
		}
		else if (resume.length() < 200)
		{
			txt.setText(resume.substring(0,100)+"\n"+resume.substring(100,resume.length()));
		}
		else if (resume.length() < 300)
		{
			txt.setText(resume.substring(0,100)+"\n"+resume.substring(100,200)+"\n"+resume.substring(200,resume.length()));
		}
		else if (resume.length() < 400)
		{
			txt.setText(resume.substring(0,100)+"\n"+resume.substring(100,200)+"\n"+resume.substring(200,300)+"\n"+
					resume.substring(300,resume.length()));
		}
		else if (resume.length() < 500)
		{
			txt.setText(resume.substring(0,100)+"\n"+resume.substring(100,200)+"\n"+resume.substring(200,300)+"\n"+
					resume.substring(300,400)+"\n"+resume.substring(400,resume.length()));
		}
		else if (resume.length() < 600)
		{
			txt.setText(resume.substring(0,100)+"\n"+resume.substring(100,200)+"\n"+resume.substring(200,300)+"\n"+
					resume.substring(300,400)+"\n"+resume.substring(400,500)+"\n"+resume.substring(500,resume.length()));
		}
		else if (resume.length() < 700)
		{
			txt.setText(resume.substring(0,100)+"\n"+resume.substring(100,200)+"\n"+resume.substring(200,300)+"\n"+
					resume.substring(300,400)+"\n"+resume.substring(400,500)+"\n"+resume.substring(500,600)+"\n"+resume.substring(600,resume.length()));
		}
		else if (resume.length() < 800)
		{
			txt.setText(resume.substring(0,100)+"\n"+resume.substring(100,200)+"\n"+resume.substring(200,300)+"\n"+
					resume.substring(300,400)+"\n"+resume.substring(400,500)+"\n"+resume.substring(500,600)+"\n"+
					resume.substring(600,700)+"\n"+resume.substring(700,resume.length()));
		}
		else if (resume.length() < 900)
		{
			txt.setText(resume.substring(0,100)+"\n"+resume.substring(100,200)+"\n"+resume.substring(200,300)+"\n"+
					resume.substring(300,400)+"\n"+resume.substring(400,500)+"\n"+resume.substring(500,600)+"\n"+
					resume.substring(600,700)+"\n"+resume.substring(700,800)+"\n"+resume.substring(800,resume.length()));
		}
		else if (resume.length() < 1000)
		{
			txt.setText(resume.substring(0,100)+"\n"+resume.substring(100,200)+"\n"+resume.substring(200,300)+"\n"+
					resume.substring(300,400)+"\n"+resume.substring(400,500)+"\n"+resume.substring(500,600)+"\n"+
					resume.substring(600,700)+"\n"+resume.substring(700,800)+"\n"+resume.substring(800,900)+"\n"+
					resume.substring(900,resume.length()));
		}
		else
		{
			txt.setText(resume.substring(0,100)+"\n"+resume.substring(100,200)+"\n"+resume.substring(200,300)+"\n"+
					resume.substring(300,400)+"\n"+resume.substring(400,500)+"\n"+resume.substring(500,600)+"\n"+
					resume.substring(600,700)+"\n"+resume.substring(700,800)+"\n"+resume.substring(800,900)+"\n"+
					resume.substring(900,1000)+"\n"+resume.substring(1000,resume.length()));
		}
		//txt.setBounds(100, 100, 805, 483);
		frmRsumDuLivre.getContentPane().add(txt, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("Retour aux livres");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRsumDuLivre.dispose();
				GUIAffichageLivres.main(null);
			}
		});
		frmRsumDuLivre.getContentPane().add(btnNewButton, BorderLayout.SOUTH);

		/*//BOUTON Retour livres
		JButton btnRetourAuxLivres = new JButton("Retour aux livres proposés");
		btnRetourAuxLivres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRsumDuLivre.dispose();
				GUIAffichageLivres.main(null);
			}
		});
		btnRetourAuxLivres.setForeground(Color.BLACK);
		btnRetourAuxLivres.setBackground(Color.RED);
		btnRetourAuxLivres.setBounds(619, 375, 162, 61);
		frmRsumDuLivre.getContentPane().add(btnRetourAuxLivres);*/
	}

}
