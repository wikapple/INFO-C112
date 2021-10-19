/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
/**
 *
 * @author wikap
 */
public class Draw extends Canvas{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Canvas();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
     g.fillOval(400, 400, 300, 300);
    }
    
}
