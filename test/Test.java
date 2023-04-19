package test;

import logback.ILoggingEvent;

public class Test {

  public static void main(String... args) {
    ILoggingEvent event = new LoggingEventWrapper();
    System.out.println(event.getInstant());
  }
}