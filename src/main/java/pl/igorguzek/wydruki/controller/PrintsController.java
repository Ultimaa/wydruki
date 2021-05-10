package pl.igorguzek.wydruki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.igorguzek.wydruki.model.Prints;


@Controller
public class PrintsController {

    @GetMapping("/prints-set")
    public String printsSet(Model model) {
        model.addAttribute("Prints", new Prints());
        return "prints/prints-set";
    }


}
