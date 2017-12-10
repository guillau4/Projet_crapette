package graphicInterface;


import javax.swing.*;
import java.io.IOException;

public class Fenetre extends JFrame {

    public Fenetre() throws IOException {
        this.setTitle("Crapette Game");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLayeredPane pane = getLayeredPane();
        pane.setBounds(0,0,this.getHeight(),this.getWidth());
        pane.add(new GameInterface(),0);
        pane.add(new CardInterface(),1);
        this.pack();
        this.setVisible(true);
    }
}
