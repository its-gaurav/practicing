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
            Player attackingPlayer = (turn == 0) ? p1 : p2;
            Player defendingPlayer = attackingPlayer == p1 ? p2 : p1;
            int attackValue = attackingPlayer.attack();
            int defendValue = defendingPlayer.defend();
            int healthAffected = attackValue > defendValue ? attackValue - defendValue : 0;
            System.out.println(attackingPlayer.getId()+" Attacks,"+" NetDamage: "+healthAffected);
            int newHealth = (healthAffected <= defendingPlayer.getHealth()) ? defendingPlayer.getHealth() - healthAffected : 0;
            defendingPlayer.setHealth(newHealth);
        }

        if (p1.getHealth() == 0) {
            System.out.println("Game Is Over. " +p2.getId()+" wins"+", health : "+p2.getHealth());
        } else {
            System.out.println("Game Is Over. " +p1.getId()+" wins"+", health : "+p1.getHealth());
        }
    }
}
