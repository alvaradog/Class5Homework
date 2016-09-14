/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.world.object3;

/**
 *
 * @author alvar
 */
public class Car extends Vehicle{
    //A property common to all cars, but not all vehicles
    private int wheelCount;

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
    
    
    
}
