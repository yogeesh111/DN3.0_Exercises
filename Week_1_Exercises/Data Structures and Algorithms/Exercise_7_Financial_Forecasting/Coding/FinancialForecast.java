package Exercise_7_Financial_Forecasting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FinancialForecast {
    private static Map<Integer, Double> memo = new HashMap<>();;
    public static double predictValue(double currentValue, double growthRate, int years)
    {
        if(years==0)
        {
            return currentValue;
        }
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        double value= predictValue(currentValue*(1+growthRate),growthRate,years-1);
        memo.put(years,value);
        return value;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double currntValue;
        double growthRate;
        int years;
        System.out.println("Enter the Current Value: ");
        currntValue=in.nextDouble();
        System.out.println("Enter the growth rate: ");
        growthRate=in.nextDouble();
        System.out.println("Enter Years: ");
        years=in.nextInt();

        double ans=predictValue(currntValue,growthRate,years);

        System.out.println(ans);

    }
}
