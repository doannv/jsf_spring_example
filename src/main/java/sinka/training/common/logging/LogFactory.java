/*
	* (C) Copyright 2019 
	*
	* @Author Doan Nguyen
	* @Date May 15, 2019
*/
package sinka.training.common.logging;

import org.apache.log4j.Logger;

public class LogFactory {
	private static Logger logger;

	private LogFactory() {

	}

	public static Logger getInstance() {
		if (logger == null) {
			logger = Logger.getLogger(LogFactory.class);
		}
		return logger;
	}
}
