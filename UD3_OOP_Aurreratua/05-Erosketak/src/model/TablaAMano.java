/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

/**
 *
 * @author arceredillo.adrian
 */
public class TablaAMano {

    public static void main(String[] args) {
        new TablaAMano();
    }

    public TablaAMano() {
        JFrame frame = new JFrame("Creating a Scrollable JTable!");
        JPanel panel = new JPanel();
        String data[][] = {{"001"},};
        String col[] = {"Roll"};
        JTable table = new JTable(data, col);
        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.yellow);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        JScrollPane pane = new JScrollPane(table);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        panel.add(pane);
        frame.add(panel);
        frame.setSize(xSize, ySize);

        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
