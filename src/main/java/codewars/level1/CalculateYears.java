package codewars.level1;

public class CalculateYears {

    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int years = 0;
        while (principal < desired) {
            principal += principal * interest * (1 - tax);
            years++;
        }
        return years;
    }
}