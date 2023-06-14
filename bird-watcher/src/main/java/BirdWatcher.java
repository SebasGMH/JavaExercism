import java.time.DayOfWeek;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
        int[] last_week = {0, 2, 5, 3, 7, 8, 4};
        return last_week;
    }

    public int getToday() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
        birdsPerDay[birdsPerDay.length - 1] = birdsPerDay[birdsPerDay.length - 1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
        for (int c : birdsPerDay){
            if (c == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
        int sum = 0;
        for (int i = 0; i < numberOfDays; i++){
            sum = sum + birdsPerDay[i];
            if (i == 6){
                break;
            }
        }
        return sum;
    }

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
        int busy =0;
        for (int d : birdsPerDay){
            if (d >= 5){
                busy++;
            }
        }
        return busy;
    }
}
