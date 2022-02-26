package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        Weekdays weekdays = Weekdays.valueOf(a);

        switch (weekdays) {
            case DUYSHOMBU  -> System.out.println("Дуйшомбу куну жава-техникалык сабак болот.");
            case SHEYSHEMBI -> System.out.println("Шейшемби куну Софт Скилл сабагы болот.");
            case SHARSHEMBI -> System.out.println("Шаршемби куну жава-техникалык сабак болот.");
            case BEYSHEMBI  -> System.out.println("Бейшемби куну англис тили сабагы болот.");
            case JUMA       -> System.out.println("Жума куну жава-техникалык сабак болот.");
            case ISHEMBI    -> System.out.println("Ишемби куну чон ментор менен практикалык сабак болот.");
            case ZHEKSHEMBI -> System.out.println("Жекшемби куну эс алуу.");
        }
    }
}
