package Swingy.model;

import java.util.Random;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

public abstract class Character {

    @NotNull(message= "Name cannot be null")
    @Size(min = 2, max= 16, message = "Name lenghth must be between 2 and 16 characters")
    protected String name;

    @Min(value = 0, message = "Well this is strange, does -1 attack damage yourself. must be greater than 0")
    protected int attack;

    @Min(value = 0, message = "Defense needs to be greater or equal to 0")
    protected int defense;

    @Min(value = 0, message = "Defense needs to be greater or equal to 0")
    protected int hitPoints;

    @Min(value = 0, message = "Damn are you that bad that your experience is below 0")
    protected int exp;

    public Character(String name, int attack, int defense, int hitPoints) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.hitPoints = hitPoints;
        this.exp = 0;
    }

    public void attack(Character opponent) {
        if (this.attack > opponent.getDefense()) {
            if (Math.random() * 10 < 8) {
                opponent.setHitPoints(this.attack + opponent.getHitPoints());
            }
        } else {
            if (Math.random() * 10 < 3) {
                opponent.setHitPoints(this.attack + opponent.getHitPoints());
            }
        }
   }

   public int fight(Character opponent){
       while (opponent.getHitPoints() > 0 && this.getHitPoints() > 0) {
            this.attack(opponent);
            opponent.attack(this);
       }
       return this.hitPoints;
   }

   public boolean run(){
       if (Math.random()*2 == 1) {
           return true;
       }
       return false;
    }

   public String getName() {
       return name;
   }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getExp() {
        return exp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}