package org.example.Abstract_heroes;

import org.example.Arena;
import org.example.GameInterface;

import java.util.ArrayList;
import java.util.List;

public abstract class Warriors extends Hero implements GameInterface{
    /**
     * Сила наносимого урона за одну атаку
     */
    public int damage;

    /**
     * Защита
     */
    public int protection;

    /**
     * Меткость стрельбы
     */
    public int accuracy;


    public Warriors(int x, int y) {
        super( Warriors.r.nextInt(100, 200),x, y);
        this.damage = 10;
        this.protection = 50;
        this.accuracy = 50;

    }

    public void step(List<Hero> teams1, List<Hero> teams2) {
        System.out.println("ПОХОДИЛ: ");
        System.out.println(getInfo());
        die();
        System.out.println("________________________________________");

    }

    public void move(Hero enemy, ArrayList<Hero> team) {
        if (enemy.getCoordinates().getDistance(enemy.getCoordinates()) == 1) {
            enemy.getDamage(damage);
            return;
        }
        String direction = this.getCoordinates().getDirection(enemy.getCoordinates());
        switch (direction) {
            case "right":
                if (this.isFilled(team, new Arena(this.getCoordinates().getPosition()[0] + 1, this.getCoordinates().getPosition()[1])))
                    return;
                this.arena.x++;
                break;
            case "left":
                if (this.isFilled(team, new Arena(this.getCoordinates().getPosition()[0] - 1, this.getCoordinates().getPosition()[1])))
                    return;
                this.arena.x--;
                break;
            case "forward":
                if (this.isFilled(team, new Arena(this.getCoordinates().getPosition()[0], this.getCoordinates().getPosition()[1] + 1)))
                    return;
                this.arena.y--;
                break;
            case "back":
                if (this.isFilled(team, new Arena(this.getCoordinates().getPosition()[0], this.getCoordinates().getPosition()[1] - 1)))
                    return;
                this.arena.y++;
                break;


        }
    }

    private boolean isFilled(ArrayList<Hero> team, Arena coordinates) {
        for (Hero character : team) {
            if (coordinates.isEqual(character.getCoordinates())) return true;
        }
        return false;
    }
}


