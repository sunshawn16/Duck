package Duck;

import Duck.GeneralDuck;
import Behavior.*;

/**
 * Created by sun on 14-12-27.
 */
public class RobotDuck extends Duck implements Fly,Climb {


    @Override
    public void climb() {
        System.out.println("climb");
    }

    @Override
    public void fly() {
        System.out.println("fly");

    }
}
