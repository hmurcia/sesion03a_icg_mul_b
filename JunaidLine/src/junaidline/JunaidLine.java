package junaidline;

// a simple line , after that you can see also a doted line 

import java.awt.*;
import javax.swing.*;
import java.awt.Graphics.*;
import java.awt.Graphics2D.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Event.*;
import java.awt.Component.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author junaid
 */
// Tomado de: https://stackoverflow.com/questions/5801734/how-to-draw-lines-in-java

public class JunaidLine extends JPanel {

    //private Graphics Graphics;
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        float[] dash1 = { 2f, 0f, 2f };

        g2d.drawLine(20, 40, 250, 40);
        BasicStroke bs1 = new BasicStroke(1, BasicStroke.CAP_BUTT,
                              BasicStroke.JOIN_ROUND, 1.0f, dash1, 2f);
        g2d.setStroke(bs1);
        g2d.drawLine(20, 80, 250, 80);
    }

    @Override
    public void paintComponent(Graphics g) {
        //super.paintComponent(g);
        doDrawing(g);
    }
}

class BasicStrokes extends JFrame {
    public BasicStrokes() {
        initUI();
    }

    private void initUI() {
        setTitle("line");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(new JunaidLine());
        setSize(280, 270);
        setLocationRelativeTo(null);
    }

    /**
    * @param args the command line arguments
    */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BasicStrokes bs = new BasicStrokes();
                bs.setVisible(true);
            }
        });
    }
}