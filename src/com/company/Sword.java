package com.company;

public class Sword extends Weapon {

    private boolean isTwohanded;


    public Sword(String name, Integer hitpoints, Integer damaged, boolean isTwoHanded ) {
        super(name, hitpoints, damaged);
        this.isTwohanded=isTwoHanded;
    }
}
