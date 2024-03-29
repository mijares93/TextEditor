package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainWindow {

	private JFrame frame;
	private JTextPane textPane;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenuBar menuBar;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textPane = new JTextPane();
		textPane.setBounds(0, 0, 450, 256);
		frame.getContentPane().add(textPane);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Open File");
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_2 = new JMenuItem("Save File");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_1 = new JMenuItem("Close File");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mnNewMenu_2 = new JMenu("Edit");
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_4 = new JMenuItem("Undo - Ctrl-Z");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_5 = new JMenuItem("Redo - Ctrl-Y");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		mnNewMenu_1 = new JMenu("About");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_3 = new JMenuItem("About...");
		mnNewMenu_1.add(mntmNewMenuItem_3);
	}
}
