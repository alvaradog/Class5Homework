
package real.world.object1;

public class ElectricCar extends Car{
    
    private int lithiumIonBatterySize;

    public int getLithiumIonBatterySize() {
        return lithiumIonBatterySize;
    }

    public void setLithiumIonBatterySize(int lithiumIonBatterySize) {
        this.lithiumIonBatterySize = lithiumIonBatterySize;
    }
    
    public final void beginCharge(){
        System.out.println("Electric vehicle is charging");
    }
}
