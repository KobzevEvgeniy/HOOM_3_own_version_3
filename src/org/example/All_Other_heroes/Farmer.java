package org.example.All_Other_heroes;

import org.example.Abstract_heroes.Hero;

import java.util.ArrayList;

public class Farmer extends Hero {
    public Farmer(int x, int y) {
        super(Hero.r.nextInt(100, 200), x,y);
        this.initiative=1;

    }

    @Override
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend) {

    }

    public String getInfo() {
        return String.format("Фермер Имя: %s  Здоровье: %d  Тип: %s",
                this.name, this.health, this.getClass().getSimpleName());
    }

    @Override
    public void getDamage(int damage) {

    }

    @Override
    public void die() {

    }

    @Override
    public void attack() {

    }
}
