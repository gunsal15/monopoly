package view;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainMenuFrame extends JFrame {

	private JPanel contentPane;
	private JButton joinAGameButton;
	private JButton hostAGameButton;
	private JoinGameFrame joinGameFrame;
	private HostGameFrame hostGameFrame;

	/**
	 * Create the frame.
	 */
	public MainMenuFrame() {
		setTitle("Monopoly");
		setMinimumSize(new Dimension(800, 600));
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		try {
			Image logoImage = ImageIO.read(new File("monopolyLogo.png"));
			logoImage = logoImage.getScaledInstance(600, 120, Image.SCALE_SMOOTH);
			JPanel monopolyLogoPanel = new BackgroundImagePanel(logoImage);
			monopolyLogoPanel.setBounds(100, 60, 600, 120);
			contentPane.add(monopolyLogoPanel);

		} catch (IOException e) {
			e.printStackTrace();
		}

		JPanel panel = new JPanel();
		panel.setBounds(300, 250, 200, 200);
		contentPane.add(panel);

		hostAGameButton = new JButton("Host a Game");
		hostAGameButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		hostAGameButton.setBounds(0, 0, 200, 50);

		joinAGameButton = new JButton("Join a Game");
		joinAGameButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		joinAGameButton.setBounds(0, 60, 200, 50);

		panel.setLayout(null);
		panel.add(hostAGameButton);
		panel.add(joinAGameButton);
	}

	public void initHostAGameFrame() {
		setEnabled(false);
		hostGameFrame = new HostGameFrame();
		hostGameFrame.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				hostGameFrame = null;
				setEnabled(true);
			}
		});
	}
	
	public void clientConnectedToHost(int connectionCount) {
		hostGameFrame.clientConnected(connectionCount);
	}

	public void initJoinAGameFrame() {
		setEnabled(false);
		joinGameFrame = new JoinGameFrame();
		joinGameFrame.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				joinGameFrame = null;
				setEnabled(true);
			}
		});
	}

	public JButton getJoinWithIPButton() {
		return joinGameFrame.getJoinWithIPButton();
	}

	public String getIP() {
		return joinGameFrame.getTextFieldText();
	}
	
	public void joinedWithIP() {
		joinGameFrame.setTextFieldText("Connected to host, waiting for game to start.");
		joinGameFrame.getJoinWithIPButton().setEnabled(false);
		joinGameFrame.getTextField().setEditable(false);
	}

	public JButton getJoinAGameButton() {
		return joinAGameButton;
	}

	public JButton getHostAGameButton() {
		return hostAGameButton;
	}
}
