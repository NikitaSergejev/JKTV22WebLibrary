package ee.ivkhk.JKTV22WebLibrary.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {
    @GetMapping("/")
    public String Home(Model model){

       return "addBook";
    }
    @PostMapping("/book")
    public String addBook(@RequestBody String caption, Model model){
        model.addAttribute("title","Добавлена книга");
        model.addAttribute("caption",caption);
        model.addAttribute("result", "Статуc"+ HttpStatus.OK);
        return "home";
    }
    @GetMapping("/book")
    public String getBook(Model model){
        model.addAttribute("title","Открыта книга");
        model.addAttribute("caption", "Отцы и дети");
        model.addAttribute("result", "Статуc"+ HttpStatus.OK);
        return "home";
    }
}
