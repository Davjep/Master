package com.company;

public class Monster {
    private String name;
    private int healthPoints;
    private int damage;
//Konstruktor för att skapa ett nytt monster
    public Monster(String name, int healthPoints, int damage) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
    }
//Setters och getters
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
