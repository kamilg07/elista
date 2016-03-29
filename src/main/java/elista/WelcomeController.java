package elista;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Ja on 2016-03-29.
 */
@RestController

public class WelcomeController {
    @RequestMapping("/")
    public String Home()
    {
        return "Witaj na stronie głównej!";
    }
}
