package view;

import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JoinGameFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel monopolyLogoPanel;

	/**
	 * Create the frame.
	 */
	public JoinGameFrame() {
		setTitle("Join Game");
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 102, 420, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Join with IP");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(145, 160, 150, 45);
		contentPane.add(btnNewButton);
		
		try {
			Image logoImage = ImageIO.read(new File("monopolyLogo.png"));
			logoImage = logoImage.getScaledInstance(350, 70, Image.SCALE_SMOOTH);
			monopolyLogoPanel = new BackgroundImagePanel(logoImage);
			monopolyLogoPanel.setBounds(45, 15, 350, 70);
			contentPane.add(monopolyLogoPanel);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		setVisible(true);
	}

}
