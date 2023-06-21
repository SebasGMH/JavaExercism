public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRateperHour() method");
        // multiply by 221 then multiply by sucess rate

        // 0 case and out of range
        if (speed <= 0 || speed > 10){
            return 0;
        }

        double prod = speed * 221;
        
        if (speed >= 1 && speed <= 4){
            return prod;
        }
        else if(speed >= 5 && speed <= 8){
            return prod * .9;
        }
        else if (speed == 9){
            return prod * .8;
        }
        else{
            return prod * .77;
        }
    }

    public int workingItemsPerMinute(int speed) {
       // throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
       // use perhour function, divide by 60 and round down

       double prod = productionRatePerHour(speed);
       prod /= 60;
       return (int) prod;
    }
}
