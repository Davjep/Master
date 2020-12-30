package com.company;

public class Player {
    private String name;
    private int healthPoints;
    private int damage;

    //Konstruktor för att skapa en ny spelare
    public Player(String name, int healthPoints, int damage) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
    }
//Setters och getters
    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setHealthPoints(int newHP) {
        this.healthPoints = newHP;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setDamage(int newDamage) {
        this.damage = newDamage;
    }

    public int getDamage() {
        return damage;
    }
}