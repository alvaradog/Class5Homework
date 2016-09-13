
package real.world.object1;

public class StartUp {
    public static void main(String[] args) {
        Vehicle p100D= new ElectricCar();
        p100D.setMake("Tesla");
        p100D.setModel("P100D");
        p100D.accelerate();
        
        ElectricCar modelX = new ElectricCar();
        modelX.setMake("Tesla");
        modelX.setModel("Model X");
        modelX.setLithiumIonBatterySize(90);
        modelX.beginCharge();
    }
}
