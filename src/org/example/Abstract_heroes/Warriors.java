package org.example.Abstract_heroes;

import org.example.All_Warriors_heroes.Attack;
import org.example.GameInterface;

public abstract class Warriors extends Hero implements GameInterface, Attack {
    /**
     * Сила наносимого урона за одну атаку
     */
    public int damage;

    /**
     * Защита
     */
    public int protection;

    /**
     * Меткость стрельбы
     */
    public int accuracy;


    public Warriors(int x, int y) {
        super(Warriors.r.nextInt(100, 200),x, y);
        this.damage = 10;
        this.protection = 50;
        this.accuracy = 50;

    }

    public void step() {
        System.out.println(getInfo() + "-ПОХОДИЛ");
        attack();
        getDamage();
        die();

    }

    public void getDamage() {
        if (this.health - damage > 0) {
            this.health -= damage;
        } else {
            die();
        }


    }

    public void attack(Hero target) {
        int damage = Hero.r.nextInt(10, 20);
        target.getDamage(damage);
    }

    public void attack(Hero target, int damage) {

        target.getDamage(damage);
    }
}


