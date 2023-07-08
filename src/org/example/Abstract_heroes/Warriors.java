package org.example.Abstract_heroes;

import org.example.All_Warriors_heroes.Attack;
import org.example.GameInterface;

import java.util.List;

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
        super( Warriors.r.nextInt(100, 200),x, y);
        this.damage = 10;
        this.protection = 50;
        this.accuracy = 50;

    }

    public void step(List<Hero> teams1, List<Hero> teams2) {
        System.out.println("ПОХОДИЛ: ");
        System.out.println(getInfo());
        die();
        System.out.println("________________________________________");

    }

    @Override
    public abstract void attack(Hero target);
}


