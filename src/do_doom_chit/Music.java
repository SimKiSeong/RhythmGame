package do_doom_chit;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

/**
 * ��������� ����ϴ� Ŭ���� �Դϴ�.
 *  history : ��ö��, 1.0 2017.11.3 �ʱ� �ۼ�
 * @since 2017-10-14 
 * @author ��ö��
 */
public class Music extends Thread {

	private Player player;
	private boolean isLoop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;

	/**
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
		isLoop = false;
		player.close();
		this.interrupt();
	}
	
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
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(bis);
				player = new Player(bis);
			}
			while(isLoop);	
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	
	}
	
}

