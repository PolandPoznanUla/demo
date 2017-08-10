package com.example.demo.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

/**
 * Created by RENT on 2017-08-10.
 */

@Component
public class StringGeneratorService {

    private boolean letters;

    private boolean numbers;




    public String generateString(int size) {
       return RandomStringUtils.random(size, letters, numbers);
    }

    public void setLetters(boolean letters) {
        this.letters = letters;
    }

    public void setNumbers(boolean numbers) {
        this.numbers = numbers;
    }
}
