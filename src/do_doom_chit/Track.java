package doo;

/**
 * ������ Ʈ���� �����ϴ� Ŭ�����Դϴ�.
 * @author ��ö��
 */
public class Track {
	private String titleImage;
	private String startImage;
	private String gameImage;
	private String startMusic;
	private String gameMusic;
/**
 * Ÿ��Ʋ �̹����� �������� �޼ҵ��Դϴ�.
 * @return
 */
	public String getTitleImage() {
		return titleImage;
	}
	/**
	 * �Ķ���ͷ� ������ Ÿ��Ʋ �̹����� �������ִ� �޼ҵ��Դϴ�.
	 * @param titleImage
	 */
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	/**
	 * �ٹ� �̹����� �������� �޼ҵ��Դϴ�.
	 * @return
	 */
	public String getStartImage() {
		return startImage;
	}
	/**
	 *  �Ķ���ͷ� ������ �ٹ� �̹����� �������ִ� �޼ҵ��Դϴ�.
	 * @param startImage
	 */
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	/**
	 * ���� �̹����� �������� �޼ҵ��Դϴ�.
	 * @return
	 */
	public String getGameImage() {
		return gameImage;
	}
	/**
	 * �Ķ���ͷ� ������ ���� �̹����� �������ִ� �޼ҵ��Դϴ�.
	 * @param gameImage
	 */
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	/**
	 * �ٹ� ���������� �������� �޼ҵ��Դϴ�.
	 * @return
	 */
	public String getStartMusic() {
		return startMusic;
	}
	/**
	 * �Ķ���ͷ� ������ �ٹ� ���������� �������ִ� �޼ҵ��Դϴ�.
	 * @param startMusic
	 */
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	/**
	 * ���������� �������� �޼ҵ��Դϴ�.
	 * @return
	 */
	public String getGameMusic() {
		return gameMusic;
	}
	/**
	 * �Ķ���ͷ� ������ ���������� �������ִ� �޼ҵ��Դϴ�.
	 * @param gameMusic
	 */
	public void setGameMusic(String gameMusic) {
		this.gameMusic = gameMusic;
	}
/**
 * �Ķ���ͷ� ������ ������ �� ������ �������ִ� �������Դϴ�.
 * @param titleImage
 * @param startImage
 * @param gameImage
 * @param startMusic
 * @param gameMusic
 */
	public Track(String titleImage, String startImage, String gameImage, String startMusic, String gameMusic) { // SUPER Ŭ������ ��ü�� �����Ͽ� �ش� �� ���� 
		super();
		this.titleImage = titleImage;
		this.startImage = startImage;
		this.gameImage = gameImage;
		this.startMusic = startMusic;
		this.gameMusic = gameMusic;
	}
}