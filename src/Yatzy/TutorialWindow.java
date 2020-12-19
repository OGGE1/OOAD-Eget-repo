package Yatzy;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

/**
 * Created by Oscar Norman <br>
 * Date: 2020-12-19   <br>
 * Time: 11:01   <br>
 * Project: OOAD VG UPPGIFT <br>
 */
public class TutorialWindow extends JFrame {

    private JPanel mainPanel = new JPanel();
    private JTextArea textArea = new JTextArea();

    public TutorialWindow() {
        this.add(mainPanel);
        setUpMainPanel();

        this.setSize(400, 200);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void setUpMainPanel() {
        this.textArea.setLineWrap(true);
        this.textArea.setEditable(false);
        this.textArea.append(text());
        textArea.setPreferredSize(new Dimension(380, 200));


        this.mainPanel.add(textArea);
    }

    public String text() {
        return "I detta spel ska du försöka få så mycket poäng som möjligt. Du ska alltså spara de tärningar som representerar vilken" +
                " omgång du är på. Är du på omgång ett så ska du spara så många ettor som möjligt!\n\n Får du fem styckna ettor"
                + " på omgång ett så får du Yatzy!\nOm du får Yatzy så blir du belönad med 10 extra poäng!";
    }

}
