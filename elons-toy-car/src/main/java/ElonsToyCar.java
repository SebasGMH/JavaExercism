public class ElonsToyCar {

    private int dist = 0;
    private int battery = 100;

    public static ElonsToyCar buy() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
        return "Driven " + dist + " meters";
        //return display;
    }

    public String batteryDisplay() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
        if(battery <= 0){
            return "Battery empty";
        }

        return "Battery at " + battery + "%";
        // return display;
    }

    public void drive() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");

        //battery drained
        if (battery <= 0){
            return;
        }

        // per drive is 20 meters and -1 battery
        dist += 20;
        battery--;
    }
}
