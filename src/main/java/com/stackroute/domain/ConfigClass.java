package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    public Actor Prabh()
    {
        Actor actor=new Actor();
        actor.setAge(34);
        actor.setGender("male");
        actor.setName("Prabhas");
        return actor;

    }
    @Bean(name={"Darling","Bahubali"})
    public Movie movieBean()//bean name is movieBean
    {
        Movie movie=new Movie(Prabh());
        return movie;

    }
}
