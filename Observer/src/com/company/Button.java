package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Button extends JPanel implements MouseListener {
    private Circle b = new Circle();

    public Button() {
        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        b.draw(gr);
        gr.dispose();
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            Sub1.massage("Левая кнопка мыши");
            Sub2.history("ЛКМ");
        }
        repaint();
        if (e.getButton() == MouseEvent.BUTTON3) {

            Sub1.massage("Правая кнопка мыши");
            Sub2.history("ПКМ");
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
