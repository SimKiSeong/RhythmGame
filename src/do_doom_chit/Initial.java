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

/**
 * 초기 화면을 담담하는 클래스입니다.
 * @author 공철규
 */
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

	public Container contentPane;
	
	public static JFrame menu;
	/**
	 * 클래스 기본 생성자 입니다.
	 */
	public Initial(){

		introMusic = new Music("introMusic.mp3", true);
		/**
		 * 시작음악을 실행시켜주는 메소드입니다.
		 */
		introMusic.start();		

		menu = this;
		
		contentPane = getContentPane();

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
			 * 마우스가 시작하기 버튼에 올라갈 경우 이미지와 커서모양을 바꿔주는 메소드입니다.
			 */
			@Override
			public void mouseEntered(MouseEvent e){
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			/**
			 * 마우스가 시작하기 버튼에서 나왔을 경우 원래 이미지와 커서로 바꿔주는 메소드입니다.
			 */
			public void mouseExited(MouseEvent e){
				startButton.setIcon(startButtonImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}   
			/**
			 * 시작하기 버튼 클릭 시 배경음악을 종료하고 추가했던 패널을 지운 뒤 새로운 패널을 불러와 그려주는 메소드입니다. 
			 */
			public void mousePressed(MouseEvent e){
				introMusic.close();	  
				remove(initialpanel);
				repaint();
		        JPanel menupanel = new Menu(menu);
		        menupanel.setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
		        contentPane.add(menupanel);
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
			 * 종료하기 버튼에 마우스가 올라갈 경우 이미지와 커서모양을 바꿔주는 메소드입니다.
			 */
			@Override
			public void mouseEntered(MouseEvent e){
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
			/**
			 * 마우스가 종료하기 버튼에서 나왔을 경우 원래 이미지와 커서로 바꿔주는 메소드입니다.
			 */
			public void mouseExited(MouseEvent e){
				quitButton.setIcon(quitButtonImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			/**
			 * 종료하기 버튼 클릭 시 프로그램을 종료시켜주는 메소드 입니다.
			 */
			public void mouseClicked(MouseEvent e){
				System.exit(0);
			}
		});	
		initialpanel.setSize(SCREEN_WIDTH,SCREEN_HEIGHT );
		initialpanel.setLayout(null);
		initialpanel.add(startButton);
		initialpanel.add(quitButton);

		contentPane.add(initialpanel);

	}
	/**
	 * contentPane에 이미지를 그려주는 메소드 입니다.
	 * @author 공철규
	 */
	class drawback extends JPanel{
		
		public void paintComponent(Graphics g){
			/**
			 * contentPane에 시작화면을 그려주는 메소드 입니다.		 
			 * @param g
			 */
			super.paintComponents(g);

			g.drawImage(background , 0, 0, this);
		}

	}

}
