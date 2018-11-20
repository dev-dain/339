import java.io.IOException;
import java.net.URI; 
import java.net.URISyntaxException; 
import java.awt.Desktop; 
public class web { 
	public web(){ 
			try { Desktop.getDesktop().browse(
					new URI("http://mcard.duksung.ac.kr:8080/PW/pw20.php/"));
			} catch (IOException e) { e.printStackTrace();}
			catch (URISyntaxException e) { e.printStackTrace(); } 
			} 
	}
		

	
//http://mcard.duksung.ac.kr:8080/PW/pw20.php"