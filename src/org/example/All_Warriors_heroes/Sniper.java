package org.example.All_Warriors_heroes;
import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Warriors;
import org.example.GameInterface;

public class Sniper extends Warriors implements Attack, GameInterface {

    public Sniper(int x, int y) {
        super(x, y);
        this.damage=70;
        this.protection=70;
        this.accuracy=100;

    }

    public String getInfo() {
        return String.format("Снайпер %s  Сила урона: %s Защита: %s Меткость: %s",
                super.getInfo(),  this.damage, this.protection, this.accuracy);
    }

    @Override
    public void step() {
        getDamage();
        die();
    }

    @Override
    public void attack() {

    }

    @Override
    public void attack(Hero target) {

        int damage = Hero.r.nextInt(10, 20);
        target.getDamage(damage);
    }
}
