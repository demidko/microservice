package app.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.ExecutorService

@RestController
class ApiController(private val executor: ExecutorService) {

  @GetMapping("/hello")
  fun hello(name: String) {
    executor.execute {
      println("/hello $name")
    }
  }
}