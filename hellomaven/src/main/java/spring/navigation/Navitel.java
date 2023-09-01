package spring.navigation;

import spring.interfaces.NavigationSystem;

public class Navitel implements NavigationSystem {

    public boolean createRoute(){

        System.out.println("**********************");
        System.out.println("Route was create by Navitel");
        System.out.println("**********************");

        return true;
    }

}
