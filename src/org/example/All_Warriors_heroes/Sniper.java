package org.example.All_Warriors_heroes;

import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Status;
import org.example.Abstract_heroes.Warriors;
import org.example.All_Other_heroes.Farmer;
import org.example.GameInterface;

import java.util.ArrayList;



public class Sniper extends Warriors implements  GameInterface {

    protected int arrows;
    protected int maxArrows;
    public Sniper(int x, int y) {
        super(x, y);
        this.damage=70;
        this.protection=70;
        this.accuracy=100;
        this.initiative=18;
        this.arrows=5;
        this.maxArrows=5;
        this.status=Status.READY;


    }
@Override
    public String getInfo() {
        return String.format("Снайпер %s  \uD83D\uDC80: %s Щит : %s Меткость: %s  \uD83C\uDFF9: %s",
                super.getInfo(),  this.damage, this.protection, this.accuracy,  this.arrows);
    }

    @Override
    public void die() {

    }

    @Override
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend) {
        if (this.isDead() || arrows <= 0) return;
        Hero nearestFoe = findNearest(teamFoe);
        if (nearestFoe != null) {
            nearestFoe.getDamage(damage);
            for (Hero c : teamFriend) {
                if (c.getClass() == Farmer.class && c.getStatus(c) !=Status.DEAD) {
                    if (this.arrows< this.maxArrows) this.arrows += 1;
                    return;
                }

            }
            this.arrows -= 1;
        }
    }

}

