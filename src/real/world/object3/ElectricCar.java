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
public class ElectricCar extends Car{
    //Property common to all Electric Cars, but not all Cars
    private int lithiumIonBatterySize;

    public int getLithiumIonBatterySize() {
        return lithiumIonBatterySize;
    }

    public void setLithiumIonBatterySize(int lithiumIonBatterySize) {
        this.lithiumIonBatterySize = lithiumIonBatterySize;
    }
    
    //A method common to all electric cars, but not all cars
    public final void beginCharge(){
        System.out.println("Electric vehicle is charging");
    }
}
