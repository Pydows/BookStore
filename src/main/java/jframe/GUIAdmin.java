package jframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUIAdmin extends JFrame implements ActionListener {


		private JPanel pan;
		public GUIAdmin(){
			this.setSize(100,100);
			getContentPane().setLayout(new FlowLayout());

			JCheckBox a = new JCheckBox();
			a.addActionListener(this);
			this.getContentPane().add(a);

			JRadioButton un = new JRadioButton();
			JRadioButton deux = new JRadioButton();
			un.addActionListener(this);
			deux.addActionListener(this);

			ButtonGroup grp =new ButtonGroup();
			grp.add(un);
			grp.add(deux);

			this.getContentPane().add(un);
			this.getContentPane().add(deux);

			this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		
	}
		public static void main(String[] args)
		{
			GUIAdmin a = new GUIAdmin();
			a.setVisible(true);
			a.setSize(800, 600);
		}
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(arg0.getSource());
		}
	}
