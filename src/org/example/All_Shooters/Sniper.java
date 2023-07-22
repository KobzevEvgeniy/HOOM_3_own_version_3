package org.example.All_Shooters;

import org.example.Abstract_heroes.Names;
import org.example.Abstract_heroes.Shooter;

public class Sniper extends Shooter {
    public Sniper(Names name, int row, int col) {
        super(name, 5, 5, 2,1, 5, 10, 10, row, col);
    }

}