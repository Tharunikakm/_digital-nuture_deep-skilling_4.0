public class FinancialForecast {

    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        
        if (years == 0) {
            return currentValue;
        }
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000.0;
        double growthRate = 0.08; // 8% per year
        int forecastYears = 5;

        double futureValue = predictFutureValue(initialInvestment, growthRate, forecastYears);
        System.out.printf("📊 Future value after %d years: ₹%.2f\n", forecastYears, futureValue);
    }
}