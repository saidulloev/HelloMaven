package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.audio.Sony;
import spring.car.Audi;
import spring.car.Kia;
import spring.interfaces.AudioSystem;
import spring.interfaces.NavigationSystem;
import spring.navigation.Navitel;

@Configuration
public class Config {

    @Bean
    public AudioSystem sonyAudio(){
        return new Sony();
    }

    @Bean
    public NavigationSystem navitelNav(){
        return new Navitel();
    }

    @Bean
    public Audi car(AudioSystem audioSystem, NavigationSystem navigationSystem){
        return new Audi(audioSystem,navigationSystem);
    }

    @Bean
    public Kia car2(){
        return new Kia();
    }

}
