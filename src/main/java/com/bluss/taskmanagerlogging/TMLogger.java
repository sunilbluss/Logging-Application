package com.bluss.taskmanagerlogging;

import static net.logstash.logback.marker.Markers.appendEntries;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class TMLogger {
	private final Logger LOGGER;

	private TMLogger(Class<?> someClass) {
		LOGGER = LoggerFactory.getLogger(someClass);
	}

	/**
	 * Logger initialization for your class
	 * 
	 * @param yourLoggerClass
	 * @return
	 */
	public static TMLogger getLogger(Class<?> yourLoggerClass) {
		TMLogger logger = new TMLogger(yourLoggerClass);
		return logger;
	}

	/*******************************************************************************************************
	 * error
	 *******************************************************************************************************/

	/**
	 * @param string
	 */
	public void error(String msg) {
		LOGGER.error(msg);
	}

	public void error(Map<String, String> contentMap) {
		error(contentMap, null);
	}

	public void error(Map<String, String> contentMap, String msg) {
		LOGGER.error(appendEntries(contentMap), msg);
	}

	public void error(TMLogMap camap) {
		error(camap.getLogMap());
	}

	public void error(String msg, Object... args) {
		LOGGER.error(msg, args);
	}

	public void error(String msg, Throwable e) {
		LOGGER.error(msg, e);
	}

	public void error(Throwable e) {
		LOGGER.error(null, e);
	}

	public void error(TMLogMap add, Throwable e) {
		error(add.getLogMap());
		error(e);
	}

	public void error(TMLogMap add, String value) {
		error(add.getLogMap(), value);
	}

	/*******************************************************************************************************
	 * warn
	 *******************************************************************************************************/

	/**
	 * @param string
	 */
	public void warn(String msg) {
		LOGGER.warn(msg);
	}

	public void warn(Map<String, String> contentMap) {
		warn(contentMap, null);
	}

	public void warn(Map<String, String> contentMap, String msg) {
		LOGGER.warn(appendEntries(contentMap), msg);
	}

	public void warn(TMLogMap camap) {
		warn(camap.getLogMap());
	}

	public void warn(String msg, Object... args) {
		LOGGER.warn(msg, args);
	}

	public void warn(String msg, Throwable e) {
		LOGGER.warn(msg, e);
	}

	public void warn(Throwable e) {
		LOGGER.warn(null, e);
	}

	public void warn(TMLogMap add, Throwable e) {
		warn(add.getLogMap());
		warn(e);
	}

	public void warn(TMLogMap add, String value) {
		warn(add.getLogMap(), value);
	}

	/*******************************************************************************************************
	 * INFO
	 *******************************************************************************************************/

	/**
	 * @param string
	 */
	public void info(String msg) {
		LOGGER.info(msg);
	}

	public void info(Map<String, String> contentMap) {
		info(contentMap, null);
	}

	public void info(Map<String, String> contentMap, String msg) {
		LOGGER.info(appendEntries(contentMap), msg);
	}

	public void info(TMLogMap camap) {
		info(camap.getLogMap());
	}

	public void info(String msg, Object... args) {
		LOGGER.info(msg, args);
	}

	public void info(String msg, Throwable e) {
		LOGGER.info(msg, e);
	}

	public void info(Throwable e) {
		LOGGER.info(null, e);
	}

	public void info(TMLogMap add, Throwable e) {
		info(add.getLogMap());
		info(e);
	}

	public void info(TMLogMap add, String value) {
		info(add.getLogMap(), value);
	}

	/*******************************************************************************************************
	 * debug
	 *******************************************************************************************************/

	/**
	 * @param string
	 */
	public void debug(String msg) {
		LOGGER.debug(msg);
	}

	public void debug(Map<String, String> contentMap) {
		debug(contentMap, null);
	}

	public void debug(Map<String, String> contentMap, String msg) {
		LOGGER.debug(appendEntries(contentMap), msg);
	}

	public void debug(TMLogMap camap) {
		debug(camap.getLogMap());
	}

	public void debug(String msg, Object... args) {
		LOGGER.debug(msg, args);
	}

	public void debug(String msg, Throwable e) {
		LOGGER.debug(msg, e);
	}

	public void debug(Throwable e) {
		LOGGER.debug(null, e);
	}

	public void debug(TMLogMap add, Throwable e) {
		debug(add.getLogMap());
		debug(e);
	}

	public void debug(TMLogMap add, String value) {
		debug(add.getLogMap(), value);
	}

	/*******************************************************************************************************
	 * trace
	 *******************************************************************************************************/

	/**
	 * @param string
	 */
	public void trace(String msg) {
		LOGGER.trace(msg);
	}

	public void trace(Map<String, String> contentMap) {
		trace(contentMap, null);
	}

	public void trace(Map<String, String> contentMap, String msg) {
		LOGGER.trace(appendEntries(contentMap), msg);
	}

	public void trace(TMLogMap camap) {
		trace(camap.getLogMap());
	}

	public void trace(String msg, Object... args) {
		LOGGER.trace(msg, args);
	}

	public void trace(String msg, Throwable e) {
		LOGGER.trace(msg, e);
	}

	public void trace(Throwable e) {
		LOGGER.trace(null, e);
	}

	public void trace(TMLogMap add, Throwable e) {
		trace(add.getLogMap());
		trace(e);
	}

	public void trace(TMLogMap add, String value) {
		trace(add.getLogMap(), value);
	}

	/*******************************************************************************************************
	 * UTILS
	 *******************************************************************************************************/

}
