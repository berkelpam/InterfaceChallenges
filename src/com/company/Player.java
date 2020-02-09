package com.company;

public class Player extends Character{

    private boolean hasWeapon;
    private Weapon weapon;

    public Player(String name, Integer health, Integer hitPoints) {
        super(name, health, hitPoints);
        this.hasWeapon=false;
    }

    public void pickUpWeapon(Weapon weapon){
        this.hasWeapon=false;
        this.weapon=weapon;
    }

    public String isArmedWith(){
        return super.name() + " is armed with " + this.weapon.name();
    }

    public boolean isArmed(){
        return this.hasWeapon;
    }

    public void slashWith(Weapon weapon){
        //todo
        // deal damage to enemy
        // weapon suffers damage from use
    }

}
