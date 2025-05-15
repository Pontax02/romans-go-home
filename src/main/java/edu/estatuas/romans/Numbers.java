package edu.estatuas.romans;

import java.util.EnumSet;


public enum Numbers {

    ONE('I',1),
    FIVE('V',5),
    TEN('X',10),
    FIFTY('L',50),
    ONEHUNDRED('C',100),
    FIVEHUNDRED('D',500),
    THOUSAND('M',1000);

    private char symbol;
    private int value;

    Numbers(char symbol,int value) {
        this.symbol = symbol;
        this.value = value;

    }





}
