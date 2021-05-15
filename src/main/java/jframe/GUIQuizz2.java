package jframe;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class GUIQuizz2 extends JFrame implements ActionListener
{  

	private static ButtonGroup group2;

	public GUIQuizz2()  {

		JFrame f = new JFrame("Quel livre est fait pour vous ? (2/6)"); 
		JLabel label = new JLabel("(2) Quel cadre convient le mieux à votre humeur ?", JLabel.CENTER);
		f.setSize(800,775);  
		f.getContentPane().setLayout(null);  
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  


		f.getContentPane().setLayout(new GridLayout(3, 1));
		f.getContentPane().add(label);


		JButton home = new JButton("chez vous");
		home.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/jframe/home.png")));
		home.setActionCommand("maison");
		JButton etranger = new JButton("à l'étranger");
		etranger.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/jframe/paysetranger.png")));
		home.setActionCommand("etranger");
		JButton plage = new JButton("à la plage");
		plage.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/jframe/plage.png")));
		etranger.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/jframe/plage.png")));
		home.setActionCommand("plage");
		JButton nuit = new JButton("la nuit");
		nuit.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/jframe/nuit.png")));
		etranger.setIcon(new ImageIcon(GUIQuizz2.class.getResource("/jframe/nuit.png")));
		home.setActionCommand("nuit");
		
		f.getContentPane().add(etranger);  
		f.getContentPane().add(plage);  
		f.getContentPane().add(home);  
		f.getContentPane().add(nuit);
		
		home.setVerticalTextPosition(SwingConstants.BOTTOM);
		home.setHorizontalTextPosition(SwingConstants.CENTER);
		etranger.setVerticalTextPosition(SwingConstants.BOTTOM);
		etranger.setHorizontalTextPosition(SwingConstants.CENTER);
		plage.setVerticalTextPosition(SwingConstants.BOTTOM);
		plage.setHorizontalTextPosition(SwingConstants.CENTER);
		nuit.setVerticalTextPosition(SwingConstants.BOTTOM);
		nuit.setHorizontalTextPosition(SwingConstants.CENTER);

		home.setBounds(100,50,150,200);  
		etranger.setBounds(350,50,150,200);
		plage.setBounds(600,50,150,200);
		nuit.setBounds(600,50,150,200);

		f.setVisible(true);  

		JButton button = new JButton("Valider");
		button.setBounds(375, 275, 100, 50);
		f.getContentPane().add(button);
		button.addActionListener(this);
		
		group2 = new ButtonGroup();
		
		group2.add(home);
		group2.add(etranger);
		group2.add(plage);
		group2.add(nuit);
		
		f.getContentPane().add(home);
		f.getContentPane().add(etranger);
		f.getContentPane().add(plage);
		f.getContentPane().add(nuit);
		f.getContentPane().add(button);
		

		




	}
	public static void main(String[] args) {  
		new Test();  
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Valider")) {
			System.out.println("Le radio bouton sélectionné est : " + 
					group2.getSelection().getActionCommand());
//			frame.dispose();
//			GUIQuizz2.main(null);
		}

	}
}
