package do_doom_chit;

<<<<<<< HEAD
/**
 * 음악에 대한 정보를 가지고 있는 클래스 history : 공철규, 1.0 2017.10.17 초기 작성
 * 
 * @since 2017-10-17
 * @author 공철규
 */
=======
>>>>>>> Kong
public class Track {
	private String titleImage;
	private String startImage;
	private String gameImage;
	private String startMusic;
	private String gameMusic;

<<<<<<< HEAD
	/**
	 * 선택된 곡의 타이틀 이미지를 가져오는 메소드
	 * 
	 * @return 선택된 곡에 대한 타이틀 이미지
	 */
	public String getTitleImage() {
		return titleImage;
	}

	/**
	 * 타이틀 이미지를 변수에 대입하는 메소드
	 * 
	 * @param titleImage
	 */
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}

	/**
	 * 선택된 곡의 앨범 이미지를 가져오는 메소드
	 * 
	 * @return 선택된 곡에 대한 앨범 이미지
	 */
	public String getStartImage() {
		return startImage;
	}

	/**
	 * 앨범 이미지를 변수에 대입하는 메소드
	 * 
	 * @param startImage
	 */
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}

	/**
	 * 선택된 곡의 게임시작 이미지를 가져오는 메소드
	 * 
	 * @return 선택된 곡에 대한 게임시작 이미지
	 */
	public String getGameImage() {
		return gameImage;
	}

	/**
	 * 게임시작 이미지를 변수에 대입하는 메소드
	 * 
	 * @param gameImage
	 */
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}

	/**
	 * 선택된 곡의 selectedMusic을 가져오는 메소드
	 * 
	 * @return 선택된 곡에 대한 selectedMusic
	 */
	public String getStartMusic() {
		return startMusic;
	}

	/**
	 * selectedMusic을 변수에 대입하는 메소드
	 * 
	 * @param startMusic
	 */
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}

	/**
	 * 선택된 곡의gameMusic을 가져오는 메소드
	 * 
	 * @return 선택된 곡에 대한 gameMusic
	 */
	public String getGameMusic() {
		return gameMusic;
	}

	/**
	 * gameMusic을 변수에 대입하는 메소드
	 * 
	 * @param gameMusic
	 */
=======
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getStartImage() {
		return startImage;
	}
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	public String getGameImage() {
		return gameImage;
	}
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}
	public String getStartMusic() {
		return startMusic;
	}
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	public String getGameMusic() {
		return gameMusic;
	}
>>>>>>> Kong
	public void setGameMusic(String gameMusic) {
		this.gameMusic = gameMusic;
	}

<<<<<<< HEAD
	/**
	 * 상위 클래스에 각 값을 대입해주는 메소드
	 * 
	 * @param titleImage
	 * @param startImage
	 * @param gameImage
	 * @param startMusic
	 * @param gameMusic
	 */
	public Track(String titleImage, String startImage, String gameImage, String startMusic, String gameMusic) {
=======
	public Track(String titleImage, String startImage, String gameImage, String startMusic, String gameMusic) { // SUPER Ŭ������ ��ü�� �����Ͽ� �ش� �� ���� 
>>>>>>> Kong
		super();
		this.titleImage = titleImage;
		this.startImage = startImage;
		this.gameImage = gameImage;
		this.startMusic = startMusic;
		this.gameMusic = gameMusic;
	}
<<<<<<< HEAD

=======
>>>>>>> Kong
}