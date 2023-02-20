package util;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class propconfig {
	 static Properties prop;
	
	public static Properties init_propreties( String env){
		
		String userdir=System.getProperty("user.dir"); //system current projectpath
		String filepath ="";
		
		if(env.equals("SIT")) {
		 filepath =userdir+"\\src\\main\\java\\congif\\propertites\\config.properties";	
		}
			File file=new File(filepath);
			try {
				FileReader filereader =new FileReader(file);
			    prop =new Properties(); // create object of that property file
				prop.load(filereader); //load the file
			//System.out.println(prop.getProperty("UserName"));
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		
		
		return prop;
	}

	
		
		

	

}
