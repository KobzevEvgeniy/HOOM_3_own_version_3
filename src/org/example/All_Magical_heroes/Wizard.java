package org.example.All_Magical_heroes;

import org.example.Abstract_heroes.Magical_Heroes;
import org.example.Abstract_heroes.Names;

public class Wizard extends Magical_Heroes {
    public Wizard(Names name, int row, int col) {
        super(name, 5, 5, 2, 1,2, 10, 10, row, col);
    }

}