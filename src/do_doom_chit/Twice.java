package do_doom_chit;

/**
 * 트와이스 게임을 만드는 클래스
 * 쓰래드를 이용하게 되는데
 * 쓰레드는 메뉴 화면과 게임화면 그래픽이 동시에 실행되지 않기때문에 쓰는것임
 * @author 심기성
 *
 */


public class Twice extends Thread {
	private Music introMusic = new Music("LIKEY.mp3",true);

/**
 * 이 메소드는 
 * 쓰레드를 이용하기위한 메소드이고
 * 안에 각 배열마다 각 키에 해당되는 노트 시간값을 가지고 있다
 * 각 노트 시간과 이 클래스에 선언되어 있는 음악을 인자로 하여
 * 게임 을 호출하게 된다
 *
 */	
	public void run(){
		int	aNoteTime[] = new int[]{7900,13400,15000,16000,18500,22500,23000,10000000};
		int	sNoteTime[] = new int[]{4500,12500,13000,13200,10000000};
		int	dNoteTime[] = new int[]{4500,13700,14100,15500,17000,17400,17800,18700,19200,19700,10000000};
		int	fNoteTime[] = new int[]{8100,13800,15500,17200,17600,17900,18900,19400,19900,22500,23000,10000000};
		
		new Game(introMusic,aNoteTime,sNoteTime,dNoteTime,fNoteTime);	
	}
	
}
