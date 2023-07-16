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
    public int maxHealth;


    public   Status status;
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
        this.status=Status.READY;


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
        return String.format(": %s  \u2764: %d Инициатива⚔\uFE0F:%d    Тип: %s    x: %s ; y: %s СТАТУС: %s",
                this.name, this.health, this.initiative, this.getClass().getSimpleName(),arena.x, arena.y, this.status);
    }

    public void healed(int health) {
        this.health = health + this.health > this.maxHealth ? this.maxHealth : health+ this.health;
    }


    public static String getName(){
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

    public void step(List<Hero> teams1, List<Hero> teams2){
        System.out.println("MOVE");
        System.out.println(getInfo());
        die();
        System.out.println("________________________________________");


    }
    public void die(Hero hero){
        if (hero.health==0){
           System.out.printf(hero.getInfo()+Status.DEAD);
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
        protected ArrayList<Hero> findLiveHero(ArrayList<Hero> team) {
            ArrayList<Hero> notDeadTeamMembers = new ArrayList<>();
            for (Hero c: team) {
                if (!c.isDead()) notDeadTeamMembers.add(c);
            }
            return notDeadTeamMembers;
    }



    public  void getDamage(int damage){
        health-=damage;
        if (health<=0){
            this.status=Status.DEAD;
            health=0;
        }
        if (health>0) health=maxHealth;
    }

    public Status getStatus(Hero hero){
        return Hero.this.status;
    }

    public int getHp(Hero hero) {
        return hero.health;
    }

    public boolean isDead() {
        return status.equals(Status.DEAD);
    }

    public void getHealing(int healPoints) {
        health += healPoints;
        if (health > maxHealth) health = maxHealth;
    }

}
