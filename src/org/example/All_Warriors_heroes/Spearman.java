package org.example.All_Warriors_heroes;

import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Warriors;
import org.example.GameInterface;

import java.util.ArrayList;

public class Spearman extends Warriors implements Attack, GameInterface {


    public Spearman(int x, int y) {
        super(x,y);
        this.damage=95;
        this.protection=90;
        this.initiative=12;
        }

    @Override
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend) {

    }

    public String getInfo() {
        return String.format("Копейщик %s  Сила урона: %s Защита: %s ",
                super.getInfo(),  this.damage, this.protection);
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
