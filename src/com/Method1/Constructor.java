package com.Method1;

public class Constructor {
    String name;
    String hero;
    String heroine;
    String director;
    double budget;

    Constructor(String name, String hero) {
        this.name = name;
        this.hero = hero;
    }

    Constructor(Constructor t, String heroine, String director) {
        this.name = t.name;
        this.hero = t.hero;
        this.heroine = heroine;
        this.director = director;
    }

    Constructor(Constructor t1, double budget) {
        this.name = t1.name;
        this.hero = t1.hero;
        this.heroine = t1.heroine;
        this.director = t1.director;
        this.budget = budget;
    }

    void show() {
        System.out.println("Movie Name      : " + name);
        System.out.println("Hero Name       : " + hero);
        System.out.println("Heroine Name    : " + heroine);
        System.out.println("Director Name   : " + director);
        System.out.println("Budget          : " + budget);
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        Constructor t = new Constructor("Dhebba Dhebba", "Harsha");
        Constructor t1 = new Constructor(t, "Bhagya Shree", "Mehar Nolan");
        Constructor t2 = new Constructor(t1, 50000000.0);

        t2.show();
    }
}
