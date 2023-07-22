package org.example;

import org.example.Abstract_heroes.Hero;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList< Hero > teamFoe, ArrayList<Hero> teamFriend);
        String getInfo();



}


