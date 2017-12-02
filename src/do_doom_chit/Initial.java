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
			 * 시작하기 버튼에 마우스가 들어갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드
			 */
			@Override
			public void mouseEntered(MouseEvent e){
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			/**
			 * 시작하기 버튼에서 마우스가 나올 경우 커서가 다시 원래대로 돌아오게 해주는 메소드
			 */
			public void mouseExited(MouseEvent e){
				startButton.setIcon(startButtonImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}   
			/**
			 * 시작하기 버튼을 누를 경우 introMusic이 종료되고 Selected Music이 재생되고 메인 화면으로 넘어가도록 해주는 메소드
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
			 * 종료하기 버튼에 마우스가 들어갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드
			 */
			@Override
			public void mouseEntered(MouseEvent e){
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
			/**
			 * 종료하기 버튼에서 마우스가 나올 경우 커서가 다시 원래대로 돌아오게 해주는 메소드
			 */
			public void mouseExited(MouseEvent e){
				quitButton.setIcon(quitButtonImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			/**
			 * 종료하기 버튼을 누를 경우 프로그램을 종료시켜주는 메소드
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
	 * 배경화면 그려주는 메소드
	 * @author 공철규
	 */
	class drawback extends JPanel{
		
		public void paintComponent(Graphics g){
			
			super.paintComponents(g);

			g.drawImage(background , 0, 0, this);
		}

	}

}
