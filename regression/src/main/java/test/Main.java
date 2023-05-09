package test;
import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;

public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    ServerBuilder sb = Server.builder();
    sb.http(8080);
    sb.service("/", (ctx, req) -> {
      logger.info("Hello World!");
      return HttpResponse.of("Hello, world!");
    });
    Server server = sb.build();
    CompletableFuture<Void> future = server.start();
    future.join();
  }
}
