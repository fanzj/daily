package com.daily.demo;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BigDecimal yield = new BigDecimal("3.5256");
        BigDecimal a = yield.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(a);

    }
}
