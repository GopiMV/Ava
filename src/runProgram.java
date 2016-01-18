import java.io.IOException;

public class runProgram {
	
	public void executeChrome(){
		String path = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
		try {
			Process p = Runtime.getRuntime().exec(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void executeCSS(){
		String path = "C:\\Games\\Counter-Strike Source\\run_css.exe";
		try {
			Process p = Runtime.getRuntime().exec(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void executeSpotify(){
		String path = "C:\\Users\\Keshav\\AppData\\Roaming\\Spotify\\Spotify.exe";
		try {
			Process p = Runtime.getRuntime().exec(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	


}