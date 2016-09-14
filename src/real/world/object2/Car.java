
package real.world.object2;

public abstract class Car extends Vehicle{
    // Common instance property inherited by all sub-classes
   private String make;
   private String model;

   @Override
    public String getModel() {
        return model;
    }

   @Override
    public void setModel(String model) {
        this.model = model;
    }

   @Override
    public String getMake() {
        return make;
    }

   @Override
    public void setMake(String make) {
        this.make = make;
    }
    
    @Override
    public final void accelerate(){
        System.out.println(this.model + " is accelerating");
    }
}
