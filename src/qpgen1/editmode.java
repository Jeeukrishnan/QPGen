package qpgen1;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class editmode {
	public static void qadd()
	{
		LogManager logmgr = LogManager.getLogManager();
		Logger log= logmgr.getLogger(Logger.GLOBAL_LOGGER_NAME);
		log.log(Level.INFO,"Qadd Entered.");
	}
}