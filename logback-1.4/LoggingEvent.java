package logback;

import java.time.Instant;

public class LoggingEvent implements ILoggingEvent {
 
  @Override
  public long getTimeStamp() {
    return 0;
  }

  @Override
  public Instant getInstant() {
    return Instant.now();
  }
}
