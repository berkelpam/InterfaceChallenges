package com.company;

public class Character {

    private String name;
    private Integer health;
    private Integer hitPoints;


    public Character(String name, Integer health, Integer hitPoints) {
        this.name=name;
        this.health=health;
        this.hitPoints =hitPoints;

    }

    public String name(){
        return this.name;
    }


}
