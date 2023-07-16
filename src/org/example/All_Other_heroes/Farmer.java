package org.example.All_Other_heroes;

import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Status;

import java.util.ArrayList;

public class Farmer extends Hero {
    public Farmer(int x, int y) {
        super(Hero.r.nextInt(100, 200), x, y);
        this.initiative = 1;

    }

    @Override
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend) {
        if (this.isDead()) return;
        status = Status.READY;

    }

    @Override
    public String getInfo() {
        return String.format("Фермер : %s  \u2764: %d  Тип: %s Инициатива⚔\uFE0F:%d ",
                this.name, this.health, this.getClass().getSimpleName(), this.initiative);
    }

    @Override
    public void getDamage(int damage) {

    }

    @Override
    public void die() {

    }
}
