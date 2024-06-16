package lld.combatarena;

import java.util.Random;

public class Player {

    private String id;
    private int attack;
    private int strength;
    private int health;

    public Player(String id, int attack, int strength, int health) {
        this.id = id;
        this.attack = attack;
        this.strength = strength;
        this.health = health;
    }

    public int defend(){
        int diceValue = rollADice(); // rolled dice value
        return strength*diceValue;
    }

    public int attack(){
        int diceValue = rollADice(); // rolled dice value
        return attack*diceValue;
    }

    private static int rollADice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
