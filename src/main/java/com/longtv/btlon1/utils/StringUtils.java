package com.longtv.btlon1.utils;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static boolean isNumber(String data) {

        if (data.matches("")) {
            return false;
        }

        try{
            int page = Integer.parseInt(data);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public static boolean isLocalDate(String data) {
        if (data.matches("")) {
            return false;
        }

        try{
            LocalDate.parse(data);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }


    public static void main(String[] args) {
        System.out.println(validate("longthan366@gmail.com"));
    }
}
