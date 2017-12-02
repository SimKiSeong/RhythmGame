package do_doom_chit;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

/**
<<<<<<< HEAD
 * ìŒì•…ìž¬ìƒì„ ë‹´ë‹¹í•˜ëŠ” í´ëž˜ìŠ¤ ìž…ë‹ˆë‹¤. history : ê³µì² ê·œ, 1.0 2017.11.3 ì´ˆê¸° ìž‘ì„±
 * 
 * @since 2017-10-14
 * @author ê³µì² ê·œ
=======
 * À½¾ÇÀç»ýÀ» ´ã´çÇÏ´Â Å¬·¡½º ÀÔ´Ï´Ù.
 *  history : °øÃ¶±Ô, 1.0 2017.11.3 ÃÊ±â ÀÛ¼º
 * @since 2017-10-14 
 * @author °øÃ¶±Ô
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
	 * ìƒì„±ìž ìž…ë‹ˆë‹¤. ìƒì„±ìžì—ì„œëŠ” ë³€ìˆ˜ë¥¼ ì´ˆê¸°í™” ì‹œí‚µë‹ˆë‹¤.
	 * 
	 * @param name
	 *            ìŒì•… íŒŒì¼ì„ ë¶ˆëŸ¬ì˜¤ëŠ” ì¸ìžìž…ë‹ˆë‹¤.
	 * @param isLoop
	 *            ìŒì•… ë¬´í•œìž¬ìƒì„í•˜ëŠ” ì¸ìžìž…ë‹ˆë‹¤.
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
	 * ìŒì•…ì„ ì¤‘ê°„ì— ë°”ê¾¸ê³  ì‹¶ì„ë•Œ ìŒì•…ì„ ì•ˆì •ì ìœ¼ë¡œ ì¢…ë£Œì‹œí‚¤ëŠ” ë©”ì†Œë“œ
	 */
	public void close() { // ï¿½Ø´ï¿½ ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
=======
	 * »ý¼ºÀÚ ÀÔ´Ï´Ù. »ý¼ºÀÚ¿¡¼­´Â º¯¼ö¸¦ ÃÊ±âÈ­ ½ÃÅµ´Ï´Ù.
	 * @param name À½¾Ç ÆÄÀÏÀ» ºÒ·¯¿À´Â ÀÎÀÚÀÔ´Ï´Ù.
	 * @param isLoop À½¾Ç ¹«ÇÑÀç»ýÀ»ÇÏ´Â ÀÎÀÚÀÔ´Ï´Ù.
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
	 * À½¾ÇÀ» Áß°£¿¡ ¹Ù²Ù°í ½ÍÀ»¶§ À½¾ÇÀ» ¾ÈÁ¤ÀûÀ¸·Î Á¾·á½ÃÅ°´Â ¸Þ¼Òµå
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
	 * ê³¡ì„ ì‹¤í–‰ì‹œí‚¤ëŠ” ë©”ì†Œë“œ
	 */
	public void run() { // ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½Ñ¹Ýºï¿½ ï¿½Þ¼Òµï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ìµï¿½
		try {
			do {
=======
	
	public int getTime(){
		if (player == null)
			return 0;
		return player.getPosition();
		
	}
	
	/**
	 * °îÀ» ½ÇÇà½ÃÅ°´Â ¸Þ¼Òµå
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
