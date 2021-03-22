package org.nopware.trial.spring_native;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }
}
