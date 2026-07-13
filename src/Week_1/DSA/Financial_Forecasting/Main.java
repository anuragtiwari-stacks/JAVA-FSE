package Week_01.DSA.Financial_Forecasting;

public class Main
{
    public static void main(String[] args)
    {
        double presentValue = 10000.0;
        double growthRate = 0.10; // 10%
        int years = 5;

        double futureValue = FinancialForecast.forecast(presentValue, growthRate, years);

        System.out.println("Present Value : ₹" + presentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);

        System.out.printf("Future Value  : ₹%f", futureValue);
    }
}