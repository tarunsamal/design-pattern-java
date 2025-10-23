package org.tarun.oop.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.display();

        weatherStation.setTemp(100);

        weatherStation.subscribe(new LaptopDevice());
        weatherStation.subscribe(new MobileDevice());
        weatherStation.subscribe(new TVDevice());

        weatherStation.setTemp(-10);

        weatherStation.setTemp(50);
    }
}
