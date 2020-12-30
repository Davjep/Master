package com.company;

import java.util.Scanner;

public class DungeonMaster {

    public DungeonMaster() {
        //Startmeny och val att antigen starta ett nytt spel eller avsluta
        System.out.println("Welcome to Dragon Treasure. Choose one of the following options: ");
        System.out.println("Start new game (1)");
        System.out.println("Exit (2)");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        //Behöver göra om detta till en loop eller använd illegalargument
        if (answer == 1) {
            System.out.println("Enter name: ");
            String name = scanner.next();
            Player myHero = new Player(name, 10, 1);
            System.out.printf("The adventure begins %s...", name);
            Dungeon dungeon = new Dungeon();  // spel startar
            dungeon.playGame();
        }
        else {
            System.out.println("Goodbye player!");
            System.exit(0);
            // avsluta systemet
        } 

    }
}

