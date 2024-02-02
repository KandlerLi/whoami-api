package li.kandler.whoami

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication @ComponentScan("li.kandler.whoami") class WhoamiApplication

fun main(args: Array<String>) {
    runApplication<WhoamiApplication>(*args)
}
