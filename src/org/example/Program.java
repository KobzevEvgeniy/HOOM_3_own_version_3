package org.example;

import org.example.Abstract_heroes.Hero;
import org.example.All_Magical_heroes.Monk;
import org.example.All_Magical_heroes.Wizard;
import org.example.All_Other_heroes.Bandit;
import org.example.All_Other_heroes.Farmer;
import org.example.All_Warriors_heroes.Arbalester;
import org.example.All_Warriors_heroes.Sniper;
import org.example.All_Warriors_heroes.Spearman;

import java.util.*;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        out.println("ДЗ к семинару №1: ");
        Wizard Wizard1= new Wizard(0, 7);
        Monk Monk1= new Monk(0, 5);
        Bandit Bandit1= new Bandit(0, 9);
        Farmer Farmer1= new Farmer(0, 10);
        Arbalester Arb= new Arbalester(0, 11);
        Sniper Sniper1= new Sniper(0,15);
        Spearman Sp1= new Spearman(0,1);

        out.println(Wizard1.getInfo());
        out.println(Monk1.getInfo());
        out.println(Bandit1.getInfo());
        out.println(Farmer1.getInfo());
        out.println(Arb.getInfo());
        out.println(Sniper1.getInfo());
        out.println(Sp1.getInfo());
        out.println("_____________________________________________________");

        out.println("ДЗ к семинару №2: ");
         int teamCount = 10;

         Random rand= new Random();
        List<Hero> teams1 = new ArrayList<>();
         for (int i = 0; i < teamCount; i++) {
             int val = rand.nextInt(6);
             switch (val) {
                 case 0:
                     teams1.add(new Monk(i,0));
                     break;
                 case 1:
                     teams1.add(new Wizard(0, 2));
                     break;
                 case 2:
                     teams1.add(new Bandit(0, 3));
                     break;
                 case 3:
                     teams1.add(new Farmer(0,4));
                     break;
                 case 4:
                     teams1.add(new Arbalester(0,5));
                     break;
                 case 5:
                     teams1.add(new Sniper(0,6));
                 default:
                     teams1.add(new Spearman(0, 7));
                     break;
             }
             out.println("Команда №1: "+teams1.get(i).getInfo());
         }

        out.println("______________");
        List<Hero> teams2 = new ArrayList<>();
        teams2.add(new Sniper(9,0));
        teams2.add(new Spearman(9,1));
        teams2.add(new Wizard(9, 2));
        teams2.add(new Bandit(9, 3));
        teams2.add(new Sniper(9,4));
        teams2.add(new Spearman(9, 5));
        teams2.add(new Wizard(9,6));
        teams2.add(new Bandit(9,7));
        teams2.add(new Farmer(9,8));
        teams2.add(new Monk( 9,9));

        for (int i = 0; i < teams2.size(); i++) {
            out.println("Команда №2: "+teams2.get(i).getInfo());
        }

        out.println("ДЗ семинар 3 и 4______________________________________________________");

        ArrayList<Hero> team= new ArrayList<>();
        team.addAll(teams1);
        team.addAll(teams2);
        team.sort(Comparator.comparingInt((Hero c) -> c.initiative));
        teams1.forEach(n -> System.out.println(n.getInfo()));
        teams2.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("Начали ходить_______________________________________");
        for (Hero c : team) {
            if (teams1.contains(c)) {
                c.step(teams2, teams1);
            } else {
                c.step(teams1, teams2);
            }
            System.out.println("КОМАНДА 1");
            teams1.forEach(n -> System.out.println(n.getInfo()));
            System.out.println("КОМАНДА 2");
            teams2.forEach(n -> System.out.println(n.getInfo()));
        }
    }

}