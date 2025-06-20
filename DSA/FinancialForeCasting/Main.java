package Week_1_DP_DSA.DSA.FinancialForeCasting;

// No mandatory imports required for this simple program
// import java.text.DecimalFormat; // Optional, not used here

public class Main {

    // Recursive method to calculate future value with annual compound growth
    public static double calculateFutureValueRecursive(double principal, double rate, int years) {
        // Base case
        if (years == 0) {
            return principal;
        }
        // Recursive case
        return calculateFutureValueRecursive(principal * (1 + rate), rate, years - 1);
    }

    // Iterative version (optimized)
    public static double calculateFutureValueIterative(double principal, double rate, int years) {
        for (int i = 0; i < years; i++) {
            principal *= (1 + rate);
        }
        return principal;
    }

    public static void main(String[] args) {
        double initialInvestment = 10000.0;
        double annualGrowthRate = 0.05;
        int forecastYears = 5;

        // Recursive calculation
        double recursiveResult = calculateFutureValueRecursive(initialInvestment, annualGrowthRate, forecastYears);
        System.out.printf("Future value (Recursive): %.2f%n", recursiveResult);

        // Iterative calculation
        double iterativeResult = calculateFutureValueIterative(initialInvestment, annualGrowthRate, forecastYears);
        System.out.printf("Future value (Iterative): %.2f%n", iterativeResult);
    }
}

