public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return this.altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing(){
        return "squeeeeezz";
    }
    public void takeOff(){
        System.out.println( this.getName() + " take off in the sky.");
    }

    public int ascend (int meters){
        this.altitude += meters;
        System.out.println (this.getName() + " fly upward, altitude : " + this.altitude);
        return this.altitude;
    }
    public int descend (int meters) {
        this.altitude -= meters;
        System.out.println(this.getName() + " fly upward, altitude : " + this.altitude);
        return this.altitude;
    }
    public void land (){
        if (!this.flying && this.altitude > 0) {
            this.flying = true;
            System.out.println(this.getName() + " is too high, it can't lands.");
        }
        else {
            System.out.println(this.getName() + " lands on the ground");
        }
    }
}
