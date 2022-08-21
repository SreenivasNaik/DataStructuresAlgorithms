package com.sreenu.DataStructures;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created By Sreenivasnaik.Mudava on 10/1/2018
 */
public class PerfectPower {
    protected static final double LOG2 = Math.log(2.0);
    protected static final int MAX_DIGITS_2 = 977;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("input::"+input);
        if(!input.startsWith("-") && !input.contains(".")){
           BigInteger data = new BigInteger(input);
            System.out.println("Perfect Power::"+PerfectPower.perfect(data));
        }
        else if(!input.startsWith("-") && input.contains(".")){
            BigDecimal data = new BigDecimal(input);
            System.out.println("Perfect Power::"+PerfectPower.perfectDecimal(data));
        }
        else if(input.startsWith("-") && !input.contains(".")){
            System.out.println("Negative Number");
            BigInteger data = new BigInteger(input.substring(1));
            int power = PerfectPower.perfectNegative(data);
             System.out.println("Perfect Power::"+(power));

        }
        else if(input.startsWith("-") && input.contains(".")){
            BigDecimal data = new BigDecimal(input.substring(1));
            int power = PerfectPower.perfectDecimal(data);
            if(power%2!=0){
                System.out.println("Perfect Power::"+(-power));
            }
        }
    }
    static int perfect(BigInteger number){
        int power =0;
        for(int i=1;i<=number.longValue();i++){
            double f = PerfectPthPowers.logBigInteger(number)/ PerfectPthPowers.logBigInteger(BigInteger.valueOf(i));
            f = (double) Math.round(f * 100) / 100;
            if(f - (int)f == 0.0) {
                power = (int)f;
                break;
            }
        }
        return power;
    }
    static int perfectNegative(BigInteger number){
        int power =0;
        for(long i=0;i<number.longValue();i++) {
            double f = PerfectPthPowers.logBigInteger(number) / PerfectPthPowers.logBigInteger(BigInteger.valueOf(i));
            f = (double) Math.round(f * 100) / 100;
            if (f - (int) f == 0.0) {
                if ((int) f % 2 != 0) {
                    power = (int) (f);
                    break;
                    //break;
                }
            }
        }
        return power;
    }
    static int perfectDecimal(BigDecimal number){
        int precision = Math.max(0, number.stripTrailingZeros().scale());
        int pow = (int)Math.pow(10,precision);
        System.out.println("pr"+precision+"pow"+pow);
        BigInteger up = number.multiply(BigDecimal.valueOf(pow)).toBigInteger();
        BigInteger down = BigInteger.valueOf(pow);
        int pthDown = PerfectPower.perfect(down);
        System.out.println("pthUp"+up);
        System.out.println(down+"::pth down::"+pthDown);
        int pthup =1;
        for(int i=1;i<=up.longValue();i++){
            double f = PerfectPower.logBigInteger(up)/ PerfectPower.logBigInteger(BigInteger.valueOf(i));
            f = (double) Math.round(f * 100) / 100;
           // System.out.println(f+"::pth up::"+(f - (int)f));
            if(f - (int)f == 0.0 && pthDown == (int)f) {
                pthup = (int)f;
                break;
            }
        }
        return pthup;

    }

    public static double logBigInteger(BigInteger val) {
        if (val.signum() < 1)
            return val.signum() < 0 ? Double.NaN : Double.NEGATIVE_INFINITY;
        int blex = val.bitLength() - MAX_DIGITS_2; // any value in 60..1023 works ok here
        if (blex > 0)
            val = val.shiftRight(blex);
        double res = Math.log(val.doubleValue());
        return blex > 0 ? res + blex * LOG2 : res;
    }


}

