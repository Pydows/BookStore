package jframe;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTextField;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import metier.Livre2;

public class GUIAffichageLivres {
	
	private static String requete;
	
	public static String getRequete() {
		return requete;
	}

	public static void setRequete(String requete) {
		GUIAffichageLivres.requete = requete;
	}

	private JFrame frmAffichageLivres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIAffichageLivres window = new GUIAffichageLivres();
					window.frmAffichageLivres.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public GUIAffichageLivres() throws IOException {
		Livre2[] livres = resultatsLivres();
		initialize(livres);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Livre2[] livres) {
		frmAffichageLivres = new JFrame();
		frmAffichageLivres.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIAffichageLivres.class.getResource("/image/livre.png")));
		frmAffichageLivres.setTitle("Choix du livre");
		frmAffichageLivres.setBounds(100, 100, 805, 483);
		frmAffichageLivres.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAffichageLivres.getContentPane().setLayout(null);
		
		//BOUTON Menu Lecteur
		JButton btnRetourAuMenu = new JButton("Retour au Menu");
		btnRetourAuMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAffichageLivres.dispose();
				GUIMenuLecteur.main(null);
			}
		});
		btnRetourAuMenu.setForeground(Color.BLACK);
		btnRetourAuMenu.setBackground(Color.RED);
		btnRetourAuMenu.setBounds(619, 375, 162, 61);
		frmAffichageLivres.getContentPane().add(btnRetourAuMenu);
		
		//BOUTON livre1
		Livre2 l1 = livres[0];
		JButton btnNewButton = new JButton(l1.getVolumeInfo().getTitle() + " ecrit par " + l1.getVolumeInfo().getAuthors().toString());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAffichageLivres.dispose();
				GUIAffichageResume.main(l1);
			}
		});
		btnNewButton.setBounds(22, 21, 738, 59);
		frmAffichageLivres.getContentPane().add(btnNewButton);
		
		//BOUTON livre2
		Livre2 l2 = livres[1];
		JButton btnNewButton_1 = new JButton(l2.getVolumeInfo().getTitle() + " ecrit par " + l2.getVolumeInfo().getAuthors().toString());
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAffichageLivres.dispose();
				GUIAffichageResume.main(l2);
			}
		});
		btnNewButton_1.setBounds(22, 110, 738, 59);
		frmAffichageLivres.getContentPane().add(btnNewButton_1);
		
		//BOUTON livre3
		Livre2 l3 = livres[2];
		JButton btnNewButton_2 = new JButton(l3.getVolumeInfo().getTitle() + " ecrit par " + l3.getVolumeInfo().getAuthors().toString());
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAffichageLivres.dispose();
				GUIAffichageResume.main(l3);
			}
		});
		btnNewButton_2.setBounds(22, 198, 738, 59);
		frmAffichageLivres.getContentPane().add(btnNewButton_2);
		
		//BOUTON livre4
		Livre2 l4 = livres[3];
		JButton btnNewButton_3 = new JButton(l4.getVolumeInfo().getTitle() + " ecrit par " + l4.getVolumeInfo().getAuthors().toString());
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAffichageLivres.dispose();
				GUIAffichageResume.main(l4);
			}
		});
		btnNewButton_3.setBounds(22, 293, 738, 59);
		frmAffichageLivres.getContentPane().add(btnNewButton_3);
	}
	
	//Recup livres
	public Livre2[] resultatsLivres() throws IOException {
		Gson g = new Gson();

		String sURL = "https://www.googleapis.com/books/v1/volumes?q=" + requete + "&language=fr&key=AIzaSyAGLF6JPs832TP11n22Xod8APdAy4hEHbc"; //just a string

		// Connect to the URL using java's native library
		URL url = new URL(sURL);
		URLConnection request = url.openConnection();
		request.connect();

		// Convert to a JSON object to print data
		JsonParser jp = new JsonParser(); //from gson
		JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
		JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object. 
		Livre2[] livres= g.fromJson(rootobj.get("items"), Livre2[].class);
		return livres;
		
	}
	
}
