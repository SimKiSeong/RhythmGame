package doo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

/**
 *������ ��������ִ� Ŭ�����Դϴ�.
 * @author ��ö��
 */
public class Music extends Thread {

	private Player player;
	boolean isLoop;
	boolean musicEnd = false;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;

	/**
	 * Ŭ������ �����ڷ� ���� ������ �������ݴϴ�
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
	 * ������ ��������ִ� �޼ҵ��Դϴ�.
	 */
	public void close() { 
		isLoop = false;
		player.close();
		this.interrupt();
	}

	/**
	 * ������ �ð��� �������ִ� �޼ҵ��Դϴ�.
	 * @return
	 */
	public int getTime() {
		if (player == null)
			return 0;
		return player.getPosition();

	}
	

	/**
	 * �������̵� �� �޼ҵ�� �뷡�� ��������ִ� �޼ҵ��Դϴ�.
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
