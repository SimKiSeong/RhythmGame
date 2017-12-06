package doo;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 곡 선택 및 모드 선택 화면을 담당하는 클래스입니다
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
   
   public JFrame menu;
   
   /**
 * Menu클래스에 대한 기본 생성자 입니다.
 * Track Class에 음악에 대한 정보를 추가해줍니다.
 */
   public Menu(JFrame menu) {
	   	  
	   this.menu = menu;
	   
      trackList.add(new Track("someTitle.png", "some Bolbbalgan4 image.jpg", "Bolbbagan4Startimage.png", "SomeSelected.mp3", "Seo.mp3")); 
      trackList.add(new Track("likeyTitle.png", "LIKEY TWICE Selected images.jpg", "Bolbbagan4Startimage.png", "LIKEYSelected.mp3", "LIKEY.mp3"));
      trackList.add(new Track("bbalTitle.png", "bbar redvelbet Selected images.jpg", "Bolbbagan4Startimage.png", "RED Selected.mp3", "RED.mp3"));

    
      /**
       * 시작하기 버튼을 누를 경우 introMusic이 종료되고 Selected Music이 재생되고 메인 화면으로 넘어가도록 해주는 메소드
       */
        /**
         * 초기 선택 음악을 0번 트랙으로 해줍니다.
         */
         selectedTrack(0);
  

   leftButton.setBounds(230,620,64,64); 
   leftButton.setBorderPainted(false);
   leftButton.setContentAreaFilled(false);
   leftButton.setFocusPainted(false);
   leftButton.addMouseListener(new MouseAdapter(){
      /**
       * 메인화면에서 왼쪽 화살표 버튼에 마우스가 올라갈 경우 이미지와 커서모양을 바꿔주는 메소드입니다.
       */
      @Override
      public void mouseEntered(MouseEvent e){
         leftButton.setIcon(leftButtonEnteredImage);
         leftButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

      }
      /**
       * 메인화면에서 왼쪽 화살표 버튼에서 마우스가 나올경우 이미지와 커서를 원래대로 바꿔주는 메소드입니다.
       */
      public void mouseExited(MouseEvent e){
         leftButton.setIcon(leftButtonImage);
         leftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

      }
      /**
       * 왼쪽 화살표 버튼을 누를 경우 Track Class 배열의 index를 -1해주어 이전 음악으로 넘기는 메소드입니다.
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
       * 메인화면에서 오른쪽 화살표에 마우스가 올라갈 경우 이미지와 커서를 원래대로 바꿔주는 메소드입니다
       */
      @Override
      public void mouseEntered(MouseEvent e){
         rightButton.setIcon(rightButtonEnteredImage);
         rightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

      }
      /**
       * 메인화면에서 왼쪽 화살표 버튼에서 마우스가 나올경우 이미지와 커서를 원래대로 돌아오게 해주는 메소드
       */
      public void mouseExited(MouseEvent e){
         rightButton.setIcon(rightButtonImage);
         rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

      }
      /**
       * 오른쪽 화살표 버튼을 누를 경우 Track Class 배열의 index를 +1해주어 다음 음악으로 넘기는 메소드입니다.
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
       * 메인화면에서 Normal 버튼에 마우스가 올라갈 경우 이미지와 커서를 바꿔주는 메소드입니다.
       */
      @Override
      public void mouseEntered(MouseEvent e){
         normalButton.setIcon(normalButtonEnteredImage);
         normalButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

      }
      /**
       * 메인화면에서 Normal 버튼에서 마우스가 나올경우 이미지와 커서를 원래대로 돌아오게 해주는 메소드입니다.
       */
      public void mouseExited(MouseEvent e){
         normalButton.setIcon(normalButtonImage);
         normalButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

      }
      /**
       * Normal 버튼이 눌러질 경우 선택된 음악을 normal mode로 실행시켜주는 메소드입니다.
       */
      public void mousePressed(MouseEvent e){
       gamestart(nowSelected,false);
      }
   });

   itemButton.setBounds(830,500,400,100); 
   itemButton.setBorderPainted(false);
   itemButton.setContentAreaFilled(false);
   itemButton.setFocusPainted(false);
   itemButton.addMouseListener(new MouseAdapter(){
      /**
       * 메인화면에서 Item 버튼에 마우스가 올라갈 경우 이미지와 커서를 바꿔주는 메소드입니다. 
       */
      @Override
      public void mouseEntered(MouseEvent e){
         itemButton.setIcon(itemButtonEnteredImage);
         itemButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

      }
      /**
       * 메인화면에서 Item 버튼에서 마우스가 나올경우 이미지와 커서를 원래대로 돌아오게 해주는 메소드입니다.
       */
      public void mouseExited(MouseEvent e){
         itemButton.setIcon(itemButtonImage);
         itemButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
      }
      /**
       * Item 버튼이 눌러질 경우 선택된 음악을 Item mode로 실행시켜주는 메소드입니다.
       */
         public void mousePressed(MouseEvent e){
         gamestart(nowSelected,true);
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
    * 메뉴화면의 배경을 그려주는 패널 클래스 입니다.
    * @author 공철규
    */
	class menupanel extends JPanel{
		/**
		 * contentPane에 이미지를 그려주는 메소드 입니다.
		 * @param g
		 */
		public void paintComponent(Graphics g){
			
			super.paintComponents(g);

			g.drawImage(background , 0, 0, this); 
		      g.drawImage(selectedImage, 140,160, null);
		      g.drawImage(titleImage, 140, 70, null);
		      repaint();
   
		
		}}
   /**
    * 현재 선택된 음악에 대해 Track Class에 저장된 음악의 타이틀 이미지, 앨범 이미지, Selected Music을 불러오고 음악을 시작해주는 메소드입니다. 
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
    * 왼쪽화살표 버튼이 선택된 음악에서 trackList에 저장된 이전 음악으로 이동할 수 있는 기능을 갖도록 해주는 메소드입니다.
    */
   public void selectedLeft(){
      if(nowSelected == 0)
         nowSelected = trackList.size()-1;
      else
         nowSelected--;
      selectedTrack(nowSelected);
   }
   /**
    * 왼쪽화살표 버튼이 선택된 음악에서 trackList에 저장된 다음 음악으로 이동할 수 있는 기능을 갖도록 해주는 메소드입니다.
    */
   public void selectedRight(){
      if(nowSelected == trackList.size()-1)
         nowSelected = 0;
      else
         nowSelected++ ;
      selectedTrack(nowSelected);
   }

   /**
    * 현재 선택된 음악과 모드에 대해 게임을 실행 할 수 있도록 해주는 메소드입니다.
    * @param nowSelected
    * @param normal
*/    
   public void gamestart(int nowSelected,Boolean normal){
      if(selectedMusic !=null)
         selectedMusic.close();
      leftButton.setVisible(false);
      rightButton.setVisible(false);
      normalButton.setVisible(false);
      itemButton.setVisible(false);
      menu.dispose();
    
  	if (nowSelected == 0) {
		Anziyoung anzi = new Anziyoung(normal);
		anzi.start();
	} else if (nowSelected == 1) {
		Twice tt = new Twice(normal);
		tt.start();
	} else if (nowSelected == 2) {
		RED vel = new RED(normal);
		vel.start();
	}

      
}
}