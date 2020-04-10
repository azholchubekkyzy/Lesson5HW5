package com.company;

public class Main {
    private static Hero[] heroes;

    public static void main(String[] args) {


        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(70);
        boss.setDefence("Yota");

        System.out.println("Урон босса " + boss.getDamage() + " Здоровье босса " + boss.getHealth() + " Защита босса "
                + boss.getDefence());



            }

}
