package do_doom_chit;


/**
 * ����������� ������ ����� Ŭ����
 * �����带 �̿��ϰ� �Ǵµ�
 * ������� �޴� ȭ��� ����ȭ�� �׷����� ���ÿ� ������� �ʱ⶧���� ���°���
 * @author �ɱ⼺
 *
 */

public class Anziyoung extends Thread {
	private Music introMusic = new Music("Some.mp3",true);
	
	
	
	/**
	 * �� �޼ҵ�� 
	 * �����带 �̿��ϱ����� �޼ҵ��̰�
	 * �ȿ� �� �迭���� �� Ű�� �ش�Ǵ� ��Ʈ �ð����� ������ �ִ�
	 * �� ��Ʈ �ð��� �� Ŭ������ ����Ǿ� �ִ� ������ ���ڷ� �Ͽ�
	 * ���� �� ȣ���ϰ� �ȴ�
	 *
	 */	
	
	public void run(){
	int	aNoteTime[] = new int[]{10000000};
	int	sNoteTime[] = new int[]{4500,10000000};
	int	dNoteTime[] = new int[]{4500,10000000};
	int	fNoteTime[] = new int[]{10000000};
	
	new Game(introMusic,aNoteTime,sNoteTime,dNoteTime,fNoteTime);
	
	}
}
