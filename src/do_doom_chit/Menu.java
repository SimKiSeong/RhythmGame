package do_doom_chit;

<<<<<<< HEAD
import java.awt.Color;
=======
>>>>>>> Kong
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
<<<<<<< HEAD
import java.awt.event.MouseMotionAdapter;
=======
>>>>>>> Kong
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
<<<<<<< HEAD
import javax.swing.JLabel;

/**
 * 전체적인 화면을 담당하는 클래스입니다 history : 공철규, 1.0 2017.11.3 초기 작성
 * 
 * @since 2017-10-14
 * @author 공철규
 */
public class Menu extends JFrame {

	private Graphics screenGraphic;
	private Image screenImage;
	private Image background = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();

	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));

	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButton.png"));
	private ImageIcon startButtonImage = new ImageIcon(Main.class.getResource("../images/startButton.png"));
	private ImageIcon startButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../images/startButtonEntered.png"));
	private ImageIcon quitButtonImage = new ImageIcon(Main.class.getResource("../images/quitButton.png"));
	private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
	private ImageIcon leftButtonImage = new ImageIcon(Main.class.getResource("../images/previous.png"));
	private ImageIcon leftButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/previousEntered.png"));
	private ImageIcon rightButtonImage = new ImageIcon(Main.class.getResource("../images/skip.png"));
	private ImageIcon rightButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/skipEntered.png"));
	private ImageIcon itemButtonImage = new ImageIcon(Main.class.getResource("../images/itemButton.png"));
	private ImageIcon itemButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/itemButtonEntered.png"));
	private ImageIcon normalButtonImage = new ImageIcon(Main.class.getResource("../images/normalButton.png"));
	private ImageIcon normalButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../images/normalButtonEntered.png"));

	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton startButton = new JButton(startButtonImage);
	private JButton quitButton = new JButton(quitButtonImage);
	private JButton leftButton = new JButton(leftButtonImage);
	private JButton rightButton = new JButton(rightButtonImage);
	private JButton normalButton = new JButton(normalButtonImage);
	private JButton itemButton = new JButton(itemButtonImage);

	private int mouseX, mouseY;

	private boolean isMainScreen = false;
	ArrayList<Track> trackList = new ArrayList<Track>();

	private Music selectedMusic;
	private Image titleImage;
	private Image selectedImage;
	private int nowSelected = 0;

	/**
	 * 프로그램 실행 시 시작 화면 생성 및 배경음악을 틀어주는 기본 생성자 Track Class에 음악에 대한 정보를 추가
	 */
	public Menu() {
		setUndecorated(true);
		setTitle("Do_Doom_Chit");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		Music introMusic = new Music("introMusic.mp3", true);
		introMusic.start();

		trackList.add(new Track("someTitle.png", "some Bolbbalgan4 image.jpg", "Bolbbagan4Startimage.png",
				"SomeSelected.mp3", "Seo.mp3")); // 타占쏙옙틀占싱뱄옙占쏙옙, 占쌕뱄옙占싱뱄옙占쏙옙,
													// 占쏙옙占쏙옙占싱뱄옙占쏙옙, 占쏙옙占쏙옙
													// 占쎈래, 占쏙옙체占쎈래
		trackList.add(new Track("likeyTitle.png", "LIKEY TWICE Selected images.jpg", "Bolbbagan4Startimage.png",
				"LIKEYSelected.mp3", "LIKEY.mp3"));
		trackList.add(new Track("bbalTitle.png", "bbar redvelbet Selected images.jpg", "Bolbbagan4Startimage.png",
				"RED Selected.mp3", "RED.mp3"));

		menuBar.setBounds(0, 0, 1280, 30);

		menuBar.addMouseListener(new MouseAdapter() {
			/**
			 * menuBar를 눌러주어 마우스가 위치한 x좌표와 y좌표를 찾아주는 메소드
			 * 
			 * @param int
			 *            mouseX 마우스가 위치한 x좌표
			 * @param int
			 *            mouseY 마우스가 위치한 y좌표
			 */
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();

			}
		});
		/**
		 * 전체 프레임을 menuBar를 드래그 해주어 마우스위치에 이동시켜주는 메소드
		 * 
		 * @param int
		 *            x 전체 프레임을 이동시킬 x좌표
		 * @param int
		 *            y 전체 프레임을 이동시킬 y좌표
		 */
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});

		exitButton.setBounds(1248, 0, 32, 32);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			/**
			 * menuBar 우측 아이콘에 마우스가 들어갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드
			 */
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			/**
			 * menuBar 우측 아이콘에서 마우스가 나올 경우 커서가 다시 원래대로 돌아오게 해주는 메소드
			 */
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			/**
			 * exit아이콘을 누를 경우 프로그램을 종료시켜주는메소드
			 */
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});

		startButton.setBounds(830, 350, 400, 100);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			/**
			 * 시작하기 버튼에 마우스가 들어갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드
			 */
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			/**
			 * 시작하기 버튼에서 마우스가 나올 경우 커서가 다시 원래대로 돌아오게 해주는 메소드
			 */
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			/**
			 * 시작하기 버튼을 누를 경우 introMusic이 종료되고 Selected Music이 재생되고 메인 화면으로
			 * 넘어가도록 해주는 메소드
			 */
			public void mousePressed(MouseEvent e) {
				startButton.setVisible(false);
				quitButton.setVisible(false);
				background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();
				isMainScreen = true;
				leftButton.setVisible(true);
				rightButton.setVisible(true);
				normalButton.setVisible(true);
				itemButton.setVisible(true);
				introMusic.close();
				selectedTrack(0);

			}
		});
		quitButton.setBounds(830, 500, 400, 100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter() {
			/**
			 * 종료하기 버튼에 마우스가 들어갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드
			 */
			@Override
			public void mouseEntered(MouseEvent e) {
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			/**
			 * 종료하기 버튼에서 마우스가 나올 경우 커서가 다시 원래대로 돌아오게 해주는 메소드
			 */
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			/**
			 * 종료하기 버튼을 누를 경우 프로그램을 종료시켜주는 메소드
			 */
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});

		leftButton.setBounds(230, 640, 64, 64);
		leftButton.setBorderPainted(false);
		leftButton.setContentAreaFilled(false);
		leftButton.setFocusPainted(false);
		leftButton.addMouseListener(new MouseAdapter() {
			/**
			 * 메인화면에서 왼쪽 화살표 버튼에 마우스가 올라갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드
			 */
			@Override
			public void mouseEntered(MouseEvent e) {
				leftButton.setIcon(leftButtonEnteredImage);
				leftButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			/**
			 * 메인화면에서 왼쪽 화살표 버튼에서 마우스가 나올경우 커서가 다시 원래대로 돌아오게 해주는 메소드
			 */
			public void mouseExited(MouseEvent e) {
				leftButton.setIcon(leftButtonImage);
				leftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			/**
			 * 왼쪽 화살표 버튼을 누를 경우 Track Class 배열의 index를 -1해주어 음악을 넘기는 메소드
			 */
			public void mousePressed(MouseEvent e) {
				selectedLeft();
			}
		});

		add(leftButton);
		leftButton.setVisible(false);

		rightButton.setBounds(436, 640, 64, 64); // 占쏙옙튼 占쏙옙치
		rightButton.setBorderPainted(false);
		rightButton.setContentAreaFilled(false);
		rightButton.setFocusPainted(false);
		rightButton.addMouseListener(new MouseAdapter() {
			/**
			 * 메인화면에서 오른쪽 화살표 버튼에 마우스가 올라갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드
			 */
			@Override
			public void mouseEntered(MouseEvent e) {
				rightButton.setIcon(rightButtonEnteredImage);
				rightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			/**
			 * 메인화면에서 왼쪽 화살표 버튼에서 마우스가 나올경우 커서가 다시 원래대로 돌아오게 해주는 메소드
			 */
			public void mouseExited(MouseEvent e) {
				rightButton.setIcon(rightButtonImage);
				rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			/**
			 * 오른쪽 화살표 버튼을 누를 경우 Track Class 배열의 index를 +1해주어 음악을 넘기는 메소드
			 */
			public void mousePressed(MouseEvent e) {
				selectedRight();
			}
		});
		add(rightButton);
		rightButton.setVisible(false);

		normalButton.setBounds(830, 350, 400, 100);
		normalButton.setBorderPainted(false);
		normalButton.setContentAreaFilled(false);
		normalButton.setFocusPainted(false);
		normalButton.addMouseListener(new MouseAdapter() {
			/**
			 * 메인화면에서 Normal 버튼에 마우스가 올라갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드
			 */
			@Override
			public void mouseEntered(MouseEvent e) {
				normalButton.setIcon(normalButtonEnteredImage);
				normalButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			/**
			 * 메인화면에서 Normal 버튼에서 마우스가 나올경우 커서가 다시 원래대로 돌아오게 해주는 메소드
			 */
			public void mouseExited(MouseEvent e) {
				normalButton.setIcon(normalButtonImage);
				normalButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			/**
			 * Normal 버튼이 눌러질 경우 선택된 음악을 normal mode로 실행시켜주는 메소드
			 */
			public void mousePressed(MouseEvent e) {
				gamestart(nowSelected, "normal");
				if (nowSelected == 0) {
					Anziyoung anzi = new Anziyoung(false);
					anzi.start();
				} else if (nowSelected == 1) {
					Twice tt = new Twice(false);
					tt.start();
				} else if (nowSelected == 2) {
					RED vel = new RED(false);
					vel.start();
				}

			}
				
			
		});
		add(normalButton);
		normalButton.setVisible(false);

		itemButton.setBounds(830, 500, 400, 100); // 占쏙옙튼 占쏙옙치
		itemButton.setBorderPainted(false);
		itemButton.setContentAreaFilled(false);
		itemButton.setFocusPainted(false);
		itemButton.addMouseListener(new MouseAdapter() {
			/**
			 * 메인화면에서 Item 버튼에 마우스가 올라갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드
			 */
			@Override
			public void mouseEntered(MouseEvent e) {
				itemButton.setIcon(itemButtonEnteredImage);
				itemButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			/**
			 * 메인화면에서 Item 버튼에서 마우스가 나올경우 커서가 다시 원래대로 돌아오게 해주는 메소드
			 */
			public void mouseExited(MouseEvent e) {
				itemButton.setIcon(itemButtonImage);
				itemButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			/**
			 * Item 버튼이 눌러질 경우 선택된 음악을 Item mode로 실행시켜주는 메소드
			 */
			public void mousePressed(MouseEvent e) {
				gamestart(nowSelected, "item");
				if (nowSelected == 0) {
					Anziyoung anzi = new Anziyoung(true);
					anzi.start();
				} else if (nowSelected == 1) {
					Twice tt = new Twice(true);
					tt.start();
				} else if (nowSelected == 2) {
					RED vel = new RED(true);
					vel.start();
				}

			}
		});
		add(itemButton);

		itemButton.setVisible(false);
		add(exitButton);
		add(menuBar);
		add(startButton);
		add(quitButton);

	}

	/**
	 * 이미지의 크기를 설정하여 이미지를 불러와 그려주는 메소드
	 * 
	 * @param g
	 */
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	/**
	 * 메인화면에서 선택된 음악의 앨범이미지와 타이틀이미지를 그려주는 메소드
	 * 
	 * @param g
	 */
	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		if (isMainScreen) {
			g.drawImage(selectedImage, 140, 170, null);
			g.drawImage(titleImage, 140, 80, null);
		}
		paintComponents(g);
		this.repaint();
	}

	/**
	 * 현재 선택된 음악에 대해 Track Class에 저장된 음악의 타이틀 이미지, 앨범 이미지, Selected Music을 불러오고
	 * 음악을 시작해주는 메소드
	 * 
	 * @param nowSelected
	 */
	public void selectedTrack(int nowSelected) {
		if (selectedMusic != null)
			selectedMusic.close();
		titleImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getTitleImage()))
				.getImage();
		selectedImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getStartImage()))
				.getImage();
		selectedMusic = new Music(trackList.get(nowSelected).getStartMusic(), true);
		selectedMusic.start();

	}

	/**
	 * 왼쪽화살표 버튼이 선택된 음악에서 trackList에 저장된 이전 음악으로 이동할 수 있는 기능을 갖도록 해주는메소드
	 */
	public void selectedLeft() {
		if (nowSelected == 0)
			nowSelected = trackList.size() - 1;
		else
			nowSelected--;
		selectedTrack(nowSelected);
	}

	/**
	 * 왼쪽화살표 버튼이 선택된 음악에서 trackList에 저장된 다음 음악으로 이동할 수 있는 기능을 갖도록 해주는메소드
	 */
	public void selectedRight() {
		if (nowSelected == trackList.size() - 1)
			nowSelected = 0;
		else
			nowSelected++;
		selectedTrack(nowSelected);
	}

	/**
	 * 현재 선택된 음악과 모드에 대해 게임을 실행 할 수 있도록 해주는 메소드
	 * 
	 * @param nowSelected
	 * @param normal
	 */
	public void gamestart(int nowSelected, String normal) {
		if (selectedMusic != null)
			selectedMusic.close();
		isMainScreen = false;
		leftButton.setVisible(false);
		rightButton.setVisible(false);
		normalButton.setVisible(false);
		itemButton.setVisible(false);
		dispose();
	}

=======
import javax.swing.JPanel;
/**
 * 전체적인 화면을 담당하는 클래스입니다
 *  history : 공철규, 1.0 2017.11.3 초기 작성
 * @since 2017-10-14 
 * @author 공철규
 */
public class Menu extends JPanel {


   public Graphics screenGraphic;
   public Image screenImage;

   public ImageIcon leftButtonImage = new ImageIcon(Main.class.getResource("../images/previous.png"));
   public ImageIcon leftButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/previousEntered.png"));
   public ImageIcon rightButtonImage = new ImageIcon(Main.class.getResource("../images/skip.png"));
   public ImageIcon rightButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/skipEntered.png"));
   public ImageIcon itemButtonImage = new ImageIcon(Main.class.getResource("../images/itemButton.png"));
   public ImageIcon itemButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/itemButtonEntered.png"));
   public ImageIcon normalButtonImage = new ImageIcon(Main.class.getResource("../images/normalButton.png"));
   public ImageIcon normalButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/normalButtonEntered.png"));
   public Image background = new ImageIcon(Main.class.getResource("../images/mainBackground.jpg")).getImage();

   public JButton leftButton = new JButton(leftButtonImage);
   public JButton rightButton = new JButton(rightButtonImage);
   public JButton normalButton = new JButton(normalButtonImage);
   public JButton itemButton = new JButton(itemButtonImage);
   
   ArrayList<Track> trackList = new ArrayList<Track>();
   
   public Music selectedMusic; 
   public Image titleImage;
   public Image selectedImage;
   public int nowSelected = 0; 
   
   /**
 * 프로그램 실행 시 시작 화면 생성 및 배경음악을 틀어주는 기본 생성자
 * Track Class에 음악에 대한 정보를 추가
 */
   public Menu() {
	   	  
      trackList.add(new Track("someTitle.png", "some Bolbbalgan4 image.jpg", "Bolbbagan4Startimage.png", "SomeSelected.mp3", "Seo.mp3")); 
      trackList.add(new Track("likeyTitle.png", "LIKEY TWICE Selected images.jpg", "Bolbbagan4Startimage.png", "LIKEYSelected.mp3", "LIKEY.mp3"));
      trackList.add(new Track("bbalTitle.png", "bbar redvelbet Selected images.jpg", "Bolbbagan4Startimage.png", "RED Selected.mp3", "RED.mp3"));

    
      /**
       * 시작하기 버튼을 누를 경우 introMusic이 종료되고 Selected Music이 재생되고 메인 화면으로 넘어가도록 해주는 메소드
       */
        
         selectedTrack(0);
  

   leftButton.setBounds(230,620,64,64); 
   leftButton.setBorderPainted(false);
   leftButton.setContentAreaFilled(false);
   leftButton.setFocusPainted(false);
   leftButton.addMouseListener(new MouseAdapter(){
      /**
       * 메인화면에서 왼쪽 화살표 버튼에 마우스가 올라갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드
       */
      @Override
      public void mouseEntered(MouseEvent e){
         leftButton.setIcon(leftButtonEnteredImage);
         leftButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

      }
      /**
       * 메인화면에서 왼쪽 화살표 버튼에서 마우스가 나올경우 커서가 다시 원래대로 돌아오게 해주는 메소드
       */
      public void mouseExited(MouseEvent e){
         leftButton.setIcon(leftButtonImage);
         leftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

      }
      /**
       * 왼쪽 화살표 버튼을 누를 경우 Track Class 배열의 index를 -1해주어 음악을 넘기는 메소드
       */
      public void mousePressed(MouseEvent e){
         selectedLeft();
      }
   });

   
   rightButton.setBounds(436,620,64,64); 
   rightButton.setBorderPainted(false);
   rightButton.setContentAreaFilled(false);
   rightButton.setFocusPainted(false);
   rightButton.addMouseListener(new MouseAdapter(){
      /**
       * 메인화면에서 오른쪽 화살표 버튼에 마우스가 올라갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드
       */
      @Override
      public void mouseEntered(MouseEvent e){
         rightButton.setIcon(rightButtonEnteredImage);
         rightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

      }
      /**
       * 메인화면에서 왼쪽 화살표 버튼에서 마우스가 나올경우 커서가 다시 원래대로 돌아오게 해주는 메소드
       */
      public void mouseExited(MouseEvent e){
         rightButton.setIcon(rightButtonImage);
         rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

      }
      /**
       * 오른쪽 화살표 버튼을 누를 경우 Track Class 배열의 index를 +1해주어 음악을 넘기는 메소드
       */
      public void mousePressed(MouseEvent e){
         selectedRight();
      }
   });

   normalButton.setBounds(830,350,400,100);
   normalButton.setBorderPainted(false);
   normalButton.setContentAreaFilled(false);
   normalButton.setFocusPainted(false);
   normalButton.addMouseListener(new MouseAdapter(){
      /**
       * 메인화면에서 Normal 버튼에 마우스가 올라갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드 
       */
      @Override
      public void mouseEntered(MouseEvent e){
         normalButton.setIcon(normalButtonEnteredImage);
         normalButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

      }
      /**
       * 메인화면에서 Normal 버튼에서 마우스가 나올경우 커서가 다시 원래대로 돌아오게 해주는 메소드
       */
      public void mouseExited(MouseEvent e){
         normalButton.setIcon(normalButtonImage);
         normalButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

      }
      /**
       * Normal 버튼이 눌러질 경우 선택된 음악을 normal mode로 실행시켜주는 메소드
       */
      public void mousePressed(MouseEvent e){
       gamestart(nowSelected,"normal");
      }
   });

   itemButton.setBounds(830,500,400,100); 
   itemButton.setBorderPainted(false);
   itemButton.setContentAreaFilled(false);
   itemButton.setFocusPainted(false);
   itemButton.addMouseListener(new MouseAdapter(){
      /**
       * 메인화면에서 Item 버튼에 마우스가 올라갈 경우 커서 모양을 손바닥 모양으로 바꿔주는 메소드 
       */
      @Override
      public void mouseEntered(MouseEvent e){
         itemButton.setIcon(itemButtonEnteredImage);
         itemButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

      }
      /**
       * 메인화면에서 Item 버튼에서 마우스가 나올경우 커서가 다시 원래대로 돌아오게 해주는 메소드
       */
      public void mouseExited(MouseEvent e){
         itemButton.setIcon(itemButtonImage);
         itemButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
      }
      /**
       * Item 버튼이 눌러질 경우 선택된 음악을 Item mode로 실행시켜주는 메소드
       */
         public void mousePressed(MouseEvent e){
         gamestart(nowSelected,"item");
         }
      });
   

      JPanel pan = new menupanel();
      pan.setSize(Initial.SCREEN_WIDTH,Initial.SCREEN_HEIGHT);
      pan.setVisible(true);
      pan.setLayout(null);
      pan.add(itemButton);
      pan.add(normalButton);
      pan.add(leftButton);
      pan.add(rightButton);
      add(pan);
      
   }
   
   /**
    * 이미지의 좌표를 설정해 그려주는 메소드
    * @param g
    */
	class menupanel extends JPanel{
		
		public void paintComponent(Graphics g){
			
			super.paintComponents(g);

			g.drawImage(background , 0, 0, this); 
		      g.drawImage(selectedImage, 140,160, null);
		      g.drawImage(titleImage, 140, 70, null);
		      repaint();
   
		
		}}
   /**
    * 현재 선택된 음악에 대해 Track Class에 저장된 음악의 타이틀 이미지, 앨범 이미지, Selected Music을 불러오고 음악을 시작해주는 메소드 
    * @param nowSelected
    */
   public void selectedTrack(int nowSelected){
      if(selectedMusic != null)
         selectedMusic.close();
      titleImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getTitleImage())).getImage();
      selectedImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getStartImage())).getImage();
      selectedMusic = new Music(trackList.get(nowSelected).getStartMusic(),true);
      selectedMusic.start();
   
   }
   /**
    * 왼쪽화살표 버튼이 선택된 음악에서 trackList에 저장된 이전 음악으로 이동할 수 있는 기능을 갖도록 해주는메소드
    */
   public void selectedLeft(){
      if(nowSelected == 0)
         nowSelected = trackList.size()-1;
      else
         nowSelected--;
      selectedTrack(nowSelected);
   }
   /**
    * 왼쪽화살표 버튼이 선택된 음악에서 trackList에 저장된 다음 음악으로 이동할 수 있는 기능을 갖도록 해주는메소드
    */
   public void selectedRight(){
      if(nowSelected == trackList.size()-1)
         nowSelected = 0;
      else
         nowSelected++ ;
      selectedTrack(nowSelected);
   }

   /**
    * 현재 선택된 음악과 모드에 대해 게임을 실행 할 수 있도록 해주는 메소드
    * @param nowSelected
    * @param normal
*/    
   public void gamestart(int nowSelected,String normal){
      if(selectedMusic !=null)
         selectedMusic.close();
      leftButton.setVisible(false);
      rightButton.setVisible(false);
      normalButton.setVisible(false);
      itemButton.setVisible(false);
      
    
      if(nowSelected == 0){
         Anziyoung anzi = new Anziyoung();
         anzi.start();
      }else if(nowSelected == 1){
         Twice tt = new Twice();
         tt.start();
      }else if(nowSelected == 2){
         RED vel = new RED();
         vel.start();
      }
      
}
>>>>>>> Kong
}