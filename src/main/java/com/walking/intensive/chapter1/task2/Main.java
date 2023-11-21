package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int floors = 4;
        int entrances = 2;
        int numDoors = 33;

        System.out.println(getFlatLocation(floors, entrances, numDoors));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int introductoryApatrments = 4;
        int apartmentsEntrance = (floorAmount * introductoryApatrments) / entranceAmount;
        int entranceNumber = (flatNumber - 1) / apartmentsEntrance + 1;
        int floorNumber = ((flatNumber - 1) % apartmentsEntrance) / introductoryApatrments + 1;

        int position = ((flatNumber - 1) % introductoryApatrments) / 2;
        String direction = (flatNumber % 2 == 0) ? "вправо" : "слева";

        if (flatNumber > floorAmount * entranceAmount * introductoryApatrments) {
            System.out.println("Такой квартиры нет.");
        }
        return  floorNumber + " кв - " + entranceNumber + " подъезд, " + position + " этаж, " + direction
                + " от лифта.";
    }
}