package com.example.demo.service;

import java.util.Random;



public class RandomGeneratorService {

    private Random random;

    private int bound;

    private int shift;

    public RandomGeneratorService(Random random) {
        this.random = random;
    }

    public int generateRandom() {
        return random.nextInt(bound) + shift;
    }


    public void setBound(int bound) {
        this.bound = bound;
    }


    public void setShift(int shift) {
        this.shift = shift;
    }
}
