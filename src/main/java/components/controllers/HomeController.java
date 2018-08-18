package components.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("/result")
    public String showName(@RequestParam String name, Model model) {
        String result = String.join(" ", name, "Deichuk");
        model.addAttribute("name", result);
        return "result";
    }
}
