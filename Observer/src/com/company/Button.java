package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Button extends JPanel implements MouseListener {
    private Circle b = new Circle();
    private ButtonObservable _buttonObservable;
    public Button() {
        this.addMouseListener(this);
        Sub1 sub1 = new Sub1();
        Sub2 sub2 = new Sub2();
        _buttonObservable = new ButtonObservable();
        _buttonObservable.addSub(sub1);
        _buttonObservable.addSub(sub2);
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
            _buttonObservable.updateSubs("ЛКМ");
        }
        repaint();
        if (e.getButton() == MouseEvent.BUTTON3) {
            _buttonObservable.updateSubs("ПКМ");
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
