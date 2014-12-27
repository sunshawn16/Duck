package Duck;

import Behavior.*;
import Duck.Duck;

/**
 * Created by sun on 14-12-27.
 */
public class DonaldDuck extends Duck implements Climb, Eat {


    @Override
    public void climb() {
        System.out.println("can climb");
    }

    @Override
    public void eat() {
        System.out.println("can eat");

    }
}
