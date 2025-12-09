package com.example.unitConverterThymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UnitController {

    @Autowired
    UnitConverterService service;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam double value,
                          @RequestParam String type, Model model){

        double result=0;

        switch(type){
            case "kmToM":
                result=service.convertkmtom(value);
                break;
            case "mToKm":
                result=service.convertmtokm(value);
                break;
            case "kgTog":
                result=service.convertkgtog(value);
                break;
            case "gTokg":
                result=service.convertgtokg(value);
                break;
        }

        model.addAttribute("input",value);
        model.addAttribute("output",result);
        model.addAttribute("type",type);

        return "result";
    }

}
