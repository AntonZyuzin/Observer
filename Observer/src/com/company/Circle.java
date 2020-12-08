package com.company;

import javax.swing.*;
import java.awt.*;


class Circle extends JPanel  {

    public void draw(Graphics2D g) {
        g.setColor(Color.red);
        g.fillOval(0, 0, 400, 400);
    }
}

