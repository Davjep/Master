package com.company;

public class Dungeon {
   /*Room startingRoom = new Room();
    Room riddleRoom1 = new Room();
    Room monsterRoom1 = new Room(); */

    public void playGame() {
        //Intro till första grottan. Går till första rummet
        System.out.println("You are standing outside a large cave, you see a sign on the right saying:");
        System.out.println("DO NOT ENTER!!");
        System.out.println("As the daring adventurer you are, you ignore the sign and enter into the cave");
        System.out.println("All of a sudden, you hear a large bang and the entrance collapses behind you. " +
                "There is no way out now...");
        Room.StartingRoom();

        
        /* startingRoom.StartingRoom(firstRoom);
        if (startingRoom.choice == 1) {
            riddleRoom1.RiddleRoom1();
        } else {
            monsterRoom1.MonsterRoom1();
        } */


        //Efter starting room, så kollar health, if over 0, go to next room.

    }

}
