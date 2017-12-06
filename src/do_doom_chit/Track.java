package do_doom_chit;

/**
 * 음악의 트랙을 관리하는 클래스입니다.
 * @author 공철규
 */
public class Track {
	private String titleImage;
	private String startImage;
	private String gameImage;
	private String startMusic;
	private String gameMusic;
/**
 * 타이틀 이미지를 가져오는 메소드입니다.
 * @return
 */
	public String getTitleImage() {
		return titleImage;
	}
	/**
	 * 파라미터로 설정된 타이틀 이미지를 대입해주는 메소드입니다.
	 * @param titleImage
	 */
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	/**
	 * 앨범 이미지를 가져오는 메소드입니다.
	 * @return
	 */
	public String getStartImage() {
		return startImage;
	}
	/**
	 *  파라미터로 설정된 앨범 이미지를 대입해주는 메소드입니다.
	 * @param startImage
	 */
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	/**
	 * 게임 이미지를 가져오는 메소드입니다.
	 * @return
	 */
	public String getGameImage() {
		return gameImage;
	}
	/**
	 * 파라미터로 설정된 게임 이미지를 대입해주는 메소드입니다.
	 * @param gameImage
	 */
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	/**
	 * 앨범 선택음악을 가져오는 메소드입니다.
	 * @return
	 */
	public String getStartMusic() {
		return startMusic;
	}
	/**
	 * 파라미터로 설정된 앨범 선택음악을 대입해주는 메소드입니다.
	 * @param startMusic
	 */
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	/**
	 * 게임음악을 가져오는 메소드입니다.
	 * @return
	 */
	public String getGameMusic() {
		return gameMusic;
	}
	/**
	 * 파라미터로 설정된 게임음악을 대입해주는 메소드입니다.
	 * @param gameMusic
	 */
	public void setGameMusic(String gameMusic) {
		this.gameMusic = gameMusic;
	}
/**
 * 파라미터로 설정된 값들을 각 변수에 대입해주는 생성자입니다.
 * @param titleImage
 * @param startImage
 * @param gameImage
 * @param startMusic
 * @param gameMusic
 */
	public Track(String titleImage, String startImage, String gameImage, String startMusic, String gameMusic) { // SUPER 클래스의 객체를 생성하여 해당 값 대입 
		super();
		this.titleImage = titleImage;
		this.startImage = startImage;
		this.gameImage = gameImage;
		this.startMusic = startMusic;
		this.gameMusic = gameMusic;
	}
}