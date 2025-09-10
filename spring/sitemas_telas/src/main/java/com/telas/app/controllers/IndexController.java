package com.telas.app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index"; 
        
    }


@RequestMapping("cadastrar")
public String cadastrar() {
    return "cadastrar";
}

}