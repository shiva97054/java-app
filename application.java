import org.springframework.web.bind.annotation.*;

@RestController
public class Application {
    @GetMapping("/")
    public String home() {
        return "Hello DevOps 🚀";
    }
}
