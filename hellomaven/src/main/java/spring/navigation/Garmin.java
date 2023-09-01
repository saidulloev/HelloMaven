package spring.navigation;

import spring.interfaces.NavigationSystem;

public class Garmin implements NavigationSystem {

    public boolean createRoute(){
        System.out.println("**********************");
        System.out.println("Route was create by garmin");
        System.out.println("**********************");
        return true;
    }

}
