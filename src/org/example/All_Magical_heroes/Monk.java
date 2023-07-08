package org.example.All_Magical_heroes;
import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Magical_Heroes;

import java.util.ArrayList;

public class Monk extends Magical_Heroes implements Healing {
    private int harmony;
    private int maxHarmony;


    public Monk(int x, int y) {
        super( x, y);
        this.name= getName();
        this.health= 150;
        this.harmony = 100;
        this.maxHarmony = 100;
        this.initiative=5;

    }



    public Monk(String name, int health, int mana, int maxMana, int x, int y) {
        super(name, health, mana, maxMana, x, y);
    }


    @Override
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend) {

    }

    public String getInfo() {
        return String.format("Монах %s  Сила исцеления: %d", super.getInfo(), this.harmony);
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

    @Override
    public void healing(Hero target) {
        int health = Hero.r.nextInt(10, 20);
        if (this.harmony >= health) {
            target.healed(health);

        }
    }

}
