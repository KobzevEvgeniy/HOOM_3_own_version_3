package org.example;

import org.example.Abstract_heroes.Hero;
import org.example.Abstract_heroes.Names;
import org.example.All_Magical_heroes.Wizard;
import org.example.All_Other_heroes.Farmer;
import org.example.All_Shooters.Arbalester;
import org.example.All_Warriors_heroes.Bandit;
import org.example.All_Warriors_heroes.Spearman;
import org.example.View.View;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static ArrayList<Hero> team1 = new ArrayList<>();
    public static ArrayList<Hero> team2 = new ArrayList<>();
    public static ArrayList<Hero> allTeam = new ArrayList<>();

    public static void main(String[] args) {
        fillGreenList(team1, 1);
        fillBlueList(team2, 10);
        allTeam.addAll(team1);
        allTeam.addAll(team2);
        allTeam.sort(new Comparator<Hero>() {
            @Override
            public int compare(Hero character, Hero t1) {
                if (character.getInitiative() > t1.getInitiative()) return -1;
                if (character.getInitiative() < t1.getInitiative()) return 1;
                return 0;
            }});
        Scanner scanner = new Scanner(System.in);
        while (isAtLeastOneAlive(team1) && isAtLeastOneAlive(team2)){
            View.view();
            for (Hero c : allTeam) {
                if (team1.contains(c)) {
                    c.step(team2, team1);
                } else {
                    c.step(team1, team2);
                }
            }
            scanner.nextLine();
        }
        View.view();
    }

    public static boolean isAtLeastOneAlive(ArrayList<Hero> team) {
        for (Hero c : team) {
            if (!c.isDead()) return true;
        }
        return false;
    }

    public static void fillGreenList(ArrayList<Hero> list, int startRow) {
        Names[] names = Names.values();
        for (int i = 1; i <= 10; i++) {
            int cnt = new Random().nextInt(4);
            Names name = names[new Random().nextInt(names.length)];
            switch (cnt) {
                case 0: {
                    list.add(new Farmer(name, startRow, i));
                    break;
                }
                case 1: {
                    list.add(new Wizard(name, startRow, i));
                    break;
                }
                case 2: {
                    list.add(new Arbalester(name, startRow, i));
                    break;
                }
                default: {
                    list.add(new Spearman(name, startRow, i));
                    break;
                }
            }
        }
    }

    public static void fillBlueList(ArrayList<Hero> list, int startRow) {
        Names[] names = Names.values();
        for (int i = 1; i <= 10; i++) {
            int cnt = new Random().nextInt(4);
            Names name = names[new Random().nextInt(names.length)];
            switch (cnt) {
                case 0: {
                    list.add(new Farmer(name, startRow, i));
                    break;
                }
                case 1: {
                    list.add(new Farmer(name, startRow, i));
                    break;
                }
                case 2: {
                    list.add(new Spearman(name, startRow, i));
                    break;
                }
                default: {
                    list.add(new Bandit(name, startRow, i));
                    break;
                }
            }
        }
    }
}