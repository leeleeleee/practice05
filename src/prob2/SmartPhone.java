package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if (function.equals( "앱" )){
			appPlay();
		} else {
			super.execute(function);
		}
	}
	public void playMusic() {
		System.out.println( "다운로드해서 음악 재생" );
	}
	private void appPlay(){
		System.out.println( "앱실행" );
	}
}
