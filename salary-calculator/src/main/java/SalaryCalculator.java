public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
       // throw new UnsupportedOperationException("Please implement the SalaryCalculator.multiplierPerDaysSkipped() method");
        return daysSkipped <= 5 ? 1 : .85;        
    }

    public int multiplierPerProductsSold(int productsSold) {
        //throw new UnsupportedOperationException("Please implement the SalaryCalculator.multiplierPerProductsSold() method");
        return productsSold <= 20 ? 10 : 13;
    }

    public double bonusForProductSold(int productsSold) {
        //throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductSold() method");
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
       // throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
        
       double salary = 1000*multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
       return salary <= 2000 ? salary : 2000;
    } 
}
