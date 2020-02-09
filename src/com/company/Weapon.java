package com.company;


public class Weapon {

    private String name;
    private Integer hitpoints;
    private Integer damaged;

    public Weapon(String name, Integer hitpoints, Integer damaged) {

        this.name=name;
        this.hitpoints=hitpoints;
        this.damaged=0;
    }

    public String name() {
        return name;
    }

    public Integer hitpoints() {
        return hitpoints;
    }

    public Integer damaged() {
        return damaged;
    }
}
