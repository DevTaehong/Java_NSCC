package ca.nscc;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ProgramWindowFrame extends JFrame {

    private static int currentPage = 0;

    public ProgramWindowFrame () {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 600, 400);
        setTitle("Geoff's Swing Demo App Thingy");
        setLayout(new CardLayout(0,0));

        PageOnePanel page1 = new PageOnePanel();

        add(page1);
    }

    public static int getCurrentPage() {
        return currentPage;
    }

    public static void setCurrentPage(int currentPage) {
        currentPage = currentPage;
    }
}
