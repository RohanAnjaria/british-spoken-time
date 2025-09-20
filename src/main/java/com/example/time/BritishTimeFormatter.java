package com.example.time;

public class BritishTimeFormatter {

    public static String toSpokenForm(int hour, int minute) {
        if (hour == 0 && minute == 0) return "midnight";
        if (hour == 12 && minute == 0) return "noon";

        if (minute == 0) return NumberWord.fromInt(hour) + " o'clock";
        if (minute == 15) return "quarter past " + NumberWord.fromInt(hour);
        if (minute == 30) return "half past " + NumberWord.fromInt(hour);
        if (minute == 45) return "quarter to " + NumberWord.fromInt(hour + 1);

        if (minute < 30) {
            return NumberToWords.convert(minute) + " past " + NumberWord.fromInt(hour);
        } else {
            int remaining = 60 - minute;
            return NumberToWords.convert(remaining) + " to " + NumberWord.fromInt(hour + 1);
        }
    }
}
