package do_doom_chit;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

/**
<<<<<<< HEAD
 * 음악재생을 담당하는 클래스 입니다. history : 공철규, 1.0 2017.11.3 초기 작성
 * 
 * @since 2017-10-14
 * @author 공철규
=======
 * ��������� ����ϴ� Ŭ���� �Դϴ�.
 *  history : ��ö��, 1.0 2017.11.3 �ʱ� �ۼ�
 * @since 2017-10-14 
 * @author ��ö��
>>>>>>> Kong
 */
public class Music extends Thread {

	private Player player;
<<<<<<< HEAD
	boolean isLoop;
	boolean musicEnd = false;
=======
	private boolean isLoop;
>>>>>>> Kong
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;

	/**
<<<<<<< HEAD
	 * 생성자 입니다. 생성자에서는 변수를 초기화 시킵니다.
	 * 
	 * @param name
	 *            음악 파일을 불러오는 인자입니다.
	 * @param isLoop
	 *            음악 무한재생을하는 인자입니다.
	 */
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * 음악을 중간에 바꾸고 싶을때 음악을 안정적으로 종료시키는 메소드
	 */
	public void close() { // �ش� �� ����
=======
	 * ������ �Դϴ�. �����ڿ����� ������ �ʱ�ȭ ��ŵ�ϴ�.
	 * @param name ���� ������ �ҷ����� �����Դϴ�.
	 * @param isLoop ���� ����������ϴ� �����Դϴ�.
	 */
	public Music(String name, boolean isLoop){
		try{
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/"+name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	
	}


	/**
	 * ������ �߰��� �ٲٰ� ������ ������ ���������� �����Ű�� �޼ҵ�
	 */
	public void close(){
>>>>>>> Kong
		isLoop = false;
		player.close();
		this.interrupt();
	}
<<<<<<< HEAD

	public int getTime() {
		if (player == null)
			return 0;
		return player.getPosition();

	}
	
	


	/**
	 * 곡을 실행시키는 메소드
	 */
	public void run() { // ���� ���ѹݺ� �޼ҵ� �������̵�
		try {
			do {
=======
	
	public int getTime(){
		if (player == null)
			return 0;
		return player.getPosition();
		
	}
	
	/**
	 * ���� �����Ű�� �޼ҵ�
	 */
	public void run(){ 
		try{
			do{
>>>>>>> Kong
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(bis);
				player = new Player(bis);
<<<<<<< HEAD
			} while (isLoop);
		} catch (Exception e) {
			musicEnd=true;
			System.out.println(e.getMessage());
		}

	}

}
=======
			}
			while(isLoop);	
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	
	}
	
}

>>>>>>> Kong
