package asrobots;

import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

public class MyRobot extends Robot {

    @Override
    public void run() {
        setBodyColor(Color.pink);
        setGunColor(Color.green);
        setRadarColor(Color.black);
        setBulletColor(Color.green);
        setScanColor(Color.green);

        while (true) {
            ahead(200);
            turnLeft(30);
            fireBullet(1);
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        super.onScannedRobot(event);
    }
}
