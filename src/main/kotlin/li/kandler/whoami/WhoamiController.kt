package li.kandler.whoami

import java.util.UUID
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WhoamiController {
    @GetMapping("/yo")
    fun yo(): Map<String, String> {
        val model = HashMap<String, String>()
        model["id"] = UUID.randomUUID().toString()
        model["content"] = "Hello World"
        return model
    }
}
