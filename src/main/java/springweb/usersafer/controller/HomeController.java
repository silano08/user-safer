package springweb.usersafer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/url-safer")
public class HomeController {

    @GetMapping("")
    public String urlHome() {
        return "url-list-main";
    }

    @GetMapping("/mypage")
    public String userHome() {
        return "user-main";
    }


}
