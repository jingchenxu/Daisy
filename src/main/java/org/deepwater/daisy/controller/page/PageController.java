package org.deepwater.daisy.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/editor")
    public String editor(){
        return "editor";
    }

    @RequestMapping("/full")
    public String full() {
        return "full";
    }
}
