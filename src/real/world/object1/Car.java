
package real.world.object1;

public abstract class Car implements Vehicle{
    // Common instance property inherited by all sub-classes
   private String make;

   @Override
    public String getModel() {
        return model;
    }

   @Override
    public void setModel(String model) {
        this.model = model;
    }
   private String model;

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
