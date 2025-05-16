package edu.estatuas.romans;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Romans {

    final String romanNumber;
    Pattern pattern = Pattern.compile("[IVXLCDM]");
    Matcher matcher =pattern.matcher(getRomanNumber());

    public Romans(String romanNumber) {
        this.romanNumber = romanNumber;

    }
    public String getRomanNumber() {
        return this.romanNumber;
    }


    public short toDecimal() {

            for (char symbol : this.romanNumber.toCharArray()) {
                if(matcher.find()) {


                }

            }


        return 0;

    }

}
