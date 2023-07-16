package org.example.All_Warriors_heroes;

import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Status;
import org.example.Abstract_heroes.Warriors;
import org.example.GameInterface;

import java.util.ArrayList;

public class Spearman extends Warriors implements  GameInterface {


    public Spearman(int x, int y) {
        super(x,y);
        this.damage=95;
        this.protection=90;
        this.initiative=12;
        this.status= Status.READY;
        }

    @Override
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend) {

    }

    public String getInfo() {
        return String.format("Копейщик %s  \uD83D\uDC80: %s Защита: %s ",
                super.getInfo(),  this.damage, this.protection);
    }

    @Override
    public void getDamage(int damage) {

    }

    @Override
    public void die() {

    }


}
