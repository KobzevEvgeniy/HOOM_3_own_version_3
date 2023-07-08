package org.example.All_Warriors_heroes;

import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Warriors;
import org.example.All_Other_heroes.Farmer;
import org.example.GameInterface;

import java.util.ArrayList;

public class Sniper extends Warriors implements Attack, GameInterface {

    protected int arrows;

    public Sniper(int x, int y) {
        super(x, y);
        this.damage=70;
        this.protection=70;
        this.accuracy=100;
        this.initiative=18;
        this.arrows=5;


    }

    @Override
    public void attack(Hero target) {

    }

    @Override
    public void getDamage() {

    }

    public String getInfo() {
        return String.format("Снайапер %s  Сила урона: %s Защита: %s Меткость: %s Инициатива: %s, Стрел: %s",
                super.getInfo(),  this.damage, this.protection, this.accuracy, this.initiative, this.arrows);
    }

    @Override
    public void getDamage(int damage) {

    }

    @Override
    public void die() {

    }

    @Override
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend){
        if (this.health == 0 || arrows == 0) {return;}
        Hero nearestFoe = findNearest(teamFoe);
        nearestFoe.health -= this.damage;
        for (Hero c:teamFriend) {
            if (Farmer.class == c.getClass()) {
                return;
            }
        }
        this.arrows = this.arrows-1;
        System.out.println("ПОХОДИЛ: ");
        System.out.println(getInfo());
        die();
        System.out.println("________________________________________");

    }

    @Override
    public void attack() {

    }
}
