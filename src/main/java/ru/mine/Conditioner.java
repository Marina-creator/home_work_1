package ru.mine;

public class Conditioner {
    private int temperature;
    private String name;

    public Conditioner(int temperature, String name) {
        this.temperature = temperature;
        this.name = name;
    }

    void makeItBlow () {
        if (temperature >= 24) {
            System.out.println("Включить охлаждение");
        } else if (temperature < 18) {
            System.out.println("Включить обогрев");
        } else {
            System.out.println("Температура в порядке! Наслаждаться!");
        }

    }
}
