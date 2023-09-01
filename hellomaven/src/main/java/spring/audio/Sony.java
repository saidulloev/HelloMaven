package spring.audio;

import spring.interfaces.AudioSystem;

public class Sony implements AudioSystem {

    public void playCD(){
        System.out.println("**********************");
        System.out.println("Music from sony cd");
        System.out.println("**********************");
    }

    public void playRadio(){
        System.out.println("**********************");
        System.out.println("Radio from sony");
        System.out.println("**********************");
    }

}
