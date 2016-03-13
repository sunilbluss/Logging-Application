package com.bluss.taskmanagerlogging;

import org.junit.Test;

import com.bluss.taskmanagerlogging.TMLogMap.TMActions;

import static com.bluss.taskmanagerlogging.TMLogMap.action;

public class TestTMLogger {
	private static final TMLogger LOGGER = TMLogger
			.getLogger(TestTMLogger.class);
	@Test
	public void testLogging(){
		LOGGER.info(action(TMActions.test).add("info", "testing"));
		LOGGER.error(action(TMActions.test).add("error", "testing"));
	}
}
