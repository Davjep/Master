package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DungeonMaster {
    ArrayList<String> room = new ArrayList<>();

    public DungeonMaster() {
        //Startmeny och val att antigen starta ett nytt spel eller avsluta
        System.out.println("Welcome to Dragon Treasure. Choose one of the following options: ");
        System.out.println("Start new game (1)");
        System.out.println("Exit (2)");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("Enter name: ");
            String name = scanner.next();
            Player myHero = new Player(name, 10, 1);
            System.out.printf("The adventure begins %s...", name, "%n");
            Dungeon dungeon = new Dungeon();  // spel startar
            dungeon.playGame();
            Room startingRoom = new Room("StartingRoom");
            if (startingRoom.choice() == 1) {
                Room riddleRoom = new Room("riddleRoom");
                myHero.setDamage(1);
                scanner = new Scanner(System.in);
                String riddle = scanner.nextLine();
                if (riddleRoom.riddle(riddle) == true) {
                    Room correctAnswerRoom = new Room("correctAnswerRoom");

                } else {
                    Room monsterRoom2 = new Room("monsterRoom2");
                }
            }

        }
        if (answer == 2) {
            System.out.println("Goodbye player!");
            System.exit(0);
            // avsluta systemet
        } else {
            throw new IllegalArgumentException("Incorrect Input, try again");
        }
    }
}

