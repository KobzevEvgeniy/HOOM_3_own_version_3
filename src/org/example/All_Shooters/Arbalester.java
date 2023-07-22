package org.example.All_Shooters;

import org.example.Abstract_heroes.Names;
import org.example.Abstract_heroes.Shooter;

public class Arbalester extends Shooter {
    public Arbalester(Names name, int row, int col) {
        super(name, 6, 6, 3, 1, 4, 7, 7, row, col);
    }
}