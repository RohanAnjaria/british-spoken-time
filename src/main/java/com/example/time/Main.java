package com.example.time;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time (HH:mm): ");
        String input = scanner.nextLine();

        try {
            LocalTime time = LocalTime.parse(input);
            String spoken = BritishTimeFormatter.toSpokenForm(time.getHour(), time.getMinute());
            System.out.println("Spoken form: " + spoken);
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter time as HH:mm (e.g., 14:05).");
        }
    }
}
