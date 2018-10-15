package test;

import org.apache.log4j.Logger;

public class HelloExample {
	final Logger logero = Logger.getLogger(this.getClass());
	
	public void runMe(String parameter) {
		if(logero.isDebugEnabled()){
			logero.debug("This is debug : " + parameter);
		}
		
		if(logero.isInfoEnabled()){
			logero.info("This is info : " + parameter);
		}
		
		logero.warn("This is warn : " + parameter);
		logero.error("This is error : " + parameter);
		logero.fatal("This is fatal : " + parameter);
	}

}
