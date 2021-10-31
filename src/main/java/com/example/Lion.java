package com.example;

import java.util.List;

public class Lion {

    Predator predator;
    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public Lion(Feline feline) {
        this.predator = feline;
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> eatMeat() throws Exception {
        return predator.getFood("Хищник");
    }
}

//Добавил тестов, не понимаю как добиться 100% покрытия, получилось 90%, не понятно на что еще нужны тесты?
