package spring.car;

import spring.interfaces.AudioSystem;
import spring.interfaces.Car;
import spring.interfaces.NavigationSystem;

public class Audi implements Car {

    public AudioSystem audioSystem;
    public NavigationSystem navigationSystem;

    public Audi(){

    }

    public Audi(AudioSystem audioSystem, NavigationSystem navigationSystem){
        this.audioSystem = audioSystem;
        this.navigationSystem = navigationSystem;
    }

    public AudioSystem getAudioSystem() {
        return audioSystem;
    }

    public void setAudioSystem(AudioSystem audioSystem) {
        this.audioSystem = audioSystem;
    }

    public NavigationSystem getNavigationSystem() {
        return navigationSystem;
    }

    public void setNavigationSystem(NavigationSystem navigationSystem) {
        this.navigationSystem = navigationSystem;
    }

    public void init(){
        System.out.println("Composing your new car...");
    }

    public void move(){
        System.out.println("**********************");
        System.out.println("Audi in action");
        System.out.println("**********************");
    }

}
