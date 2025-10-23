package org.tarun.oop.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/*
Subject
 */
public class WeatherStation {
    private List<Device> devices = new ArrayList<>();
    private int temp;

    public void subscribe(Device device) {
        devices.add(device);
    }

    public void unSubscribe(Device device) {
        devices.remove(device);
    }

    public void setTemp(int temp) {
        this.temp = temp;
        display();
        for (Device device : devices) {
            device.updateTemp(temp);
        }
    }

    public void display() {
        System.out.println("WeatherStation :" + temp);
    }
}
