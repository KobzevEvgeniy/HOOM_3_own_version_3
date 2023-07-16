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
        return String.format("Арбалетчик %s  \uD83D\uDC80: %s Защита: %s Меткость: %s  Стрел: %s",
                super.getInfo(),  this.damage, this.protection, this.accuracy,  this.arrows);
    }

    @Override
    public void getDamage(int damage) {

    }

    @Override
    public void die() {

    }



}

