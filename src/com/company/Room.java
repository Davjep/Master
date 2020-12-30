package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Room {
    Player myHero;
    //Första rummet som spelaren kommer till. Spelaren får ett val att gå norr eller söder

    /*public Room(String roomType) {
        if (roomType == "StartingRoom") {

        }*/


    Player myHero = new Player();

    public int StartingRoom() { //ska det stå int eller void?
        System.out.println("There's an old man coming up to you, he says: ");
        System.out.println("You stuck in this cave now!" +
                "To get out of here, you will need to go through a couple of rooms" +
                "You will meet monsters, dragons and untold dangers through the way!" +
                "You have to choose to go south(1) or north(2) from here, choose carefully!");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
        if (choice == true) {
            Room.RiddleRoom1(); // ska detta kallas härifrån? eller från dungeon?
        } else {
            Room.MonsterRoom1();
        }
    }

    public String MonsterRoom(String roomNumber) {

    }

    public static void RiddleRoom1() {
        System.out.println("You are now in the Riddleroom. On the ground you see an axe. You pick up the weapon.");
        Item axe = new Item("Axe", 1);
        myHero.setDamage(2);
        System.out.println("You will need to answer correctly on the following riddle " +
                "in order to receive a gift. If not, you will face a losers challenge");
        System.out.println("What moves without feet?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("clock")) {
            System.out.println("Correct Answer!");
            Room.CorrectAnswerRoom1();
        } else {
            System.out.println("That is incorrect...");
        }
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
