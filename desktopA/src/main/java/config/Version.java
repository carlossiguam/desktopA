package config;

import java.util.jar.Attributes;
import java.util.jar.JarFile;

public class Version {
	
	public static final String NAME = "NODE EMOV TEST";
	
	public static final String COPYLEFT = "@ 2018 CARLOS SIGUA ";
	
	private static String version;
	private static String buildDate;
	
	
	public static String getBuildDate() {
		return buildDate;
	}
	public static void setBuildDate(String buildDate) {
		Version.buildDate = buildDate;
	}
	public static String getVersion(){
		if (version == null) {
			return "version incorrecta";
		}else {
			return "version correcta";
		}
		
	}
	public static void setVersion(String version) {
		Version.version = version;
	}
	
//	public static String loadVersionFromJar() {
//		try {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			String path = Version.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
//			if(path.endsWith(".jar") || path.endsWith(".exe")) {
//				JarFile jarfile = new JarFile(path);
//				Attributes attrs = jarfile.getManifest().getMainAttributes();
//				version = attrs.getValue("Version");
//				buildDate = attrs.getValue("Build-Date");
//			}
//		}
//		
//		return "jocko";
//		
//	}
	
	
	

}
