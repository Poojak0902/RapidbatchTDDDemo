package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyfile {

	
	
//is used to save common prop of project, easy manaintenence , easy handling, handover
	
	private Properties prop;
	
	public Properties readpropfile() {
		 prop = new Properties();
		 
		 try {
			FileInputStream file = new FileInputStream("C:\\Automation\\WS\\testdemofTDDFW\\testdata.properties");
			
				prop.load(file);
			 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println(e);
		}catch (IOException e) {
		e.printStackTrace();
		System.out.println(e);
		}
		 
		return prop;
		
		
		
		
		
	}
	









}
