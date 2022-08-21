package com.sreenu.DataStructures;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by SreenUNaik on 01-Oct-18.
 */
public class PerfectPthPowers {
    protected static final double LOG2 = Math.log(2.0);
    protected static final int MAX_DIGITS_2 = 977;
    protected static final double LOG10 = Math.log(10.0);
    protected static final int MAX_DIGITS_10 = 294;

    public static void main(String[] args) {

        BigDecimal number  = new BigDecimal("0.2");
        for(int i=1;i<number.longValue();i++){
            double lognumber = PerfectPthPowers.logBigDecimal(number);
            double ilog = PerfectPthPowers.logBigDecimal(BigDecimal.valueOf(i));
            double f = lognumber/ ilog;
            System.out.println("i::"+i+"Log Number :"+lognumber+"ilog::"+ilog+"f ::"+f);
            f = (double) Math.round(f * 100) / 100;
            System.out.println(f +" rounded is "+ f);
            if(f - (int)f == 0.0) {
                System.out.println((int)f);
                break;
            }
        }
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
    public static double logBigDecimal(BigDecimal val) {
        if (val.signum() < 1)
            return val.signum() < 0 ? Double.NaN : Double.NEGATIVE_INFINITY;
        int digits = val.precision() - val.scale();
        if (digits < MAX_DIGITS_10 && digits > -MAX_DIGITS_10)
            return Math.log(val.doubleValue());
        else
            return logBigInteger(val.unscaledValue()) - val.scale() * LOG10;
    }

}
