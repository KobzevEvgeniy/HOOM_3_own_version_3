package org.example.All_Other_heroes;

import org.example.Abstract_heroes.Hero;
import org.example.All_Warriors_heroes.Attack;

import java.util.ArrayList;

public class Bandit extends Hero implements Attack {
    private int damage;
    public Bandit(int x, int y) {
        super( Bandit.r.nextInt(100, 200), x, y);
        this.damage=5;
        this.initiative=4;
    }

    @Override
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend) {

    }

    public String getInfo() {
        return String.format("Разбойник %s  Сила урона: %s",super.getInfo(),  this.damage);
    }

    @Override
    public void getDamage(int damage) {

    }

    @Override
    public void die() {

    }


    @Override
    public void attack(Hero target) {

    }

    @Override
    public void getDamage() {

    }

    @Override
    public void attack() {

    }


}
