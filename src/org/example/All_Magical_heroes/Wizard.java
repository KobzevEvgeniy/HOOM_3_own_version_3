package org.example.All_Magical_heroes;
import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Magical_Heroes;
import org.example.All_Warriors_heroes.Attack;

public class Wizard extends Magical_Heroes implements Healing, Attack {


    private int damage;

    public Wizard(int x, int y) {
        super(x,y);
        this.damage = 100;
        this.name = getName();
        this.mana = 120;

    }

    public String getInfo() {
        return String.format("Колдун %s  Манна: %d Сила урона: %s", super.getInfo(), this.mana, this.damage);
    }

    @Override
    public void healing(Hero target) {

    }



    @Override
    public void getDamage() {

    }

    @Override
    public void attack() {

    }
}


