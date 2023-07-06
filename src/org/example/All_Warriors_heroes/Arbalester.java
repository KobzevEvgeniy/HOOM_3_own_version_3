package org.example.All_Warriors_heroes;
import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Warriors;
import org.example.GameInterface;


public class Arbalester extends Warriors implements Attack, GameInterface {




    public Arbalester(int x, int y) {
        super(x, y);
        this.damage=20;
        this.protection=50;
        this.accuracy=50;

    }

    public String getInfo() {
        return String.format("Арбалетчик %s  Сила урона: %s Защита: %s Меткость: %s",
                super.getInfo(),  this.damage, this.protection, this.accuracy);
    }


    @Override
    public void attack(Hero target) {

            int damage = Hero.r.nextInt(10, 20);
            target.getDamage(damage);
        }

    @Override
    public void attack() {

    }
}

