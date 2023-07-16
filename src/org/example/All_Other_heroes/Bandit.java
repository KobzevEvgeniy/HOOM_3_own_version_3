package org.example.All_Other_heroes;

import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Status;

import java.util.ArrayList;

public class Bandit extends Hero  {
    private int damage;
    public Bandit(int x, int y) {
        super( Bandit.r.nextInt(100, 200), x, y);
        this.damage=5;
        this.initiative=4;
        this.status= Status.READY;
    }

    @Override
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend) {

    }

    public String getInfo() {
        return String.format("Разбойник %s  \uD83D\uDC80: %s",super.getInfo(),  this.damage);
    }

    @Override
    public void getDamage(int damage) {

    }

    @Override
    public void die() {

    }





}
