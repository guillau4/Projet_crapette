package graphicInterface;


import javax.swing.JFrame;
import java.io.IOException;

public class Fenetre extends JFrame {

    public Fenetre() throws IOException {
        this.setTitle("Crapette Game");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(new GameInterface());
        this.setVisible(true);
    }
}
