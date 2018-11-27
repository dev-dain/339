import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException; 
public class web { 
	public web(String url) {
		
		String a=url;
		
		try { Desktop.getDesktop().browse(
				new URI(a));
		} catch (IOException e) { e.printStackTrace();}
		catch (URISyntaxException e) { e.printStackTrace(); } 
		} 
}
	
	
//http://mcard.duksung.ac.kr:8080/PW/pw20.php"