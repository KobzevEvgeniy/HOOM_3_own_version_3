package org.example.Abstract_heroes;


import org.example.GameInterface;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Magical_Heroes extends Hero implements GameInterface {
    /**
     * Магическая сила- Манна
     */
    protected int mana;
    /**
     * Максимальная Манна
     */
    protected int maxMana;

    public Magical_Heroes( String name, int health, int mana, int maxMana,int x, int y) {
        super(x,y);
        this.mana = mana;
        this.maxMana = maxMana;
        this.name=name;
        this.health=health;


    }


    public Magical_Heroes(int x, int y) {
        super(x,y);

    }
    public void step(ArrayList<Hero> teamFoe, ArrayList<Hero> teamFriend){

        teamFriend.sort(new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return (o1.maxHealth- o1.health)-(o2.maxHealth- o2.health);
            }
        });
        teamFriend.get(0).getDamage((int) (this.mana*0.5));
        this.mana= (int) (this.mana-this.mana*0.5);
        System.out.println("ПОХОДИЛ: ");
        System.out.println(getInfo());
        die();
        System.out.println("________________________________________");


    }



}
