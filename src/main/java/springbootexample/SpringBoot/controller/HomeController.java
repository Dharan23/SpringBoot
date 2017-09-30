package springbootexample.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by gowri on 30-09-2017.
 */
@Controller
public class HomeController {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String Home(){
        return "layout";
    }
}
