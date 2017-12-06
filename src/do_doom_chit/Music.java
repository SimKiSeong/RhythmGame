package do_doom_chit;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

/**
 *음악을 실행시켜주는 클래스입니다.
 * @author 공철규
 */
public class Music extends Thread {

	private Player player;
	boolean isLoop;
	boolean musicEnd = false;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;

	/**
	 * 클래스의 생성자로 음악 파일을 가져와줍니다
	 * @param name
	 * @param isLoop
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
	 * 음악을 종료시켜주는 메소드입니다.
	 */
	public void close() { 
		isLoop = false;
		player.close();
		this.interrupt();
	}

	/**
	 * 음악의 시간을 가져와주는 메소드입니다.
	 * @return
	 */
	public int getTime() {
		if (player == null)
			return 0;
		return player.getPosition();

	}
	

	/**
	 * 오버라이딩 된 메소드로 노래를 재생시켜주는 메소드입니다.
	 */
	public void run() { 
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(bis);
				player = new Player(bis);
			} while (isLoop);
		} catch (Exception e) {
			musicEnd=true;
			System.out.println(e.getMessage());
		}

	}

}
