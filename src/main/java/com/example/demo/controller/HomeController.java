package com.example.demo.controller;

import com.example.demo.service.CalcService;
import com.example.demo.service.HomeService;
import com.example.demo.service.RandomGeneratorService;
import com.example.demo.service.StringGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {


    @Autowired
    private HomeService homeService;

    @Autowired
    private CalcService calcService;

//    @Qualifier("bigGenerator")
    @Autowired
    private RandomGeneratorService service;

    @Autowired
    private StringGeneratorService stringGeneratorService;

    @Autowired
    private List<StringGeneratorService> list;

    @RequestMapping(path = "/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        HomeService homeService = new HomeService("lukasz");
        this.homeService.doSomething();
        homeService.doSomething();
        return modelAndView;
    }

    @RequestMapping(path = "/add")
    public ModelAndView test() {
        int first = service.generateRandom();
        int second = service.generateRandom();

        int result = calcService.add(first, second);

        System.out.println(result);
        return new ModelAndView("home");
    }



//    @RequestMapping(path = "/random-string")
//    public ModelAndView randomString() {
//        int size = stringGeneratorService.generateString();
//        String value = stringGeneratorService.generateString(size);
//
//    }



}
