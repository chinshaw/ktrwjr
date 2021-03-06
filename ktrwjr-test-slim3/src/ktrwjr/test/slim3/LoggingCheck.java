package ktrwjr.test.slim3;

import java.util.logging.Logger;

import org.junit.Test;

public class LoggingCheck {

  private static final Logger logger =
    Logger.getLogger(LoggingCheck.class.getName());

  @Test
  public void log() {
    logger.finest("log finest");
    logger.finer("log finer");
    logger.config("log config");
    logger.info("log info");
    logger.warning("log warning");
    logger.severe("log severe");
  }
}
