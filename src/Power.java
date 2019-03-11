public class Power {
    private int invalidInput = 0;
    public double Power(double base, int exponent) {
        double result = 1;
        invalidInput = 0;
        if (equal(base, 0.0) && exponent < 0) {
            invalidInput = 1;
            return 0.0;
        }
        if (exponent < 0)
            exponent = -exponent;
        result = powerByBaseAndExponent(base, exponent);

        if (exponent < 0)
            result = 1/result;
        return result;


    }

    private boolean equal(double m, double n) {
        return ((m - n) <= 0.0000001 && (n - m) <=0.0000001) ;
    }

    private double powerByBaseAndExponent(double base, int exponent) {
        double result = 1.0;
        if (exponent == 0) {
            return result;
        }
        if (exponent == 1) {
            return result *base;
        }
        result = powerByBaseAndExponent(base, exponent>>1);
        result *= result;
        if ((exponent % 2) == 1) {
            result *= base;
        }
        return result;
    }
//    private double powerByBaseAndExponent(double base, int exponent) {
//        double result = 1.0;
//        for (int i = 0; i < exponent; i++) {
//            result *= base;
//        }
//        return result;
//    }

    public static void main(String[] args) {
        Power power = new Power();
        System.out.println(power.powerByBaseAndExponent(2,3));
    }
}
