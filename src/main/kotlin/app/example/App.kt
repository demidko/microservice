package app.example

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling
import java.time.Duration
import java.time.Instant
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor
import kotlin.time.measureTime

@EnableScheduling
@SpringBootConfiguration
@EnableAutoConfiguration
class App {

  @Bean
  fun controller(): ApiController {
    return ApiController()
  }
}

fun main(args: Array<String>) {
  val a = Instant.now()
  val b = Instant.now()
  Duration.between(a, b).toMillis();
  runApplication<App>(*args)
}
