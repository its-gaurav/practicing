package lld.combatarena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arena {
    private List<Player> players;

    public Arena() {
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void combat(Player p1, Player p2) {
        Random random = new Random();
        while(p1.getHealth()>0 && p2.getHealth()>0) {
            int turn = random.nextInt(2);
            int attackValue;
            int defendValue;
            int healthAffected;
            if (turn == 0) { // p1 attacks
                attackValue = p1.attack();
                defendValue = p2.defend();
                healthAffected = attackValue > defendValue ? attackValue - defendValue : 0;
                System.out.println(p1.getId()+" Attacks,"+" NetDamage: "+healthAffected);
                int newHealth = (healthAffected <= p2.getHealth()) ? p2.getHealth() - healthAffected : 0;
                p2.setHealth(newHealth);
            } else { // p2 attacks
                attackValue = p2.attack();
                defendValue = p1.defend();
                healthAffected = attackValue > defendValue ? attackValue - defendValue : 0;
                System.out.println(p2.getId()+" Attacks,"+" NetDamage: "+healthAffected);
                int newHealth = (healthAffected <= p1.getHealth()) ? p1.getHealth() - healthAffected : 0;
                p1.setHealth(newHealth);
            }
        }

        if (p1.getHealth() == 0) {
            System.out.println("Game Is Over." +p2.getId()+" wins"+", health : "+p2.getHealth());
        } else {
            System.out.println("Game Is Over." +p1.getId()+" wins"+", health : "+p1.getHealth());
        }
    }
}
