package ru.mine;

public class Conditioner {
    private int temperature;
    private String nameOfCond;

    public Conditioner(int temperature, String nameOfCond) {
        this.temperature = temperature;
        this.nameOfCond = nameOfCond;
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

    void playMusic () {
       if (nameOfCond == "Samsung" || nameOfCond == "Zanussi") {
           System.out.println("Play DIE ANTWOORD - BABY'S ON FIRE");
       } else if (nameOfCond == "Electrolux") {
           System.out.println("Play Альфред Шнитке - Полет");
       } else {
           System.out.println("Keep silent");
       }
    }
}
