package org.example.All_Magical_heroes;
import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Magical_Heroes;
import org.example.All_Warriors_heroes.Attack;

import java.util.ArrayList;

public class Wizard extends Magical_Heroes implements Healing, Attack {


    private int damage;

    public Wizard(int x, int y) {
        super(x,y);
        this.damage = 100;
        this.name = getName();
        this.mana = 120;
        this.initiative=15;

    }

    @Override
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend) {

    }

    public String getInfo() {
        return String.format("Колдун %s  Манна: %d Сила урона: %s", super.getInfo(), this.mana, this.damage);
    }

    @Override
    public void getDamage(int damage) {

    }

    @Override
    public void die() {

    }

    @Override
    public void healing(Hero target) {

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


