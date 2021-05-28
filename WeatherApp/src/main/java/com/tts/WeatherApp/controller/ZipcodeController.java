package com.tts.WeatherApp.controller;


import com.tts.WeatherApp.service.ZipcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ZipcodeController {
    @Autowired
    ZipcodeService zipcodeService;

    @GetMapping
    public String getTopTenZipcode(Model model){
        model.addAttribute("zipcodes",zipcodeService.getTopTenZipcode());
        return "index";
    }
}
