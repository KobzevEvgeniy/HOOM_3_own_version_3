package org.example.Abstract_heroes;

import org.example.Arena;
import org.example.GameInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Hero implements GameInterface {
    /**
     * Номер по счету
     */
    protected static int number;

    /**
     * Счетчик героев
     */
    protected static Random r;

    /**
     * Имя персонажа
     */
    protected String name;

    /**
     * Здоровье персонажа сейчас
     */
    public int health;

    /**
     * Здоровье персонажа максимальный уровень
     */
    protected int maxHealth;

    /**
     * Поле
     */
    protected Arena arena;
    /**
     * Инициатива
     */
    public  int initiative;


    static {
        Hero.number = 0;
        Hero.r = new Random();
    }



    public Hero(int initiative, int health, int x, int y) {
        String name=getName();
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.initiative=initiative;
        this.arena=new Arena(x,y);


    }

    public Hero( int health, int x, int y) {
        String name=getName();
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.arena=new Arena(x,y);

    }

    public Hero( int x, int y) {

        this( Hero.r.nextInt(100, 200), x, y);
    }

    public String getInfo() {
        return String.format("Имя: %s  Здоровье: %d Инициатива: %d Тип: %s  x: %s ; y: %s",
                this.name, this.health, this.initiative, this.getClass().getSimpleName(),arena.x, arena.y);
    }

    public void healed(int Hp) {
        this.health = Hp + this.health > this.maxHealth ? this.maxHealth : Hp+ this.health;
    }


    public static String getName(){
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

    public void step(List<Hero> teams1, List<Hero> teams2){
        System.out.println("ПОХОДИЛ: ");
        System.out.println(getInfo());
        die();
        System.out.println("________________________________________");


    }
    public void die(Hero hero){
        if (hero.health==0){
           System.out.printf(hero.getInfo()+"-УМЕР");
        }

    }

    public Arena getCoordinates() {
        return arena;
    }

    protected Hero findNearest(ArrayList<Hero> team) {
        Hero nearest = team.get(0);
        for (Hero hero : team) {
            if (arena.getDistance(hero.getCoordinates()) < arena.getDistance(nearest.getCoordinates())) {
                nearest = hero;
            }
        }
        return nearest;
    }


    public abstract void getDamage(int damage);

    public abstract void attack();
}
