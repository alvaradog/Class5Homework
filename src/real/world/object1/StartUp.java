
package real.world.object1;

public class StartUp {
    public static void main(String[] args) {
        Vehicle p100D= new ElectricCar();
        p100D.setMake("Tesla");
        p100D.setModel("P100D");
        p100D.accelerate();
        /*
        Example below shows casting
        due to only ElectricCar types being allowed to
        setLithiumIonBatterySize
        */
        ((ElectricCar)p100D).setLithiumIonBatterySize(100);
        System.out.println(p100D.getModel() + " has a battery size of "
                + ((ElectricCar)p100D).getLithiumIonBatterySize());
        
        
        ElectricCar modelX = new ElectricCar();
        modelX.setMake("Tesla");
        modelX.setModel("Model X");
        modelX.setLithiumIonBatterySize(90);
        modelX.beginCharge();
        modelX.accelerate();
        System.out.println(modelX.getModel() + " has a battery size of "
                + modelX.getLithiumIonBatterySize());
    }
}
