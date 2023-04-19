package logback;

import java.time.Instant;

public interface ILoggingEvent {
 
  long getTimeStamp();
  
  default Instant getInstant() {
    return null;
  }

}