package Duck;

import Duck.Duck;
import Behavior.*;

/**
 * Created by sun on 14-12-27.
 */
public class RubberDuck extends Duck implements Swim, Climb {

    @Override
    public void climb() {
        System.out.println("can climb");
    }

    @Override
    public void swim() {
        System.out.println("can climb");

    }
}

