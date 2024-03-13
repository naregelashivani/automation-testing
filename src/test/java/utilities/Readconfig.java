package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	public Readconfig() {
		
		File src=new File("./Configuration/config.properties");
		try {
		    FileInputStream fis = new FileInputStream(src);
		    pro=new Properties();
		    pro.load(fis);
		} catch (Exception e) {
			System.out.println("execption is"+e.getMessage());
		}


			
		}
		public String getApplication() {
			String url=pro.getProperty("baseUrl");
			return url;
		}
		public String getusername() {
			String Username=pro.getProperty("username");
			return Username;
		}
		
		public String getpassword() {
			String Password=pro.getProperty("password");
			return Password;
		}
	}
	
	

