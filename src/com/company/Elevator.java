package com.company;

public class Elevator {

    int currentFloor = 1;
    int minFloor;
    int maxFloor;
    int floor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveDown() {
        if (currentFloor == minFloor) {
            return currentFloor;
        } else {
            currentFloor--;
        }
        return currentFloor;
    }

    public int moveUp() {
        if (currentFloor == maxFloor) {
            return currentFloor;
        } else {
            currentFloor++;
        }
        return currentFloor;
    }

    public int move(int floor) {
        if (floor >= currentFloor & floor <= maxFloor) {
            while (floor != currentFloor)
                moveUp();
            return floor;
        } else if (floor <= currentFloor & floor >= minFloor) {
            while (floor != currentFloor)
                moveDown();
            return floor;
        } else error();
        return floor;
    }

    public void error() {
        System.out.println("Cant do it!");
    }

}
