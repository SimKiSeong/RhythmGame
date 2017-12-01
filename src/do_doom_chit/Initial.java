package do_doom_chit;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Initial extends JFrame {

	public ImageIcon startButtonImage = new ImageIcon(Main.class.getResource("../images/startButton.png"));
	public ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/startButtonEntered.png"));
	public ImageIcon quitButtonImage = new ImageIcon(Main.class.getResource("../images/quitButton.png"));
	public ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));

	public JButton startButton = new JButton(startButtonImage);
	public JButton quitButton = new JButton(quitButtonImage);

	public Music introMusic;

	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;

	public static Image background = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();

	public Initial(){

		introMusic = new Music("introMusic.mp3", true);
		introMusic.start();		

		setTitle("Do_Doom_Chit");
		setSize(SCREEN_WIDTH,SCREEN_HEIGHT); 
		setResizable(false);
		setLocationRelativeTo(null); 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		drawback initialpanel = new drawback();
		startButton.setBounds(830,350,400,100); 
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(true);
		startButton.addMouseListener(new MouseAdapter(){
			/**
			 * �����ϱ� ��ư�� ���콺�� �� ��� Ŀ�� ����� �չٴ� ������� �ٲ��ִ� �޼ҵ�
			 */
			@Override
			public void mouseEntered(MouseEvent e){
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			/**
			 * �����ϱ� ��ư���� ���콺�� ���� ��� Ŀ���� �ٽ� ������� ���ƿ��� ���ִ� �޼ҵ�
			 */
			public void mouseExited(MouseEvent e){
				startButton.setIcon(startButtonImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}   
			/**
			 * �����ϱ� ��ư�� ���� ��� introMusic�� ����ǰ� Selected Music�� ����ǰ� ���� ȭ������ �Ѿ���� ���ִ� �޼ҵ�
			 */
			public void mousePressed(MouseEvent e){
				introMusic.close();	  
				remove(initialpanel);
				repaint();
		        JPanel menupanel = new Menu();
		        menupanel.setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
		        add(menupanel);
		        menupanel.setVisible(true);
		        menupanel.repaint();
			}
		});

		quitButton.setBounds(830,500,400,100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter(){
			/**
			 * �����ϱ� ��ư�� ���콺�� �� ��� Ŀ�� ����� �չٴ� ������� �ٲ��ִ� �޼ҵ�
			 */
			@Override
			public void mouseEntered(MouseEvent e){
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
			/**
			 * �����ϱ� ��ư���� ���콺�� ���� ��� Ŀ���� �ٽ� ������� ���ƿ��� ���ִ� �޼ҵ�
			 */
			public void mouseExited(MouseEvent e){
				quitButton.setIcon(quitButtonImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			/**
			 * �����ϱ� ��ư�� ���� ��� ���α׷��� ��������ִ� �޼ҵ�
			 */
			public void mouseClicked(MouseEvent e){
				System.exit(0);
			}
		});	
		initialpanel.setSize(SCREEN_WIDTH,SCREEN_HEIGHT );
		initialpanel.setLayout(null);
		initialpanel.add(startButton);
		initialpanel.add(quitButton);

		add(initialpanel);

	}
	/**
	 * ���ȭ�� �׷��ִ� �޼ҵ�
	 * @author ��ö��
	 */
	class drawback extends JPanel{
		
		public void paintComponent(Graphics g){
			
			super.paintComponents(g);

			g.drawImage(background , 0, 0, this);
		}

	}

}
