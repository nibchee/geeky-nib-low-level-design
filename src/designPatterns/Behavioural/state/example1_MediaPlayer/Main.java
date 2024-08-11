package designPatterns.Behavioural.state.example1_MediaPlayer;

import designPatterns.Behavioural.state.example1_MediaPlayer.ui.Player;
import designPatterns.Behavioural.state.example1_MediaPlayer.ui.UI;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }

}
