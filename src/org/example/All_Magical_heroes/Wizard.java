package org.example.All_Magical_heroes;
import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Magical_Heroes;
import org.example.Abstract_heroes.Status;

import java.util.ArrayList;

public class Wizard extends Magical_Heroes {


    private int damage;

    public Wizard(int x, int y) {
        super(x,y);
        this.damage = 100;
        this.name = getName();
        this.mana = 60;
        this.maxMana=60;
        this.initiative=15;
        this.status= Status.READY;

    }


    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend) {
        if (this.isDead()) return;
        if (mana < maxMana) mana += 1;
        if (mana < damage) {status = Status.NOMANA; return; }
        Hero damagedFriend = findMostDamaged(findLiveHero(teamFriend));
        if (damagedFriend != null) {
            damagedFriend.getHealing(damage);
            mana -= damage;
            status = Status.CAST;
        }

    }

    public String getInfo() {
        return String.format("Колдун %s  Манна: %d Maxманна:%S \uD83D\uDC80: %s", super.getInfo(), this.mana,this.maxMana, this.damage);
    }

    private Hero findMostDamaged(ArrayList<Hero> team) {
        if (team.size() == 0) return null;
        Hero mostDamaged = team.get(0);
        for (Hero hero : team) {
            if (!hero.status.equals(Status.DEAD)
                    && hero.health < hero.maxHealth
                    && hero.health/hero.maxHealth < mostDamaged.health/mostDamaged.maxHealth) {
                mostDamaged = hero;
            }
        }
        if (mostDamaged.health == mostDamaged.maxHealth) {
            return null;
        }
        return mostDamaged;
    }
    @Override
    public void die() {

    }


}


