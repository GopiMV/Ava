import java.io.IOException;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


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
	
	public void googleSearch(String searchString){
		String searchQuery = "https://www.google.ca/search?q=" + searchString.replace(" ", "+");
		try {
			Desktop.getDesktop().browse(new URI(searchQuery));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	public void openMail(){
		try {
			Desktop.getDesktop().browse(new URI("http://www.gmail.com"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	


}