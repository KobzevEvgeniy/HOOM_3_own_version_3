package org.example.Abstract_heroes;
import org.example.Arena;
import org.example.GameInterface;

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
    protected int health;

    /**
     * Здоровье персонажа максимальный уровень
     */
    protected int maxHealth;

    /**
     * Поле
     */
    protected Arena arena;


    static {
        Hero.number = 0;
        Hero.r = new Random();
    }
    public Hero(int health, int x, int y) {
        String name=getName();
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.arena=new Arena(x,y);

    }

    public Hero(int x, int y) {
        this(Hero.r.nextInt(100, 200), x, y);
    }

    public String getInfo() {
        return String.format("Имя: %s  Здоровье: %d  Тип: %s  x: %s ; y: %s",
                this.name, this.health, this.getClass().getSimpleName(),arena.x, arena.y);
    }

    public void healed(int Hp) {
        this.health = Hp + this.health > this.maxHealth ? this.maxHealth : Hp+ this.health;
    }


    public static String getName(){
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

    public void step(){
        System.out.printf(getInfo()+"-ПОХОДИЛ");

    }
    public void die(){
        if (health==0){
           System.out.printf(getInfo()+"-УМЕР");
        }

    }

    public void getDamage(int damage) {
    }
    public void getPosition(String name1, String name2){
        int x1=this.arena.x;
        int x2=this.arena.x;
        int y1=this.arena.y;
        int y2=this.arena.y;
        double xy = arena.getXY(x1, x2, y1, y2);
    }

    public void getConfederate(List<Hero> team1, List<Hero> team2){

    }


}
