package Duck;

import Duck.Duck;
import Behavior.*;

/**
 * Created by sun on 14-12-27.
 */
public class GeneralDuck extends Duck implements Fly, Eat {
//    Behavior.Fly fly;

    @Override
    public void eat() {
        System.out.println("can eat");

    }

    @Override
    public void fly() {
        System.out.println("can fly");

    }







}

