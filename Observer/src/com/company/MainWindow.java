package com.company;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private Button dp;

    public MainWindow() throws HeadlessException {
        dp = new Button();
        this.add(dp);
    }
}