package com.springboot.demo.mycoolapp.InterfaceImplementation;

import com.springboot.demo.mycoolapp.interfaces.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Primary -- if not mentioned specifically go with the @primary annotation

@Component
@Lazy
public class FootBallCoachImplementation implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Try working on the footsteps";
    }
}
