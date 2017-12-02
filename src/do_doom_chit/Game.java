package do_doom_chit;

<<<<<<< HEAD
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
=======
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
>>>>>>> Kong
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

<<<<<<< HEAD
/**
 * 게임의 기본이 되는 클래스 이 클래스를 객채로 생성하게 되면 게임을 할 수 있게 된다. history : 심기성, 1.0 2017.11.3
 * 초기 작성
 * 
 * @since 2017-10-14
=======
import java.awt.Font;

/**
 * 게임의 기본이 되는 클래스
 * 이 클래스를 객채로 생성하게 되면 게임을 할 수 있게 된다.
 * 
>>>>>>> Kong
 * @date 2017.11.16
 * @author 심기성
 * @version 1.0
 *
 */
public class Game extends JFrame {

<<<<<<< HEAD
	// 필요한 이미지
	private Image screenImage;
	private Graphics screenGraphic;

	// 배경화면
	Back backGroundPane;
	GameOver overBack;
	
	//시간관련
	long cTime; // 현제시간
	long pTime; // 경과시간
	long itemTime;// 아이템용
	long nowtime;

	// 이미지 불러오기
	private Image notebasic = new ImageIcon(Main.class.getResource("../images/noteImage.png")).getImage();
	private Image noteNurff = new ImageIcon(Main.class.getResource("../images/noteNurff.png")).getImage();
	private Image noteBuff = new ImageIcon(Main.class.getResource("../images/noteBuff.png")).getImage();
	private Image backGround = new ImageIcon(Main.class.getResource("../images/backGround.png")).getImage();
	private Image gameOver = new ImageIcon(Main.class.getResource("../images/gameOverBack.png")).getImage();
	private Image gameClear = new ImageIcon(Main.class.getResource("../images/gameClear.png")).getImage();
	private ImageIcon reStartImg = new ImageIcon(Main.class.getResource("../images/reStart.png"));
	private ImageIcon reStartrollover = new ImageIcon(Main.class.getResource("../images/reStartrollover.png"));
	private Image keyS = new ImageIcon(Main.class.getResource("../images/keyS.png")).getImage();

	private ImageIcon buf100 = new ImageIcon(Main.class.getResource("../images/+100.png"));
	private ImageIcon bufMiss = new ImageIcon(Main.class.getResource("../images/b.miss.png"));
	private ImageIcon bufDouble = new ImageIcon(Main.class.getResource("../images/double.png"));
	private ImageIcon bufNoMiss = new ImageIcon(Main.class.getResource("../images/no miss.png"));
	private ImageIcon nuf100 = new ImageIcon(Main.class.getResource("../images/-100.png"));
	private ImageIcon nufMiss = new ImageIcon(Main.class.getResource("../images/n.miss.png"));
	private ImageIcon nufCom = new ImageIcon(Main.class.getResource("../images/no com.png"));
	private ImageIcon nufHalf = new ImageIcon(Main.class.getResource("../images/half.png"));
	
	// 노트 생성
	MyPanel[][] Note = new MyPanel[4][300];
	int NoteTime[][];
	long time[][];
	Boolean is[][];
	Boolean nice[][];
	Boolean press[];
	Boolean image[];
	Boolean buff[][];
	Boolean nurff[][];
	boolean end = false;
	
	boolean bufmiss = false;
	boolean doubleScore = false;
	boolean halfScore = false;
	boolean nufcombo = false;
	
	//콜 타임
	int Call[];

	
	// 음악 파일
	private Music introMusic;
	boolean musicStart = true;

	// 스코어 관련
	double score = 0;
	int miss = 0;
	int combo = 0;

	// 아이템 관련
	boolean itemMode = false;
	JLabel itemState;
=======
	

	private Image screenImage;
	private Graphics screenGraphic;

	/**
	 * 배경및 키 이펰트를 출력해주는 백그라운드 판 
	 */
	Back backGroundPane;
	
	/**
	 * 노트 떨어지는 시간에 관여할 현재 시간입니다
	 * 이 시간은 프로그램 생성시 시간이 담기게 됩니다.
	 *  
	 */
	long time = System.currentTimeMillis();
	
	// 이미지 불러오기
	private Image notebasic = new ImageIcon(Main.class.getResource("../images/noteImage.png")).getImage();
	private Image backGround = new ImageIcon(Main.class.getResource("../images/gameStartImage.png")).getImage();
	private Image keyS = new ImageIcon(Main.class.getResource("../images/keyS.png")).getImage();
	
	// 노트 생성
	MyPanel[] aNote = new MyPanel[100];
	int aNoteTime[];
	long timeA[];
	Boolean isA[];
	Boolean niceA[];
	Boolean pressA;
	Boolean imageA;
	
	
	MyPanel[] sNote = new MyPanel[100];
	int sNoteTime[];
	Boolean isS[];
	Boolean niceS[];
	long timeS[];
	Boolean pressS;
	Boolean imageS;
	
	
	
	MyPanel[] dNote = new MyPanel[100];
	int dNoteTime[];
	Boolean isD[];
	Boolean niceD[];
	long timeD[];
	Boolean pressD;
	Boolean imageD;
	
	
	MyPanel[] fNote = new MyPanel[100];
	int fNoteTime[];
	Boolean isF[];
	Boolean niceF[];
	long timeF[];
	Boolean pressF;
	Boolean imageF;
	
	//음악 파일
	private Music introMusic;
	boolean musicStart = true;
	
	//스코어 관련
	int score = 0;
	int miss = 0;
	int combo = 0;
	
	//아이템 관련
	boolean itemMode = false;
>>>>>>> Kong

	// 생성자 부분
	/**
	 * 게임이 실행되는 곳
	 * 
	 * 
<<<<<<< HEAD
	 * @param Music
	 *            게임에서 플레이될 노래파일을 인자로 받아 옵니다.
	 * @param notetime
	 *            각값에 해당되는 노트가 떨어지는 시간을 담은 배열
	 * 
	 */
	public Game(Music Music, int notetime[][],boolean item) {
		introMusic = Music;

		// 변수 초기화 부분
		
		double y = 0;
		is = new Boolean[4][300];
		nice = new Boolean[4][300];
		time = new long[4][300];
		buff = new Boolean[4][300];
		nurff = new Boolean[4][300];
		NoteTime = notetime;
		press = new Boolean[4];
		image = new Boolean[4];
		Call = new int[4];


		// 배열 초기화 단계
		for(int i = 0; i<4;i++){
		for (int j = 0; j < 300; j++) {
			is[i][j] = false;
			nice[i][j] = false;
			buff[i][j] = false;
			nurff[i][j] = false;
		}
		press[i] = false;
		image[i] = false;
		Call[i] = 0;
		}
		
		if(item){
			buff[0][0] = true;
			nurff[3][5] = true;
			
			
			
		}

		setTitle("두둠칫"); // 창 이름 설정하는 부분
		setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		// 점수 설정
=======
	 * @param Music 게임에서 플레이될 노래파일을 인자로 받아 옵니다.
	 * @param a a값에 해당되는 노트가 떨어지는 시간을 담은 배열
	 * @param s s값에 해당되는 노트가 떨어지는 시간을 담은 배열
	 * @param d d값에 해당되는 노트가 떨어지는 시간을 담은 배열
	 * @param f f값에 해당되는 노트가 떨어지는 시간을 담은 배열
	 */
	public Game(Music Music,int a[],int s[],int d[],int f[]){
		introMusic = Music;
		
		//변수 초기화 부분
		double y = 0;
		isA = new Boolean[100];
		isS = new Boolean[100];
		isD = new Boolean[100];
		isF = new Boolean[100];
		niceA = new Boolean[100];
		niceS = new Boolean[100];
		niceD = new Boolean[100];
		niceF = new Boolean[100];
		timeA = new long[100];
		timeS = new long[100];
		timeD = new long[100];
		timeF = new long[100];
		aNoteTime = a;
		sNoteTime = s;
		dNoteTime = d;
		fNoteTime = f;
		
		// 배열 초기화 단계
		for(int i = 0 ; i < 100; i++){
			isA[i] = false;
			niceA[i] = false;
			isS[i] = false;
			niceS[i] = false;
			isD[i] = false;
			niceD[i] = false;
			isF[i] = false;
			niceF[i] = false;
		}
		
		
		
		// 키값 관련
		pressA = false;
		pressS = false;
		pressD = false;
		pressF = false;
		
		// 키값 관련
		imageA = false;
		imageS = false;
		imageD = false;
		imageF = false;
		
		setTitle("Dynamic Beat"); // 창 이름 설정하는 부분
		setSize(1280,720);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		//점수 설정
>>>>>>> Kong
		JLabel scoreLabel = new JLabel(String.valueOf(score));
		scoreLabel.setFont(new Font("굴림", Font.BOLD, 32));
		JLabel missLabel = new JLabel(String.valueOf(miss));
		missLabel.setFont(new Font("굴림", Font.BOLD, 32));
		JLabel comboLabel = new JLabel(String.valueOf(combo));
		comboLabel.setFont(new Font("굴림", Font.BOLD, 32));
<<<<<<< HEAD
		itemState = new JLabel();
		itemState.setBounds(986, 57, 200, 100);
		scoreLabel.setBounds(1153, 334, 109, 27);
		comboLabel.setBounds(1153, 388, 94, 27);
		missLabel.setBounds(1153, 445, 57, 27);
		
		getContentPane().add(scoreLabel);
		getContentPane().add(comboLabel);
		getContentPane().add(missLabel);
		getContentPane().add(itemState);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 게임창 종료시 게임 종료

		// 배경화면 설정
=======
		scoreLabel.setBounds(1153, 334, 109, 27);
		comboLabel.setBounds(1153, 388, 94, 27);
		missLabel.setBounds(1153, 445, 57, 27);
		getContentPane().add(scoreLabel);
		getContentPane().add(comboLabel);
		getContentPane().add(missLabel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 게임창 종료시 게임 종료
		

		
		//배경화면 설정
>>>>>>> Kong
		Back backGroundPane = new Back();
		backGroundPane.setLocation(0, 0);
		backGroundPane.setSize(1280, 720);
		
<<<<<<< HEAD
		//게임오버 설정
		GameOver overBack = new GameOver();
		overBack.setLocation(0, 0);
		overBack.setSize(1280, 1440);


		MyKeyListener AkeyListener = new MyKeyListener();
		addKeyListener(AkeyListener);


		nowtime = System.currentTimeMillis();
		
		while (true) {

			getContentPane().add(backGroundPane);
			
			cTime = System.currentTimeMillis(); // 현제시간
			pTime = cTime - nowtime; // 경과시간

			// 점수 관련

			if (pTime > 3000 & musicStart == true) {
				musicQ();
				musicStart = false;
			}


			for(int i = 0; i< 4; i++){
				makeNote(i);
				checkNote(i);
			}
			
			if(itemTime < introMusic.getTime()){
				itemState.setIcon(null);
				bufmiss = false;
				doubleScore = false;
				halfScore = false;
				nufcombo = false;
			}
			
			
			scoreLabel.setText(String.valueOf((int)score));
			missLabel.setText(String.valueOf(miss));
			comboLabel.setText(String.valueOf(combo));
			
		
			revalidate();
			repaint();
			setVisible(true);// 게임창이 보여요
		
			if(miss>11){
				break;
			}
			if(introMusic.musicEnd){
				break;
			}
		}
		
		introMusic.close();
			remove(backGroundPane);
			
			while(!end){
				if(miss>=11){
                backGround = gameOver;
                for(int i =0;i<4;i++){
                	for(int j =0 ; j<300;j++){
                		if(is[i][j] == true){
                			remove(Note[i][j]);
                		}
                	}
                }
                }else if(introMusic.musicEnd){
                	backGround = gameClear;	
                }
				
        		getContentPane().add(scoreLabel);
        		getContentPane().add(comboLabel);
        		getContentPane().add(missLabel);
				getContentPane().add(backGroundPane);
				scoreLabel.setText(String.valueOf(score));
				missLabel.setText(String.valueOf(miss));
				comboLabel.setText(String.valueOf(combo));
				JButton restart = new JButton(reStartImg);
				restart.setBackground(Color.WHITE);
				restart.setLocation(600, 489);
				restart.setSize(200, 100);
				restart.setBorderPainted(false);
				restart.setRolloverIcon(reStartrollover);
				restart.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						end = true;
						dispose();
						new Menu();
					}
				});
				getContentPane().add(restart);
				revalidate();
				repaint();
				setVisible(true);// 게임창이 보여요
			}
			
		
	}

	
	public void makeNote(int key){
		
		for (int j = 0; j < NoteTime[key].length; j++) {
			if (introMusic.getTime() > NoteTime[key][Call[key]]) {
				Note[key][Call[key]] = new MyPanel();
				Note[key][Call[key]].setSize(100, 60);
				Note[key][Call[key]].setLocation(122, 0);
				
				//아이템(버프노트인지 확인)
				if(buff[key][Call[key]]){
					Note[key][Call[key]].buff = true;
				}

				
				//아이템(너프노트인지 확인)
				if(nurff[key][Call[key]]){
					Note[key][Call[key]].nurff = true;
				}
				
				
				is[key][Call[key]] = true;
				time[key][Call[key]] = cTime;
				getContentPane().add(Note[key][Call[key]]);
				Call[key]++;
			}
		}
		for (int i = 0; i < 200; i++) {
			if (is[key][i] == true) {
				Note[key][i].setLocation(122+((key)*(124)), (int) ((cTime - time[key][i]) * 0.3));
				if ((int) ((cTime - time[key][i]) * 0.3) >= 500 && (int) ((cTime - time[key][i]) * 0.3) <= 600) {
					nice[key][i] = true;
				} else {
					nice[key][i] = false;
				}
			}
			if (is[key][i] == true & (int) ((cTime - time[key][i]) * 0.3) >= 660) {
				combo = 0;
				if(bufmiss){
					}else{
					miss++;}
				// 530부터 // 590줍시다
				is[key][i] = false;
				remove(Note[key][i]);
				if(nurff[key][i]){
					nurffAction();
				}
			}
		}
		
		
	}

	public void checkNote(int key){
		//  노트 판정부분
		if (press[key]) {
			press[key] = false;
			for (int i = 0; i < 200; i++) {
				if (nice[key][i] == true) {
					if(buff[key][i]==true){
						buffAction();
					}
					if(!nufcombo){
					combo++;}
					if(doubleScore){
						score = score +2;
					}else if(halfScore){
						score = score + 0.5;
					}else{
					score++;}
					nice[key][i] = false;
					is[key][i] = false;
					remove(Note[key][i]);
					revalidate();
				}
			}
		}
	}
	
	
	public void buffAction(){
		bufmiss = false;
		doubleScore = false;
		halfScore = false;
		nufcombo = false;
		itemTime = introMusic.getTime()+5000;
		Random random = new Random(cTime);
		int num = random.nextInt(4);
		if(num == 0){
			score = score+100;
			itemState.setIcon(buf100);
		}else if(num == 1){
			miss = miss - 2;
			itemState.setIcon(bufMiss);
		}else if(num == 2){
			doubleScore = true;
			itemState.setIcon(bufDouble);
		}else if(num == 3){
			bufmiss = true;
			itemState.setIcon(bufNoMiss);
		}
	}
	
	public void nurffAction(){
		bufmiss = false;
		doubleScore = false;
		halfScore = false;
		nufcombo = false;
		itemTime = introMusic.getTime()+3000;
		Random random = new Random(cTime);
		int num = random.nextInt(4);
		if(num == 0){
			score = score - 100;
			itemState.setIcon(nuf100);
			
		}else if(num == 1){
			miss = miss + 2;
			itemState.setIcon(nufMiss);
			
		}else if(num == 2){
			halfScore = true;
			itemState.setIcon(nufHalf);
			
		}else if(num == 3){
			nufcombo = true;
			itemState.setIcon(nufCom);
			
		}
	}
	
	
	/**
	 * 음악을 실행해주는 메소드
	 */
	public void musicQ() {
		introMusic.start();
	}

	/**
	 * 키 리스너 각 키값이 눌리게 될경우 키값이 눌러졋다는 뜻의 press변수를 참값으로 바꾸고 키 이펙트를 호출할 image변수또한
	 * 참으로 바꾼다 키값이 떨어지면 키 이펙트를 해제하기 위하여 image변수를 거짓으로 바꾼다. history : 심기성, 1.0
	 * 2017.11.3 초기 작성
	 * 
	 * @since 2017-10-14
	 * @date 2017.11.16
	 * @author 심기성
	 * @version 1.0
	 */
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if (keyCode == KeyEvent.VK_A) {
				press[0] = true;
				image[0] = true;
			}
			if (keyCode == KeyEvent.VK_S) {
				press[1] = true;
				image[1] = true;
			}
			if (keyCode == KeyEvent.VK_D) {
				press[2] = true;
				image[2] = true;
			}
			if (keyCode == KeyEvent.VK_F) {
				press[3] = true;
				image[3] = true;
			}
		}

		public void keyReleased(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if (keyCode == KeyEvent.VK_A)
				image[0] = false;
			
			if (keyCode == KeyEvent.VK_S)
				image[1] = false;
			
			if (keyCode == KeyEvent.VK_D)
				image[2] = false;
			
			if (keyCode == KeyEvent.VK_F)
				image[3] = false;
			
		}

		public void keyTyped(KeyEvent e) {
		}
	}

	/**
	 * 배경화면이 될 판넬을 만드는 클래스 이다 그리고 키리스너를 통해 키가 눌러지게 되면 키 이펙트를 출력하는 기능을 한다 history
	 * : 심기성, 1.0 2017.11.3 초기 작성
	 * 
	 * @since 2017-10-14
	 * @date 2017.11.16
	 * @author 심기성
	 * @version 1.0
	 */
	class Back extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.drawImage(backGround, 0, 0, null);
			if (image[0]) {
				g.drawImage(keyS, 119, 180, null);
			}
			if (image[1]) {
				g.drawImage(keyS, 240, 180, null);
			}
			if (image[2]) {
				g.drawImage(keyS, 362, 180, null);
			}
			if (image[3]) {
				g.drawImage(keyS, 485, 180, null);
			}
=======

		MyKeyListener AkeyListener = new MyKeyListener();

		addKeyListener(AkeyListener);
		
		int aCall = 0;
		int sCall = 0;
		int dCall = 0;
		int fCall = 0;
		



		while(true){
			
			scoreLabel.setText(String.valueOf(score));
			missLabel.setText(String.valueOf(miss));
			comboLabel.setText(String.valueOf(combo));
			
			
			getContentPane().add(backGroundPane);

			
			long cTime = System.currentTimeMillis(); // 현제시간
			long pTime = cTime-time; // 경과시간
			
			// 점수 관련


			
			if(pTime > 3000 & musicStart == true){
			musicQ();
			musicStart = false;
			}
			
			// a키 노트 생성부분
			for(int j = 0; j<aNoteTime.length;j++){
			if(pTime > aNoteTime[aCall]){
				aNote[aCall] = new MyPanel();
				aNote[aCall].setSize(100,60);
				aNote[aCall].setLocation(122,0);
				isA[aCall] = true;
				timeA[aCall] = cTime;
				getContentPane().add(aNote[aCall]);
				aCall++;
			}}
			for(int i =0 ; i< 100;i++){
				if(isA[i] == true){
					aNote[i].setLocation(122,(int)((cTime-timeA[i])*0.3));
					if((int)((cTime-timeA[i])*0.3)>=500 &&(int)((cTime-timeA[i])*0.3) <= 600 ){
						niceA[i] = true;
					}else{
						niceA[i] = false;
					}
				}
				if(isA[i] == true & (int)((cTime-timeA[i])*0.3) >= 660){
					combo = 0;
					miss++;
					//530부터  // 590줍시다
					isA[i] = false;
					remove(aNote[i]);
				}
			}
			
			
			// a키 노트 판정부분
			if(pressA){
				pressA = false;
				for(int i = 0; i<100;i++){
				if(niceA[i] == true){
					combo++;
					score++;
					niceA[i] = false;
					isA[i] = false;
					remove(aNote[i]);
					revalidate();
				}
				}
			}
			
			
			// s키 노트 생성부분
			for(int j = 0; j<sNoteTime.length;j++){
						if(pTime > sNoteTime[sCall]){
							
							sNote[sCall] = new MyPanel();
							sNote[sCall].setSize(100,60);
							sNote[sCall].setLocation(247,0);
							isS[sCall] = true;
							timeS[sCall] = cTime;
							getContentPane().add(sNote[sCall]);
							sCall++;
						}
						for(int i =0 ; i< 100;i++){
							if(isS[i] == true){
								sNote[i].setLocation(247,(int)((cTime-timeS[i])*0.3));
								if((int)((cTime-timeS[i])*0.3)>=500 &&(int)((cTime-timeS[i])*0.3) <= 600 ){
									niceS[i] = true;
								}else{
									niceS[i] = false;
								}
							}
							if(isS[i] == true & (int)((cTime-timeS[i])*0.3) >= 660){
								combo = 0;
								miss++;
								isS[i] = false;
								remove(sNote[i]);
							}
						}
			}
			
						// S키 노트 판정부분
						if(pressS){
							pressS = false;
							for(int i = 0; i<100;i++){
							if(niceS[i] == true){
								combo++;
								score++;
								niceS[i] = false;
								isS[i] = false;
								remove(sNote[i]);
								revalidate();
							}
							}
						}
		

						// d키 노트 생성부분
						for(int j = 0; j<dNoteTime.length;j++){
						if(pTime > dNoteTime[dCall]){
							dNote[dCall] = new MyPanel();
							dNote[dCall].setSize(100,60);
							dNote[dCall].setLocation(370,0);
							isD[dCall] = true;
							timeD[dCall] = cTime;
							getContentPane().add(dNote[dCall]);
							dCall++;
						}
						for(int i =0 ; i< 100;i++){
							if(isD[i] == true){
								dNote[i].setLocation(370,(int)((cTime-timeD[i])*0.3));
								if((int)((cTime-timeD[i])*0.3)>=500 &&(int)((cTime-timeD[i])*0.3) <= 600 ){
									niceD[i] = true;
								}else{
									niceD[i] = false;
								}
							}
							if(isD[i] == true & (int)((cTime-timeD[i])*0.3) >= 660){
								combo = 0;
								miss++;
								isD[i] = false;
								remove(dNote[i]);
							}
						}
						}
						// D키 노트 판정부분
						if(pressD){
							pressD = false;
							for(int i = 0; i<100;i++){
							if(niceD[i] == true){
								combo++;
								score++;
								niceD[i] = false;
								isD[i] = false;
								remove(dNote[i]);
								revalidate();
							}
							}
						}
						
						// f키 노트 생성부분
						for(int j = 0; j<fNoteTime.length;j++){
						if(pTime > fNoteTime[fCall]){
							fNote[fCall] = new MyPanel();
							fNote[fCall].setSize(100,60);
							fNote[fCall].setLocation(493,0);
							isF[fCall] = true;
							timeF[fCall] = cTime;
							getContentPane().add(fNote[fCall]);
							fCall++;
						}
						for(int i =0 ; i< 100;i++){
							if(isF[i] == true){
								fNote[i].setLocation(493,(int)((cTime-timeF[i])*0.3));
								if((int)((cTime-timeF[i])*0.3)>=500 &&(int)((cTime-timeF[i])*0.3) <= 600 ){
									niceF[i] = true;
								}else{
									niceF[i] = false;
								}
							}
							if(isF[i] == true & (int)((cTime-timeF[i])*0.3) >= 660){
								combo = 0;
								miss++;
								isF[i] = false;
								remove(fNote[i]);
							}
						}
						}
						// F키 노트 판정부분
						if(pressF){
							
							pressF = false;
							for(int i = 0; i<100;i++){
							if(niceF[i] == true){
								niceF[i] = false;
								combo++;
								score++;
								isF[i] = false;
								remove(fNote[i]);
								revalidate();
							}
							}
						}
						

			
			revalidate();
			repaint();
			setVisible(true);// 게임창이 보여요	
		}	
		
	}
	
	/**
	 * 음악을 실행해주는 메소드
	 */
public void musicQ(){
	introMusic.start();
}
	
/**
 * 키 리스너
 * 각 키값이 눌리게 될경우
 * 키값이 눌러졋다는 뜻의 press변수를 참값으로 바꾸고
 * 키 이펙트를 호출할 image변수또한 참으로 바꾼다
 * 키값이 떨어지면
 * 키 이펙트를 해제하기 위하여 image변수를 거짓으로 바꾼다.
 * @author 심기성
 *
 */
	class MyKeyListener extends KeyAdapter {
	 	public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if(keyCode == KeyEvent.VK_A){
				pressA = true;
			    imageA = true;}
			if(keyCode == KeyEvent.VK_S){
				pressS = true;
				imageS = true;}
			if(keyCode == KeyEvent.VK_D){
				pressD = true;
				imageD = true;}
			if(keyCode == KeyEvent.VK_F){
				pressF = true;
				imageF = true;}
			}

			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_A)
					imageA = false;
				if(keyCode == KeyEvent.VK_S)
					imageS = false;
				if(keyCode == KeyEvent.VK_D)
					imageD = false;
				if(keyCode == KeyEvent.VK_F)
					imageF = false;
			}

			public void keyTyped(KeyEvent e) {
			}
			}


	/**
	 * 배경화면이 될 판넬을 만드는 클래스 이다
	 * 그리고 키리스너를 통해 키가 눌러지게 되면
	 * 키 이펙트를 출력하는 기능을 한다
	 * @author 심기성
	 *
	 */
	class Back extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponents(g);
			g.drawImage(backGround, 0,0, null);
			if(imageA){
				g.drawImage(keyS,119,180,null);
			}
			if(imageS){
				g.drawImage(keyS,240,180,null);
			}
			if(imageD){
				g.drawImage(keyS,362,180,null);
			}
			if(imageF){
				g.drawImage(keyS,485,180,null);
			}
		
>>>>>>> Kong

		}
	}
	
<<<<<<< HEAD
	class GameOver extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.drawImage(gameOver, 0, 0, null);

		}
	}

	/**
	 * 노트 이미지를 만드는 판넬입니다. game클래스에서 이 클래스를 객체로 소환하면 그게 노트가 됩니다.
	 * 
	 * history : 심기성, 1.0 2017.11.3 초기 작성
	 * 
	 * @since 2017-10-14
	 * @date 2017.11.16
	 * @author 심기성
	 * @version 1.0
	 */
	class MyPanel extends JPanel {
		boolean buff = false;
		boolean nurff = false;
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			if(buff){
				g.drawImage(noteBuff, 0, 0, null);
			}
			else if(nurff){
				g.drawImage(noteNurff, 0, 0, null);
			}
			else{
				g.drawImage(notebasic, 0, 0, null);		
			}
			
			// g.setColor(Color.WHITE);
		
			
=======
	/**
	 * 노트 이미지를 만드는 판넬입니다.
	 * game클래스에서 이 클래스를 객체로 소환하면
	 * 그게 노트가 됩니다.
	 * 
	 * @author 심기성
	 *
	 */
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponents(g);
			//g.setColor(Color.WHITE);
			g.drawImage(notebasic, 0,0, null);
>>>>>>> Kong
		}
	}
}