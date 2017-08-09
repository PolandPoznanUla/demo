package com.example.demo;

import com.example.demo.service.HomeService;
import com.example.demo.service.RandomGeneratorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.Random;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    // efektem tej metody jest wrzucenie w kontekst
    public HomeService homeService() {
        HomeService homeService = new HomeService("Hello word form bean");
        return homeService;
    }

    @Bean
    public Random random() {
        return new Random();
    }

    //    @Primary
//    @Profile("dev")
    @Bean
    public RandomGeneratorService randomGeneratorService(Random random) {
        RandomGeneratorService randomGeneratorService = new RandomGeneratorService(random);
        randomGeneratorService.setBound(100);
        randomGeneratorService.setShift(10);
        return randomGeneratorService;
    }

    //    @Profile("prod")
    @Bean
    // nazwa bean to nazwa metody
    public RandomGeneratorService bigGenerator(Random random) {
        RandomGeneratorService randomGeneratorService = new RandomGeneratorService(random);
        randomGeneratorService.setBound(10000);
        randomGeneratorService.setShift(100);
        return randomGeneratorService;
    }


}


