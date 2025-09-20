package com.example.time;

public enum NumberWord {
    ONE(1, "one"), TWO(2, "two"), THREE(3, "three"), FOUR(4, "four"),
    FIVE(5, "five"), SIX(6, "six"), SEVEN(7, "seven"), EIGHT(8, "eight"),
    NINE(9, "nine"), TEN(10, "ten"), ELEVEN(11, "eleven"), TWELVE(12, "twelve");

    private final int number;
    private final String word;

    NumberWord(int number, String word) {
        this.number = number;
        this.word = word;
    }

    public static String fromInt(int n) {
        int index = ((n - 1) % 12 + 12) % 12; // wrap safely in 12-hour format
        return values()[index].word;
    }
}
