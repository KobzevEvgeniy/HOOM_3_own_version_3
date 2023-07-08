package org.example.All_Warriors_heroes;
import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Warriors;
import org.example.GameInterface;

import java.util.ArrayList;


public class Arbalester extends Warriors implements  GameInterface {


protected int arrows;

    public Arbalester(int x, int y) {
        super(x, y);
        this.damage=20;
        this.protection=50;
        this.accuracy=50;
        this.initiative=10;
        this.arrows=1;
    }

    @Override
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend) {

    }

    public String getInfo() {
        return String.format("Арбалетчик %s  Сила урона: %s Защита: %s Меткость: %s Инициатива: %s, Стрел: %s",
                super.getInfo(),  this.damage, this.protection, this.accuracy, this.initiative, this.arrows);
    }

    @Override
    public void getDamage(int damage) {

    }

    @Override
    public void die() {

    }


    @Override
    public void attack(Hero target) {

            int damage = Hero.r.nextInt(10, 20);
            target.getDamage(damage);
        }

    @Override
    public void getDamage() {

    }

    @Override
    public void attack() {

    }
}

