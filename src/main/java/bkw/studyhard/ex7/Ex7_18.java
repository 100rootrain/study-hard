package bkw.studyhard.ex7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_18 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener{
    public void actionPerformed(ActionEvent a){
        System.out.println("ActionEvent occurred!!!");

    }
}
