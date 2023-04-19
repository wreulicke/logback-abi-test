package test;

import java.time.Instant;

import logback.LoggingEvent;

public class LoggingEventWrapper extends LoggingEvent {

  // @Override
  public Instant getInstant() {
    return Instant.now();
  }
  
}