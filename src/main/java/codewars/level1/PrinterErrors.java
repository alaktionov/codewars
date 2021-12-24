package codewars.level1;

public class PrinterErrors {

    public static String printerError(String s) {
        int total = 0;
        int errors = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                    total++;
                    break;
                case 'b':
                    total++;
                    break;
                case 'c':
                    total++;
                    break;
                case 'd':
                    total++;
                    break;
                case 'e':
                    total++;
                    break;
                case 'f':
                    total++;
                    break;
                case 'g':
                    total++;
                    break;
                case 'h':
                    total++;
                    break;
                case 'i':
                    total++;
                    break;
                case 'j':
                    total++;
                    break;
                case 'k':
                    total++;
                    break;
                case 'l':
                    total++;
                    break;
                case 'm':
                    total++;
                    break;
                default:
                    total++;
                    errors++;
                    break;
            }
        }
        return errors + "/" + total;
    }
}