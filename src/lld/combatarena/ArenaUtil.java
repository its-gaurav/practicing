package lld.combatarena;

public class ArenaUtil {
    public static void main(String[] args) {
        Player gaurav = new Player("ANONMS", 2,2, 90);
        Player ankit = new Player("ANKIT", 2,2, 90);

        Arena arena = new Arena();
        arena.addPlayer(gaurav);
        arena.addPlayer(ankit);

        arena.combat(gaurav, ankit);
    }
}
