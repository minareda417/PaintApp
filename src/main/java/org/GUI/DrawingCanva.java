package org.GUI;

import javax.swing.*;
import java.awt.*;

public class DrawingCanva extends JFrame {
    DrawingCanva() {
        super("canvas");
        setPreferredSize(new Dimension(1600, 1000));
        new Canvas() {
            public void paint(Graphics graphics) {
            }
        };
    }
}