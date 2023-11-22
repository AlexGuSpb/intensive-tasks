package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int floors = 4;
        int entrances = 2;
        int numDoors = 1;

        System.out.println(getFlatLocation(floors, entrances, numDoors));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int introductoryFlats = 4;
        int flatsPerEntrance = (floorAmount * introductoryFlats) / entranceAmount;
        int entranceNumber = (flatNumber - 1) / flatsPerEntrance + 1;
        int flatWithinEntrance = (flatNumber - 1) % flatsPerEntrance;
        int floorNumber = flatWithinEntrance / introductoryFlats + 1;

        int position = flatWithinEntrance % introductoryFlats;
        String positionDirection = (position < 2) ? "слева" : "справа";
        String fromElevatorDirection = (position % 2 == 0) ? "влево" : "вправо";

        if (flatNumber > floorAmount * entranceAmount * introductoryFlats || flatNumber <= 0) {
            return "Такой квартиры нет.";
        }
        return flatNumber + " кв — " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + positionDirection
                + " от лифта, " + fromElevatorDirection + ".";
    }
}