package spring.audio;


import spring.interfaces.AudioSystem;

public class Kenwood implements AudioSystem {

    public void playCD(){
        System.out.println("**********************");
        System.out.println("Music from kenwood cd");
        System.out.println("**********************");
    }

    public void playRadio(){
        System.out.println("**********************");
        System.out.println("Radio from kenwood");
        System.out.println("**********************");
    }

}
