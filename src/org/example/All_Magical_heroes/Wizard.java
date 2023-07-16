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
        this.mana = 120;
        this.initiative=15;
        this.status= Status.READY;

    }

    @Override
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend) {

    }

    public String getInfo() {
        return String.format("Колдун %s  Манна: %d \uD83D\uDC80: %s", super.getInfo(), this.mana, this.damage);
    }

    @Override
    public void die() {

    }


}


