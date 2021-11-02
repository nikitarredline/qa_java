package com.example;

import java.util.List;

public class Alex extends Lion {

    private static final Feline feline = new Feline();

    public Alex() throws Exception {
        super("Самец", feline);
    }

    public int getKittens() {
        return getKittens(0);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский Зоопарк";
    }
}
