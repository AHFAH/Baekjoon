package Programmers;

import java.util.HashMap;
import java.util.Map;

public class P달리기경주 {
    public String[] main(String[] players, String[] callings) {

        int num = players.length;
        Map<String, Integer> ranking = new HashMap<>();

        for (int i = 0; i < num; i++) {
            ranking.put(players[i], i);
        }

        for (String player : callings) {
            int playerRanking = ranking.get(player);

            String frontPlayer = players[playerRanking-1];

            ranking.replace(frontPlayer, playerRanking);
            players[playerRanking] = frontPlayer;

            ranking.replace(player, playerRanking - 1);
            players[playerRanking - 1] = player;
        }

        return players;
    }
}
