package com.HelloWorldController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
    @RequestMapping(value="/helloworld",method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("message", "Shuaib");
        return "helloworld";
    }
}