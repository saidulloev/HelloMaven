package no_spring;

import no_spring.car.Audi;

public class Main {

    public static void main(String[] args) {
        Audi audi = new Audi();

        audi.move();
        audi.audioSystem.playRadio();

    }

}
