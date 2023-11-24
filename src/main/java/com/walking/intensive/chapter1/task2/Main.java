package com.walking.intensive.chapter1.task2;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int floors = 10;
        int entrances = 3;
        int numDoors = 40;

        System.out.println(getFlatLocation(floors, entrances, numDoors));
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        int introductoryFlats = 4;
        int flatsPerEntrance = (floorAmount * introductoryFlats) / entranceAmount;
        int entranceNumber = (flatNumber - 1) / flatsPerEntrance + 1;
        int flatWithinEntrance = (flatNumber - 1) % flatsPerEntrance;
        int floorNumber;
        if (floorAmount % 2 == 0) {
            floorNumber = (flatWithinEntrance / introductoryFlats) % floorAmount + 1;
        } else {
            floorNumber = floorAmount - (flatWithinEntrance / introductoryFlats) % floorAmount;
        }

        int position = flatWithinEntrance % introductoryFlats;
        String positionDirection = (position < 2) ? "справа" : "слева";
        String fromElevatorDirection = (position % 2 == 0) ? "вправо" : "влево";

        if (flatNumber > floorAmount * entranceAmount * introductoryFlats || flatNumber <= 0) {
            return "Такой квартиры нет.";
        }
        return flatNumber + " кв - " + entranceNumber + " подъезд, " + floorNumber + " этаж, " + positionDirection
                + " от лифта, " + fromElevatorDirection;
    }
}