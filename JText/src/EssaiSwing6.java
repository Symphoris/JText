import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class EssaiSwing6 implements ActionListener {
	JPasswordField passwordField = new JPasswordField("");
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		EssaiSwing6 jpf2 = new EssaiSwing6();
		//jpf2.init();
	}
	public EssaiSwing6() {
		JFrame f = new JFrame("ma fenetre");
		f.setSize(300,200);
		passwordField.setPreferredSize(new Dimension(100,20));
		panel.add(passwordField);
		JButton bouton = new JButton("afficher");
		bouton.addActionListener(this);
		panel.add(bouton, BorderLayout.SOUTH);
		f.getContentPane().add(panel);
		f.setVisible(true);
	}
	

	
	public void actionPerformed(ActionEvent e) {
		System.out.println("texte saisi = " + String.copyValueOf(
				passwordField.getPassword()));
		
	}

}
