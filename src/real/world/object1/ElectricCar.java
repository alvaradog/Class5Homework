
package real.world.object1;

public class ElectricCar extends Car{
    //Property common to all electric cars, but not all cars
    private int lithiumIonBatterySize;

    public int getLithiumIonBatterySize() {
        return lithiumIonBatterySize;
    }

    public void setLithiumIonBatterySize(int lithiumIonBatterySize) {
        this.lithiumIonBatterySize = lithiumIonBatterySize;
    }
    
    //Method commong to all electric cars, but not all cars
    public final void beginCharge(){
        System.out.println("Electric vehicle is charging");
    }
}
