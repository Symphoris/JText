import javax.swing.*;
public class EssaiSwing2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("ma fenetre");
		f.setSize(300, 200);
		JPanel panneau = new JPanel();
		JTextField testField = new JTextField("mon texte ");
		panneau.add(testField);
		f.getContentPane().add(panneau);
		f.setVisible(true);

	}

}
