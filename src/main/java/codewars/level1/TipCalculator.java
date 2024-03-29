package codewars.level1;

public class TipCalculator {

    public static Integer calculateTip(double amount, String rating) {
        double tips = 0d;
        switch (rating.toLowerCase()) {
            case "terrible":
                tips = amount * 0 / 100;
                break;
            case "poor":
                tips = amount * 5 / 100;
                break;
            case "good":
                tips = amount * 10 / 100;
                break;
            case "great":
                tips = amount * 15 / 100;
                break;
            case "excellent":
                tips = amount * 20 / 100;
                break;
            default:
                return null;
        }
        return (int) Math.ceil(tips);
    }
}