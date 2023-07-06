package org.example.All_Other_heroes;

import org.example.Abstract_heroes.Hero;

public class Farmer extends Hero {
    public Farmer(int x, int y) {
        super(
                Hero.r.nextInt(100, 200), x,y);

    }
    public String getInfo() {
        return String.format("Фермер Имя: %s  Здоровье: %d  Тип: %s",
                this.name, this.health, this.getClass().getSimpleName());
    }

    @Override
    public void attack() {

    }
}
