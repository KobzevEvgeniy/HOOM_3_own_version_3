package org.example.All_Other_heroes;

import org.example.Abstract_heroes.Hero;
import org.example.All_Warriors_heroes.Attack;

public class Bandit extends Hero implements Attack {
    private int damage;
    public Bandit(int x, int y) {
        super(
                Bandit.r.nextInt(100, 200), x, y);
        this.damage=5;
    }
    public String getInfo() {
        return String.format("Разбойник %s  Сила урона: %s",super.getInfo(),  this.damage);
    }



    @Override
    public void getDamage() {

    }

    @Override
    public void attack() {

    }


}
