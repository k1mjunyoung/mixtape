package mixtape;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MixtapeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
