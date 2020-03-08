package com.shopping.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorUtil {
    private static final Pattern MOBILE_PATTERN = Pattern.compile("1\\d{10}");
   /* private static final Pattern test = Pattern.compile("\\d{1,}");
    public static void main(String[] args) {
        System.out.println("\\===");
        Matcher matcher = test.matcher("111111111www5551111166aa661111ccc1");
        String result = matcher.replaceAll("{");
        System.out.println(result);

        System.out.println(MOBILE_PATTERN.matcher("28373320883").matches());
    }*/
    public static boolean isMobile(String value){
        System.out.println("value"+ value);
        Matcher matcher = MOBILE_PATTERN.matcher(value);
        return matcher.matches();
    }
}
