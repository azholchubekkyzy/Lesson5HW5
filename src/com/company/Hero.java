package com.company;

public class Hero {
    private int damage;
    private int health;
    private String superAbilities;

    public Hero(int health, int damage, String superAbilities) {
        this.damage = damage;
        this.health = health;
        this.superAbilities = superAbilities;
    }
    public Hero (int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbilities() {
        return superAbilities;
    }

    public void setSuperAbilities(String superAbilities) {
        this.superAbilities = superAbilities;
    }
}
