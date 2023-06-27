class NeedForSpeed {

    private int speed;
    private int battery_drain;
    private int battery = 100;
    private int dist_driven;

    public NeedForSpeed(int speed, int battery_drain){
        this.speed = speed;
        this.battery_drain = battery_drain;
    }

    public boolean batteryDrained() {
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
        if (battery < battery_drain){
            return true;
        }
        return false;
    }

    public int distanceDriven() {
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
        return dist_driven;
    }

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
        
        // if under battery drain , cant drive
        if (battery < battery_drain){
            return;
        }

        // else drive speed and subtract battery drain
        dist_driven += speed;
        battery -= battery_drain;
    }

    public static NeedForSpeed nitro() {
        //throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
        // static because there doesnt have to be a existing car to use this function
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int track_length;

    public RaceTrack( int track_length){
        this.track_length = track_length;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        //throw new UnsupportedOperationException("Please implement the RaceTrack.tryFinishTrack() method");
        // using loop strat, but may be able to use arithmetic to reduce runtime cost
        while (car.distanceDriven() < track_length){
            if (car.batteryDrained()){
                return false;
            }
            car.drive();
        }
         // completes track length
         return true;
    
    }
}
