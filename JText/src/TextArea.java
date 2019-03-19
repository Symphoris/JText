import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TextArea {

	public static void main(String[] args) {
		JFrame f = new JFrame ("ma fenetre");
		f.setSize(300, 100);
		JPanel panel = new JPanel();
		JTextArea textArea = new JTextArea("");
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new Dimension(100,50));
		panel.add(scrollPane);
		f.getContentPane().add(panel);
		f.setVisible(true);
		

	}

}
