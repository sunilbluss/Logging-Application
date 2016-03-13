package com.bluss.taskmanagerlogging;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sunilkumar.Meena
 *
 *	Contains all data in map<string,string> formate to log
 */
public class TMLogMap {
	
	private Map<String,String>logData = null;
	
	/**
	 * Tags to initiate the logging
	 */
	public static enum TMLogTags {
		action, component, src, dest, errormsg, caller_class_name,
		caller_method_name, caller_line_number;
	}
	
	/**
	 * These are the verbs you can add any this based on 
	 * your imagination of the functionality of the application
	 */
	public static enum TMActions{
		insert, select, delete, update, scoring, connect, disconnect,
		cache, status, start, stop, init, waiting, statusreport, open, close,
		configSetup,consume, error, shutdown,test,development;
	}
	
	/**
	 * Components (nouns) of the TaskManager System
	 * Each one have there own properties (actions)
	 */
	public static enum TMComponents {
		database,hibernate,endpoint,service,viewer,config,loader;
	}
	
	public TMLogMap(String key, String value) {
		logData = new HashMap<String, String>();
		logData.put(key, value);
	}
	
	public static TMLogMap action(TMActions action) {
		TMLogMap myLogMap = new TMLogMap(TMLogTags.action.name(),
				action.name());
		StackTraceElement[] stackTraces = Thread.currentThread()
				.getStackTrace();
		StackTraceElement stackTraceElement = stackTraces[2];

		myLogMap = myLogMap.add(TMLogTags.caller_class_name,
				stackTraceElement.getClassName());
		myLogMap = myLogMap.add(TMLogTags.caller_line_number,
				"" + stackTraceElement.getLineNumber());
		myLogMap = myLogMap.add(TMLogTags.caller_method_name,
				stackTraceElement.getMethodName());
		return myLogMap;
	}
	
	public TMLogMap add(String name, String value) {
		if (logData == null) {
			return new TMLogMap(name, value);
		}
		logData.put(name, value);
		return this;
	}
	
	public TMLogMap add(TMLogTags tagKey, String tagValue) {
		if (logData == null) {
			return new TMLogMap(tagKey.name(), tagValue);
		}
		logData.put(tagKey.name(), tagValue);
		return this;
	}
	
	public TMLogMap addSrc(TMComponents sourceValue) {
		return add(TMLogTags.src, sourceValue.name());
	}
	
	public TMLogMap addDest(TMComponents destValue) {
		return add(TMLogTags.dest, destValue.name());
	}
	
	public TMLogMap addDestnations(TMComponents... listData) {
		return add(TMLogTags.dest, Arrays.toString(listData));
	}
	
	public TMLogMap addErrorMsg(String message) {
		return add(TMLogTags.errormsg, message);
	}
	
	public Map<String, String> getLogMap() {
		return logData;
	}
}
