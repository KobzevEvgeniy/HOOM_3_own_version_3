package org.example;

import org.example.Abstract_heroes.Hero;
import org.example.All_Magical_heroes.Monk;
import org.example.All_Magical_heroes.Wizard;
import org.example.All_Other_heroes.Bandit;
import org.example.All_Other_heroes.Farmer;
import org.example.All_Warriors_heroes.Sniper;
import org.example.All_Warriors_heroes.Spearman;
import org.example.View.View;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {


    public static ArrayList<Hero> team= new ArrayList<>();
    public static ArrayList<Hero> team1= new ArrayList<>();
    public static ArrayList<Hero> team2= new ArrayList<>();

    public static void main(String[] args) {

        List<Hero> teams1 = new ArrayList<>();
        teams1.add(new Sniper(1,10));
        teams1.add(new Spearman(2,10));
        teams1.add(new Wizard(3, 10));
        teams1.add(new Bandit(4, 10));
        teams1.add(new Sniper(5,10));
        teams1.add(new Spearman(6, 10));
        teams1.add(new Wizard(7,10));
        teams1.add(new Bandit(8,10));
        teams1.add(new Farmer(9,10));
        teams1.add(new Monk( 10,10));

        ArrayList<Hero> teams2 = new ArrayList<>();
        teams2.add(new Sniper(1,1));
        teams2.add(new Spearman(2,1));
        teams2.add(new Wizard(3, 1));
        teams2.add(new Bandit(4, 1));
        teams2.add(new Sniper(5,1));
        teams2.add(new Spearman(6, 1));
        teams2.add(new Wizard(7,1));
        teams2.add(new Bandit(8,1));
        teams2.add(new Farmer(9,1));
        teams2.add(new Monk( 10,1));



        ArrayList<Hero> team= new ArrayList<>();
        team.addAll(teams1);
        team.addAll(teams2);
        team.sort(new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return o2.initiative-o1.initiative;
            }
        });

        System.out.println("Начали ходить_______________________________________");
        for (Hero c : team) {
            if (teams1.contains(c)) {
                c.step(teams2, teams1);
            } else {
                c.step(teams1, teams2);
            }
            System.out.println(" ");
            teams1.forEach(n -> System.out.println("КОМАНДА 1 "+n.getInfo()));
            System.out.println(" ");
            teams2.forEach(n -> System.out.println("КОМАНДА 2 "+ n.getInfo()));

        }
        System.out.println("Добавил VIEW_______________________________________");

        Scanner in= new Scanner(System.in);
        while (true){
            View.view();
            in.nextLine();
            for (Hero hero : team){
                if (teams2.contains(hero)){
                    hero.step(teams1, teams2);
                }
                else hero.step(teams2,teams1);
            }

        }



    }

}