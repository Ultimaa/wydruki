package pl.igorguzek.wydruki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PrintsController {

    @GetMapping("/prints-set")
    public String index() {
        return "prints/prints-set";
    }

}
