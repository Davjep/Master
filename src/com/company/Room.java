package com.company;

import java.util.Scanner;

public class Room {


    public Room(String roomType) {
        if (roomType == "startingRoom") {
            //Första rummet som spelaren kommer till. Spelaren får ett val att gå norr eller söder
            System.out.println("There's an old man coming up to you, he says: ");
            System.out.println("You stuck in this cave now!" +
                    "To get out of here, you will need to go through a couple of rooms" +
                    "You will meet monsters, dragons and untold dangers through the way!" +
                    "You have to choose to go south(1) or north(2) from here, choose carefully!");
        } else if (roomType == "riddleRoom") {
            System.out.println("You are now in the Riddleroom. On the ground you see an axe. You pick up the weapon.");
            Item axe = new Item("Axe", 1);
            System.out.println("You will need to answer correctly on the following riddle " +
                    "in order to receive a gift. If not, you will face a losers challenge");
            System.out.println("What moves without feet?");
        }
        else if (roomType == "monsterRoom2"){

        }
        else if (roomType == "correctAnswerRoom"){

        }

    }
    /* public void startingRoom {
        //Första rummet som spelaren kommer till. Spelaren får ett val att gå norr eller söder
        System.out.println("There's an old man coming up to you, he says: ");
        System.out.println("You stuck in this cave now!" +
                "To get out of here, you will need to go through a couple of rooms" +
                "You will meet monsters, dragons and untold dangers through the way!" +
                "You have to choose to go south(1) or north(2) from here, choose carefully!");
    }*/

    public int choice() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public boolean riddle(String riddle) {
        boolean answer;
        if (riddle.equalsIgnoreCase("clock")) {
            System.out.println("Correct Answer!");
            answer = true;
        }
        else {
            System.out.println("That is incorrect...");
            answer = false;
        }
        return answer;
    }

    public void MonsterRoom(String roomNumber) {

    }

    public static void CorrectAnswerRoom1() {
        System.out.println("");
    }

    public static void RiddleRoom2() {
    }

    public static void MonsterRoom2() {
    }

    public static void MonsterRoom3() {
    }

    public static void DragonRoom() {
    }
}